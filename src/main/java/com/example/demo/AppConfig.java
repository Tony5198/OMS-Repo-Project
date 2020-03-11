package com.example.demo;

import javax.sql.DataSource;

import org.h2.server.web.WebServlet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.example.config.CustomerConfig;
import com.example.config.EmployeeConfig;


@EnableAutoConfiguration
@Configuration
@ComponentScan({"com.example"})
@Import({ EmployeeConfig.class, CustomerConfig.class})
@PropertySource("classpath:database.properties")

public class AppConfig {

	
	/*
	 * @Bean ServletRegistrationBean h2servletRegistration(){
	 * ServletRegistrationBean registrationBean = new ServletRegistrationBean( new
	 * WebServlet()); registrationBean.addUrlMappings("/console/*"); return
	 * registrationBean;
	 * 
	 * }
	 */
	Logger logger = LoggerFactory.getLogger(AppConfig.class);
	
	@Autowired
	Environment environment;
	
	/*
	 * private final String URL = "url"; private final String USER = "username";
	 * private final String DRIVER = "driverClass"; private final String PASSWORD =
	 * "password";
	 * 
	 */
	@Bean
	@Autowired
	DataSource dataSource_mydb() {
	logger.debug("in data source");
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setUrl(environment.getProperty("url"));
		driverManagerDataSource.setUsername(environment.getProperty("user"));
		driverManagerDataSource.setPassword(environment.getProperty("password"));
		driverManagerDataSource.setDriverClassName(environment.getProperty("driverClass"));
		return driverManagerDataSource;
	}
	
	 @Bean
	 @Autowired
	 @Qualifier("datasource_mydb")
	 public JdbcTemplate jdbcTemplate(DataSource dataSource) {
	     	logger.debug("in data ");
	     return new JdbcTemplate(dataSource);
	 }

	 
}