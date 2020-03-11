package com.example.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.ResourceAccessException;

import com.example.dao.EmployeeDAO;
import com.example.dao.EmployeeDaoImpl;
import com.example.dto.Customer;
import com.example.dto.Employee;
import com.example.services.EmployeeService;

@RestController
public class CustomerController {

	Logger logger = LoggerFactory.getLogger(EmployeeController.class);
	
	@Autowired
	private EmployeeService refEmpService;
	
	
	
	@RequestMapping(value="/fetch" , method = RequestMethod.GET)
	public List<Employee> getAll(){
		return refEmpService.listEmployeeService();
		
	}
	@RequestMapping(value="/employee/{id}", method = RequestMethod.GET)
	public Employee getEmployee(@PathVariable("id") Integer id) {
		logger.debug("working");
		return refEmpService.getEmployeeService(id);
	}
	
	@RequestMapping(value="/employee/delete/{id}", method =RequestMethod.DELETE)
	public ResponseEntity<Void> deleteEmployee(@PathVariable("id") Integer id) {
		try {
			logger.debug("In method delete");
			refEmpService.deleteEmployeeService(id);
			return ResponseEntity.ok().build();
		}
		catch(ResourceAccessException e) {
			logger.error("error*************"+e);
			return ResponseEntity.notFound().build();
		}

	}
	
	
	
	
	
	/*public ResponseEntity getCustomerbyId(@PathVariable("id") int id) {

	Employee employee = refEmpService.getEmployeeService(id);
	if (employee == null) {
		return new ResponseEntity("No employee found for ID " + id, HttpStatus.NOT_FOUND);
	}

	return new ResponseEntity(employee, HttpStatus.OK);
}*/
	
}
