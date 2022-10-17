package com.ngttech.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ngttech.demo.model.Employee;
import com.ngttech.demo.repository.ICDRRepository;

@Service
public class HrmsService {
		
	@Autowired
	private ICDRRepository cdrRepo;
	
	public ResponseEntity<?> saveEmployee(Employee emp) {		
		cdrRepo.insert(emp);		
		System.out.println("Inserted Object : "+emp.toString());
		return new ResponseEntity<>("Employee saved : "+emp.getEmployeeId(), HttpStatus.OK);
	}
	
	public ResponseEntity<?> saveAllEmployees(List<Employee> empList) {		
		cdrRepo.insert(empList);
		System.out.println("Inserted Employees are  : ");
		empList.stream().forEach(e -> e.getEmployeeId());
		return new ResponseEntity<>("Employee saved count: "+empList.stream().count(), HttpStatus.OK);
	}
	
	public ResponseEntity<?> updateEmployee(Employee emp) {		
		cdrRepo.save(emp);		
		System.out.println("Inserted Object : "+emp.toString());
		return new ResponseEntity<>("Employee updated : "+emp.getEmployeeId(), HttpStatus.OK);
	}
	
	public ResponseEntity<?> getEmployeeById(Integer id) {		
		Optional<Employee> emp = cdrRepo.findById(id);
		if(emp.isPresent()) {
			System.out.println("fetched Object : "+emp.get().toString());
			return ResponseEntity.ok().body(emp.get());
		} else {
			return ResponseEntity.noContent().build();
		}
		
	}
	
	public ResponseEntity<?> getAllEmployees() {		
		List<Employee> emp = cdrRepo.findAll();
		System.out.println("fetched Object : "+emp.toString());
		return ResponseEntity.ok().body(emp);
	}

}
