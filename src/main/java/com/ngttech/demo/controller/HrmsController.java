package com.ngttech.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ngttech.demo.model.Employee;
import com.ngttech.demo.service.HrmsService;


@RestController
@RequestMapping("/rest")
public class HrmsController {

	@Autowired
	private HrmsService hrmsService;
	
	@PostMapping("/addEmployee")
	public ResponseEntity<?> saveEmployee(@RequestBody Employee emp) {
		return hrmsService.saveEmployee(emp);
	}

	@PostMapping("/addEmployees")
	public ResponseEntity<?> saveAllEmployees(@RequestBody List<Employee> empList) {
		return hrmsService.saveAllEmployees(empList);
	}

	@PutMapping("/updateEmployee")
	public ResponseEntity<?> updateEmployee(@RequestBody Employee emp) {
		return hrmsService.updateEmployee(emp);
	}
	
	@GetMapping("/getEmployeeById/{id}")
	public ResponseEntity<?> getEmployeeById(@PathVariable Integer id) {
		return hrmsService.getEmployeeById(id);
	}

	@GetMapping("/getAllEmployees")
	public ResponseEntity<?> getAllEmployees() {
		return hrmsService.getAllEmployees();
	}

}
