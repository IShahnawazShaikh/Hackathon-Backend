package com.btalent.repository;

import com.btalent.models.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity,String> {
    Optional<EmployeeEntity> findByEmail(String empId);
}
