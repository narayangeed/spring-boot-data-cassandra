package com.ngttech.demo.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;

import com.ngttech.demo.model.Employee;

public interface ICDRRepository extends CassandraRepository<Employee, Integer>{

}
