package com.example.tutoronline.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="learningTime")
public class LearningDateTime extends BaseEntity{

    @Column
    private Long postID;

    @Column
    private Integer day;

    @Column
    private Double time;

    public LearningDateTime(Long id, Date createdDate, Long createdBy, Date modifiedDate, Long modifiedBy, Long postID, Integer day, Double time) {
        super(id, createdDate, createdBy, modifiedDate, modifiedBy);
        this.postID = postID;
        this.day = day;
        this.time = time;
    }

    public LearningDateTime() {

    }

    public Long getPostID() {
        return postID;
    }

    public void setPostID(Long postID) {
        this.postID = postID;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public Double getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "LearningDateTime{" +
                "postID=" + postID +
                ", day=" + day +
                ", time=" + time +
                '}';
    }

    public void setTime(Double time) {
        this.time = time;
    }
}
