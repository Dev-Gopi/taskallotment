package com.taskallotment.entities;

import javax.persistence.*;

@Entity
@Table(name = "project")
public class ProjectEntities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "project_id")
    private long project_id;
    @Column(name = "project_name")
    private String project_name;

    public long getProject_id() {
        return project_id;
    }

    public void setProject_id(long project_id) {
        this.project_id = project_id;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public ProjectEntities() {
    }

    public ProjectEntities(long project_id, String project_name) {
        this.project_id = project_id;
        this.project_name = project_name;
    }

    @Override
    public String toString() {
        return "ProjectEntities{" +
                "project_id=" + project_id +
                ", project_name='" + project_name + '\'' +
                '}';
    }
}
