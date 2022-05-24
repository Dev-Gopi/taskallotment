package com.taskallotment.entities;

import javax.persistence.*;

@Entity
@Table(name = "task_allotment")
public class TaskAllotmentEntities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "task_allotment_id")
    private long task_allotment_id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "task_id", referencedColumnName = "task_id")
    private TaskEntities taskEntities;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "employee_id", referencedColumnName = "employee_id")
    private EmployeeEntities employeeEntities;
    @Column(name = "ranking")
    private  String ranking;
    @Column(name = "feedback")
    private String feedback;
    @Column(name = "status")
    private String status;
    @Column(name = "start_date")
    private  String start_date;
    @Column(name = "end_date")
    private String end_date;

    public long getTask_allotment_id() {
        return task_allotment_id;
    }

    public void setTask_allotment_id(long task_allotment_id) {
        this.task_allotment_id = task_allotment_id;
    }

    public TaskEntities getTaskEntities() {
        return taskEntities;
    }

    public void setTaskEntities(TaskEntities taskEntities) {
        this.taskEntities = taskEntities;
    }

    public EmployeeEntities getEmployeeEntities() {
        return employeeEntities;
    }

    public void setEmployeeEntities(EmployeeEntities employeeEntities) {
        this.employeeEntities = employeeEntities;
    }

    public String getRanking() {
        return ranking;
    }

    public void setRanking(String ranking) {
        this.ranking = ranking;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public TaskAllotmentEntities() {
    }

    public TaskAllotmentEntities(long task_allotment_id, TaskEntities taskEntities, EmployeeEntities employeeEntities, String ranking, String feedback, String status, String start_date, String end_date) {
        this.task_allotment_id = task_allotment_id;
        this.taskEntities = taskEntities;
        this.employeeEntities = employeeEntities;
        this.ranking = ranking;
        this.feedback = feedback;
        this.status = status;
        this.start_date = start_date;
        this.end_date = end_date;
    }

    @Override
    public String toString() {
        return "TaskAllotmentEntities{" +
                "task_allotment_id=" + task_allotment_id +
                ", taskEntities=" + taskEntities +
                ", employeeEntities=" + employeeEntities +
                ", ranking='" + ranking + '\'' +
                ", feedback='" + feedback + '\'' +
                ", status='" + status + '\'' +
                ", start_date='" + start_date + '\'' +
                ", end_date='" + end_date + '\'' +
                '}';
    }
}


