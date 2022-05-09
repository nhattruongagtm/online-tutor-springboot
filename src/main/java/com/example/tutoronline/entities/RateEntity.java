package com.example.tutoronline.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="rate")
public class RateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Long classID;

    @Column
    private Long studentID;

    @Column
    private Date createdDate;

    @Column
    private Integer star;

    @Column
    private String note;

    public RateEntity(Long id, Long classID, Long studentID, Date createdDate, Integer star, String note) {
        this.id = id;
        this.classID = classID;
        this.studentID = studentID;
        this.createdDate = createdDate;
        this.star = star;
        this.note = note;
    }

    public RateEntity() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getClassID() {
        return classID;
    }

    public void setClassID(Long classID) {
        this.classID = classID;
    }

    public Long getStudentID() {
        return studentID;
    }

    public void setStudentID(Long studentID) {
        this.studentID = studentID;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Integer getStar() {
        return star;
    }

    public void setStar(Integer star) {
        this.star = star;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "RateEntity{" +
                "id=" + id +
                ", classID=" + classID +
                ", studentID=" + studentID +
                ", createdDate=" + createdDate +
                ", star=" + star +
                ", note='" + note + '\'' +
                '}';
    }
}
