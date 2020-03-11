package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.EmployeeDaoImpl;
import com.example.dto.Employee;

@Service
public class EmployeeSericeImpl implements EmployeeService {

	@Autowired
	private EmployeeDaoImpl employeeSericeImpl;

	@Override
	public void createEmployeeService(String name, Integer age) {
		employeeSericeImpl.create(name, age);
	}

	@Override
	public Employee getEmployeeService(Integer id) {
	return employeeSericeImpl.getEmployee(id);
	}

	@Override
	public List<Employee> listEmployeeService() {
		
	return employeeSericeImpl.listEmployees();
	}

	@Override
	public void deleteEmployeeService(Integer id) {
		// TODO Auto-generated method stub
	employeeSericeImpl.delete(id);
	return;
	}

	@Override
	public void updateEmployeeService(Integer id, Integer age) {
		// TODO Auto-generated method stub

	}

}
