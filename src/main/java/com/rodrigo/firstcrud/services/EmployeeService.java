package com.rodrigo.firstcrud.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rodrigo.firstcrud.entities.Employee;
import com.rodrigo.firstcrud.repositories.EmployeeRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployeeService {

	private EmployeeRepository empRepository;
	
	public List<Employee> findAll(){
		return empRepository.findAll();
	}
	
	public Optional<Employee> findById(Long id) {
		return empRepository.findById(id);
	}
	@Transactional
	public Employee insert(Employee emp) {
		return empRepository.save(emp);
	}
	
	@Transactional
	public void delete(Long id) {
		empRepository.deleteById(id);
	}
	
}
