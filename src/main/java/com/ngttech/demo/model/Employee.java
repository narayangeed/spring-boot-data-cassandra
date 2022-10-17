package com.ngttech.demo.model;

import java.util.List;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table
public class Employee {
	@PrimaryKey
	private Integer employeeId;
	private String name;
	private String gender;
	private Integer salary;
	//private Address address;
	//private List<Department> departments;
}
