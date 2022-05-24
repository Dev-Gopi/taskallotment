package com.taskallotment.repository;

import com.taskallotment.entities.TaskAllotmentEntities;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskAllotmentRepository extends JpaRepository<TaskAllotmentEntities, Long> {
}
