package com.taskallotment.repository;

import com.taskallotment.entities.EmployeeEntities;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeEntities, Long> {
}
