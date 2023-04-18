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

import com.rodrigo.firstcrud.entities.Department;
import com.rodrigo.firstcrud.services.DepartmentService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/departments")
public class DepartmentController {
	
	private DepartmentService depService;
	
	@GetMapping
	private ResponseEntity<List<Department>> findAll(){
		return ResponseEntity.ok(depService.findAll());
	}
	
	@GetMapping(value = "/{id}")
	private ResponseEntity<Optional<Department>> findById(@PathVariable Long id){
		return ResponseEntity.ok(depService.findbyId(id));
	}
	
	@PostMapping
	private ResponseEntity<Department> insert(@RequestBody Department dep){
		return new ResponseEntity<>(depService.insert(dep), HttpStatus.CREATED);
	}
	
	@PutMapping(value = "/{id}")
	private ResponseEntity<Department> update(@RequestBody Department dep, @PathVariable Long id){
		dep.setId(id);
		return ResponseEntity.ok(depService.insert(dep));
	}
	
	@DeleteMapping(value = "/{id}")
	private ResponseEntity<Void> delete(@PathVariable Long id){
		depService.delete(id);
		return ResponseEntity.noContent().build();
	}
}
