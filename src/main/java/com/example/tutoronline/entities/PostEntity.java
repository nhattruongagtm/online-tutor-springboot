package com.example.tutoronline.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="post")
public class PostEntity extends BaseEntity{

    @Column
    private Integer type;

    @Column
    private String fullName;

    @Column
    private String phone;

    @Column
    private String title;

    @Column
    private String content;

    @Column
    private Long subjectID;

    @Column
    private Integer numberOfMembership;

    @Column
    private Integer formality;

    @Column
    private Long addressID;

    @Column
    private Long timeID;

    @Column
    private Long learningDate;

    @Column
    private Integer tuition;

    @Column
    private Long idAccount;

    @Column
    private int status;


    public PostEntity(Long id, Date createdDate, Long createdBy, Date modifiedDate, Long modifiedBy, Integer type, String fullName, String phone, String title, String content, Long subjectID, Integer numberOfMembership, Integer formality, Long addressID, Long timeID, Long learningDate, Integer tuition,Long idAccount, int status) {
        super(id, createdDate, createdBy, modifiedDate, modifiedBy);
        this.type = type;
        this.fullName = fullName;
        this.phone = phone;
        this.title = title;
        this.content = content;
        this.subjectID = subjectID;
        this.numberOfMembership = numberOfMembership;
        this.formality = formality;
        this.addressID = addressID;
        this.timeID = timeID;
        this.learningDate = learningDate;
        this.tuition = tuition;
        this.idAccount = idAccount;
        this.status = status;
    }

    public PostEntity() {

    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(Long subjectID) {
        this.subjectID = subjectID;
    }

    public Integer getNumberOfMembership() {
        return numberOfMembership;
    }

    public void setNumberOfMembership(Integer numberOfMembership) {
        this.numberOfMembership = numberOfMembership;
    }

    public Integer getFormality() {
        return formality;
    }

    public void setFormality(Integer formality) {
        this.formality = formality;
    }

    public Long getAddressID() {
        return addressID;
    }

    public void setAddressID(Long addressID) {
        this.addressID = addressID;
    }

    public Long getTimeID() {
        return timeID;
    }

    public void setTimeID(Long timeID) {
        this.timeID = timeID;
    }

    public Long getLearningDate() {
        return learningDate;
    }

    public void setLearningDate(Long learningDate) {
        this.learningDate = learningDate;
    }

    public Integer getTuition() {
        return tuition;
    }

    public void setTuition(Integer tuition) {
        this.tuition = tuition;
    }

    public Long getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(Long idAccount) {
        this.idAccount = idAccount;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "PostEntity{" +
                "type=" + type +
                ", fullName='" + fullName + '\'' +
                ", phone='" + phone + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", subjectID=" + subjectID +
                ", numberOfMembership=" + numberOfMembership +
                ", formality=" + formality +
                ", addressID=" + addressID +
                ", timeID=" + timeID +
                ", learningDate=" + learningDate +
                ", tuition=" + tuition +
                '}';
    }
}
