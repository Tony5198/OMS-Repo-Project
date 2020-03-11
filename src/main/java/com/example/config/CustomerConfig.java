package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.CustomerDAO;
import com.example.dao.CustomerDaoImpl;

@Configuration
@ComponentScan({ "com.example" })
//@EnableTransactionManagement
public class CustomerConfig {

	/*
	 * @Bean(name = "objCustomer") public CustomerDaoImpl customer() { return new
	 * CustomerDaoImpl(); }
	 */

}
