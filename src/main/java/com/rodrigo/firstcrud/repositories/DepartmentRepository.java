package com.rodrigo.firstcrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rodrigo.firstcrud.entities.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{

}
