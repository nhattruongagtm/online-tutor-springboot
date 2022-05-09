package com.example.tutoronline.entities;

import javax.persistence.*;

@Entity
@Table(name="registerArea")
public class RegisterArea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cityID;

    @Column
    private Long districtID;


    @Column
    private Long tutorID;

    public RegisterArea(Long cityID, Long districtID, Long tutorID) {
        this.cityID = cityID;
        this.districtID = districtID;
        this.tutorID = tutorID;
    }

    public RegisterArea() {

    }

    public Long getCityID() {
        return cityID;
    }

    public void setCityID(Long cityID) {
        this.cityID = cityID;
    }

    public Long getDistrictID() {
        return districtID;
    }

    public void setDistrictID(Long districtID) {
        this.districtID = districtID;
    }

    public Long getTutorID() {
        return tutorID;
    }

    public void setTutorID(Long tutorID) {
        this.tutorID = tutorID;
    }

    @Override
    public String toString() {
        return "RegisterArea{" +
                "cityID=" + cityID +
                ", districtID=" + districtID +
                ", tutorID=" + tutorID +
                '}';
    }
}
