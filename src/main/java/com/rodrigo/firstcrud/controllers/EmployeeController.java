package com.rodrigo.firstcrud.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rodrigo.firstcrud.entities.Employee;
import com.rodrigo.firstcrud.services.EmployeeService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(value = "/employees")
@AllArgsConstructor
public class EmployeeController {

	private EmployeeService empService;
	
	@GetMapping
	public ResponseEntity<List<Employee>> findAll(){
		return ResponseEntity.ok(empService.findAll());
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Optional<Employee>> findById(@PathVariable Long id){
		return ResponseEntity.ok(empService.findById(id));
	}
	
	@PostMapping
	public ResponseEntity<Employee> insert(@RequestBody Employee emp){
		return new ResponseEntity<>(empService.insert(emp), HttpStatus.CREATED);
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<Employee> update(@RequestBody Employee emp, @PathVariable Long id){
		emp.setId(id);
		return ResponseEntity.ok(empService.insert(emp));
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id){
		empService.delete(id);
		return ResponseEntity.noContent().build();
	}
}

