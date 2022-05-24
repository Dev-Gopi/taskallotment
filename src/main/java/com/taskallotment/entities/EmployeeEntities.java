package com.taskallotment.entities;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class EmployeeEntities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private long employee_id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "designation_id", referencedColumnName = "designation_id")
    private DesignationEntities designationEntities;
    @Column(name = "name")
    private String name;
    @Column(name = "contact")
    private String contact;
    @Column(name = "address")
    private String address;
    @Column(name = "postal_code")
    private int postal_code;
    @Column(name = "start_date")
    private  String start_date;
    @Column(name = "end_date")
    private String end_date;
    @Column(name = "status")
    private String status;

    public long getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(long employee_id) {
        this.employee_id = employee_id;
    }

    public DesignationEntities getDesignationEntities() {
        return designationEntities;
    }

    public void setDesignationEntities(DesignationEntities designationEntities) {
        this.designationEntities = designationEntities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(int postal_code) {
        this.postal_code = postal_code;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public EmployeeEntities() {
    }

    public EmployeeEntities(long employee_id, DesignationEntities designationEntities, String name, String contact, String address, int postal_code, String start_date, String end_date, String status) {
        this.employee_id = employee_id;
        this.designationEntities = designationEntities;
        this.name = name;
        this.contact = contact;
        this.address = address;
        this.postal_code = postal_code;
        this.start_date = start_date;
        this.end_date = end_date;
        this.status = status;
    }

    @Override
    public String toString() {
        return "EmployeeEntities{" +
                "employee_id=" + employee_id +
                ", designationEntities=" + designationEntities +
                ", name='" + name + '\'' +
                ", contact='" + contact + '\'' +
                ", address='" + address + '\'' +
                ", postal_code=" + postal_code +
                ", start_date='" + start_date + '\'' +
                ", end_date='" + end_date + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
