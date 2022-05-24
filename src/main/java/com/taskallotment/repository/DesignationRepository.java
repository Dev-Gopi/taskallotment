package com.taskallotment.repository;

import com.taskallotment.entities.DesignationEntities;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DesignationRepository extends JpaRepository<DesignationEntities, Long> {
}
