package com.rodrigo.firstcrud.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rodrigo.firstcrud.entities.Department;
import com.rodrigo.firstcrud.repositories.DepartmentRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class DepartmentService {

	private DepartmentRepository depRepository;
	
	public List<Department> findAll(){
		return depRepository.findAll();
	}
	
	public Optional<Department> findbyId(Long id) {
		return depRepository.findById(id);
	}
	
	@Transactional
	public Department insert(Department dep) {
		return depRepository.save(dep);
	}
	
	@Transactional
	public void delete(Long id) {
		depRepository.deleteById(id);
	}
	
}
