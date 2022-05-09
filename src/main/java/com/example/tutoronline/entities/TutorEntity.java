package com.example.tutoronline.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "tutor")
public class TutorEntity extends BaseEntity{

    @Column
    private String position;

    @Column
    private String descriptionPosition;

    @Column
    private String description;

    @Column
    private Integer tuition;

    @Column
    private Integer status;


    public TutorEntity(Long id, Date createdDate, Long createdBy, Date modifiedDate, Long modifiedBy, String position, String descriptionPosition, String description, Integer tuition, Integer status) {
        super(id, createdDate, createdBy, modifiedDate, modifiedBy);
        this.position = position;
        this.descriptionPosition = descriptionPosition;
        this.description = description;
        this.tuition = tuition;
        this.status = status;
    }

    public TutorEntity() {

    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDescriptionPosition() {
        return descriptionPosition;
    }

    public void setDescriptionPosition(String descriptionPosition) {
        this.descriptionPosition = descriptionPosition;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getTuition() {
        return tuition;
    }

    public void setTuition(Integer tuition) {
        this.tuition = tuition;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "TutorEntity{" +
                "position='" + position + '\'' +
                ", descriptionPosition='" + descriptionPosition + '\'' +
                ", description='" + description + '\'' +
                ", tuition=" + tuition +
                ", status=" + status +
                '}';
    }
}
