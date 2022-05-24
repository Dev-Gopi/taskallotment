package com.taskallotment.controllers;

import com.taskallotment.entities.TaskAllotmentEntities;
import com.taskallotment.services.TaskAllotmentServicesInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskAllotmentControllers {

    @Autowired
    private TaskAllotmentServicesInterface taskAllotmentServicesInterface;

    @GetMapping("/")
    public String home(){
        return "Welcome to my REST Api Project";
    }

    //Get All Data From Database
    @GetMapping("/data")
    public List<TaskAllotmentEntities> getAllData(){
        return this.taskAllotmentServicesInterface.getAllData();
    }

    //Get All Data From Database by id
    @GetMapping("/data/{id}")
    public TaskAllotmentEntities getDataById(@PathVariable long id){
        return this.taskAllotmentServicesInterface.getDataById(id);
    }

    //add Data
    @PostMapping("/add")
    public TaskAllotmentEntities addData(@RequestBody TaskAllotmentEntities database){
        return this.taskAllotmentServicesInterface.addData(database);
    }

    //add Data
    @PutMapping("/update")
    public TaskAllotmentEntities updateDataById(@RequestBody TaskAllotmentEntities database){
        return this.taskAllotmentServicesInterface.updateDataById(database);
    }

    //add Data
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<HttpStatus> deleteDataById(@PathVariable long id){
        try {
            this.taskAllotmentServicesInterface.deleteDataById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
