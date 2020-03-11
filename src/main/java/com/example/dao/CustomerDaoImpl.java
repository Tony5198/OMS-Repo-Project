package com.example.dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.dto.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDAO {
	// create the reference of logger here

	Logger logger = LoggerFactory.getLogger(EmployeeDaoImpl.class);

	// DI injection of JDBCTemplate

	@Autowired
	private JdbcTemplate jdbcTemplateObject;

	public void setupDB() {

		//jdbcTemplateObject.execute("DROP TABLE customer IF EXISTS");

		jdbcTemplateObject.execute("CREATE TABLE customer" + "(" + "name VARCHAR(255), age INT, id SERIAL)");
	}

	@Override
	@Transactional
	public void createCustomer(String name, Integer age) {
		// TODO Auto-generated method stub

		String SQL = "insert into customer (name, age) values (?, ?)";

		jdbcTemplateObject.update(SQL, name, age);
		logger.debug("Created Record Name = " + name + " Age =" + age);
		return;

	}

	@Override
	public Customer getCustomer(Integer id) {
		String SQL = "select * from customer where id = ?";
		Customer customer = jdbcTemplateObject.queryForObject(SQL, new Object[] { id }, new CustomerMapper());

		logger.debug("value : ", jdbcTemplateObject.queryForObject(SQL, new Object[] { id }, new CustomerMapper()));

		logger.debug("Value of emp ---->" + customer.toString());
		return customer;
	}

	@Override
	
	public List<Customer> listCustomer() {
		String SQL = "select * from customer";
		List<Customer> customer = jdbcTemplateObject.query(SQL, new CustomerMapper());
		logger.debug("in debug");
		return customer;
	}

	@Override
	@Transactional
	public void deleteCustomer(Integer id) {
		// TODO Auto-generated method stub

		String SQL = "delete from customer where id = ?";
		jdbcTemplateObject.update(SQL, id);

		logger.debug("DELETED : " + id);
		return;
	}

	@Override
	@Transactional
	public void updateCustomer(Integer id, Integer age) {
		// TODO Auto-generated method stub
		String SQL = "update customer set age = ? where id = ?";
		jdbcTemplateObject.update(SQL, age, id);
		logger.debug("Record updated : " + id);
		return;

	}

}
