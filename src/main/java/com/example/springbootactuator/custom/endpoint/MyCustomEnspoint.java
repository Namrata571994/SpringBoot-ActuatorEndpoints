package com.example.springbootactuator.custom.endpoint;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import lombok.*;

@Component
@Endpoint(id="test",enableByDefault = true)
public class MyCustomEnspoint {
	
	@ReadOperation
	public Myresponce features() {
		return new Myresponce(123,"xyz","Active");
		
	}
}

 class Myresponce{
	
	
	private int id;
	private String name;
	private String status;
	
	public Myresponce(int id, String name, String status) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
	}

	public Myresponce() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}


