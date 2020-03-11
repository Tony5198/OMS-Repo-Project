package com.example.dao;

import java.util.List;

import com.example.dto.Customer;


public interface CustomerDAO {


	public void createCustomer(String name, Integer age);

	public Customer getCustomer(Integer id);

	public List<Customer> listCustomer();

	public void deleteCustomer(Integer id);

	public void updateCustomer(Integer id, Integer age);
}
