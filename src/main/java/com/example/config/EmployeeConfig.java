package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;


import com.example.dao.EmployeeDaoImpl;

@Configuration
@ComponentScan({ "com.example" })

public class EmployeeConfig {

	/*
	 * @Bean(name = "objEmployee") public EmployeeDaoImpl employee() { return new
	 * EmployeeDaoImpl(); }
	 */
}
