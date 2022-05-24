package com.taskallotment.repository;

import com.taskallotment.entities.ProjectEntities;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<ProjectEntities, Long> {
}
