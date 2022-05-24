package com.taskallotment.services;

import com.taskallotment.entities.TaskAllotmentEntities;
import com.taskallotment.repository.TaskAllotmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskAllotmentServices implements TaskAllotmentServicesInterface{

    @Autowired
    private TaskAllotmentRepository repo;
    @Override
    public List<TaskAllotmentEntities> getAllData() {
        return repo.findAll();
    }

    @Override
    public TaskAllotmentEntities getDataById(long id) {
        Optional<TaskAllotmentEntities> e = repo.findById(id);
        if(e.isPresent()){
            return e.get();
        }
        return null;
    }

    @Override
    public TaskAllotmentEntities addData(TaskAllotmentEntities taskAllotmentEntities) {
        repo.save(taskAllotmentEntities);
        return taskAllotmentEntities;
    }

    @Override
    public TaskAllotmentEntities updateDataById(TaskAllotmentEntities taskAllotmentEntities) {
        repo.save(taskAllotmentEntities);
        return taskAllotmentEntities;
    }

    @Override
    public void deleteDataById(long id) {
        repo.deleteById(id);
    }
}
