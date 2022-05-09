package com.example.tutoronline.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="class")
public class ClassEntity extends BaseEntity{

    @Column
    private String name;

    @Column
    private String description;

    @Column Integer status;

    public ClassEntity(Long id, Date createdDate, Long createdBy, Date modifiedDate, Long modifiedBy, String name, String description, Integer status) {
        super(id, createdDate, createdBy, modifiedDate, modifiedBy);
        this.name = name;
        this.description = description;
        this.status = status;
    }

    public ClassEntity() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ClassEntity{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", status=" + status +
                '}';
    }
}
