package com.taskallotment.entities;

import javax.persistence.*;

@Entity
@Table(name = "task")
public class TaskEntities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "task_id")
    private long task_id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "project_id", referencedColumnName = "project_id")
    private ProjectEntities projectEntities;
    @Column(name = "task_description")
    private String task_description;

    public long getTask_id() {
        return task_id;
    }

    public void setTask_id(long task_id) {
        this.task_id = task_id;
    }

    public ProjectEntities getProjectEntities() {
        return projectEntities;
    }

    public void setProjectEntities(ProjectEntities projectEntities) {
        this.projectEntities = projectEntities;
    }

    public String getTask_description() {
        return task_description;
    }

    public void setTask_description(String task_description) {
        this.task_description = task_description;
    }

    public TaskEntities() {
    }

    public TaskEntities(long task_id, ProjectEntities projectEntities, String task_description) {
        this.task_id = task_id;
        this.projectEntities = projectEntities;
        this.task_description = task_description;
    }

    @Override
    public String toString() {
        return "TaskEntities{" +
                "task_id=" + task_id +
                ", projectEntities=" + projectEntities +
                ", task_description='" + task_description + '\'' +
                '}';
    }
}
