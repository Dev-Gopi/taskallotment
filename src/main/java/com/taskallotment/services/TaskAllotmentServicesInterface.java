package com.taskallotment.services;

import com.taskallotment.entities.TaskAllotmentEntities;

import java.util.List;

public interface TaskAllotmentServicesInterface {
    public List<TaskAllotmentEntities> getAllData();
    public TaskAllotmentEntities getDataById(long id);

    public TaskAllotmentEntities addData(TaskAllotmentEntities taskAllotmentEntities);

    public TaskAllotmentEntities updateDataById(TaskAllotmentEntities taskAllotmentEntities);

    public void deleteDataById(long id);
}
