package com.taskallotment.repository;

import com.taskallotment.entities.TaskEntities;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<TaskEntities, Long> {
}
