package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.example.config.EmployeeConfig;
import com.example.dao.CustomerDaoImpl;
import com.example.dao.EmployeeDaoImpl;
import com.example.dto.Customer;
import com.example.dto.Employee;

@EnableWebMvc
@SpringBootApplication
public class DemoTrainingJdbcTemplateApplication {

	public static void main(String[] args) {
		// SpringApplication.run(DemoTrainingKoeingJdbcTemplateApplication.class, args);

		//ApplicationContext context = 
				SpringApplication.run(AppConfig.class,args);

		// remaining code will write after the break

		// perform operation @Employee

		// EmployeeDaoImpl employeeJDBCTemplate = (EmployeeDaoImpl)
		// context.getBean("objEmployee");

		// method call here
		// runEmployeeCRUD(employeeJDBCTemplate);

		// perform operation @Customer

		/*
		 * CustomerServiceImpl customerJDBCTemplate =
		 * (CustomerServiceImpl)context.getBean("objCustomer");
		 * runCustomerCRUD(customerJDBCTemplate);
		 */

	}
	/*
	 * private static void runCustomerCRUD(CustomerDaoImpl customerJDBCTemplate) {
	 * // TODO Auto-generated method stub
	 * 
	 * // create the customer data customerJDBCTemplate.setupDB();
	 * 
	 * // Inserting the records
	 * 
	 * System.out.println("------Records Creation of Customer--------");
	 * customerJDBCTemplate.createCustomer("Shivam", 22);
	 * customerJDBCTemplate.createCustomer("Kumar", 2);
	 * customerJDBCTemplate.createCustomer("Manish", 15);
	 * 
	 * System.out.println("------Listing Multiple Records of Customer--------");
	 * List<Customer> customer = customerJDBCTemplate.listCustomer(); for (Customer
	 * record : customer) { System.out.print("ID : " + record.getId());
	 * System.out.print(", Name : " + record.getName());
	 * System.out.println(", Age : " + record.getAge()); }
	 * 
	 * 
	 * System.out.println("----Updating Record with ID = 2 -----");
	 * employeeJDBCTemplate.update(2, 20);
	 * 
	 * System.out.println("----Listing Record with ID = 2 -----"); Employee employee
	 * = employeeJDBCTemplate.getEmployee(2); System.out.print("ID : " +
	 * employee.getId()); System.out.print(", Name : " + employee.getName());
	 * System.out.println(", Age : " + employee.getAge());
	 * 
	 * 
	 * }
	 * 
	 * public static void runEmployeeCRUD(EmployeeDaoImpl employeeJDBCTemplate) {
	 * 
	 * // create the employee data
	 * 
	 * employeeJDBCTemplate.setupDB();
	 * 
	 * System.out.println("------Records Creation--------");
	 * employeeJDBCTemplate.create("siddu", 11); employeeJDBCTemplate.create("bano",
	 * 2); employeeJDBCTemplate.create("gridhar", 15);
	 * 
	 * System.out.println("------Listing Multiple Records--------"); List<Employee>
	 * employees = employeeJDBCTemplate.listEmployees(); for (Employee record :
	 * employees) { System.out.print("ID : " + record.getId());
	 * System.out.print(", Name : " + record.getName());
	 * System.out.println(", Age : " + record.getAge()); }
	 * 
	 * 
	 * System.out.println("----Updating Record with ID = 2 -----");
	 * employeeJDBCTemplate.update(2, 20);
	 * 
	 * System.out.println("----Listing Record with ID = 2 -----"); Employee employee
	 * = employeeJDBCTemplate.getEmployee(2); System.out.print("ID : " +
	 * employee.getId()); System.out.print(", Name : " + employee.getName());
	 * System.out.println(", Age : " + employee.getAge());
	 * 
	 * 
	 * }
	 */
}
