package com.example.tutoronline.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "student")
public class StudentEntity extends BaseEntity{

    @Column
    private String homeAddress;

    @Column
    private String district;

    @Column
    private String city;

    @Column
    private Integer status;

    public StudentEntity(Long id, Date createdDate, Long createdBy, Date modifiedDate, Long modifiedBy, String homeAddress, String district, String city, Integer status) {
        super(id, createdDate, createdBy, modifiedDate, modifiedBy);
        this.homeAddress = homeAddress;
        this.district = district;
        this.city = city;
        this.status = status;
    }

    public StudentEntity() {
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "homeAddress='" + homeAddress + '\'' +
                ", district='" + district + '\'' +
                ", city='" + city + '\'' +
                ", status=" + status +
                '}';
    }
}
