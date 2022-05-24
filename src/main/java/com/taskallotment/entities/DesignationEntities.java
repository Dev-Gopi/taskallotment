package com.taskallotment.entities;

import javax.persistence.*;

@Entity
@Table(name = "designation")
public class DesignationEntities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "designation_id")
    private long designation_id;
    @Column(name = "designation_as")
    private String designation_as;

    public long getDesignation_id() {
        return designation_id;
    }

    public void setDesignation_id(long designation_id) {
        this.designation_id = designation_id;
    }

    public String getDesignation_as() {
        return designation_as;
    }

    public void setDesignation_as(String designation_as) {
        this.designation_as = designation_as;
    }

    public DesignationEntities() {
    }

    public DesignationEntities(long designation_id, String designation_as) {
        this.designation_id = designation_id;
        this.designation_as = designation_as;
    }

    @Override
    public String toString() {
        return "DesignationEntities{" +
                "designation_id=" + designation_id +
                ", designation_as='" + designation_as + '\'' +
                '}';
    }
}
