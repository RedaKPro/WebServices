package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
@SpringBootApplication
public class JpaTestApplication {


	private String id;

	public static void main(String[] args) {
		SpringApplication.run(JpaTestApplication.class, args);
	}

	public void setId(String id) {
		this.id = id;
	}

	@Id
	public String getId() {
		return id;
	}
}
