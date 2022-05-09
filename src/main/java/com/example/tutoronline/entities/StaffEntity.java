package com.example.tutoronline.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="staff")
public class StaffEntity extends BaseEntity{

    @Column
    private Integer salary;

    @Column
    private Integer level;

    @Column
    private Integer status;

    public StaffEntity(Long id, Date createdDate, Long createdBy, Date modifiedDate, Long modifiedBy, Integer salary, Integer level, Integer status) {
        super(id, createdDate, createdBy, modifiedDate, modifiedBy);
        this.salary = salary;
        this.level = level;
        this.status = status;
    }

    public StaffEntity() {

    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "StaffEntity{" +
                "salary=" + salary +
                ", level=" + level +
                ", status=" + status +
                '}';
    }
}
