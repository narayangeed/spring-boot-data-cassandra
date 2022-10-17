package com.ngttech.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.cassandra.repository.config.EnableReactiveCassandraRepositories;

@SpringBootApplication
@EnableReactiveCassandraRepositories
public class SpringBootDataCassandraApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDataCassandraApplication.class, args);
	}

}
