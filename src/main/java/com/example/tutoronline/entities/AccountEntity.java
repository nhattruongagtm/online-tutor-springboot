package com.example.tutoronline.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "account")
public class AccountEntity extends BaseEntity{

    @Column
    private String password;

    @Column
    private String forgotCode;

    @Column
    private String email;

    @Column
    private String displayName;

    @Column
    private String avatar;

    @Column
    private String phone;

    @Column
    private Date expireForgotCode;

    @Column
    private String district;

    @Column
    private String city;

    @Column
    private Integer type;

    @Column
    private Integer gender;


    public AccountEntity(Long id, Date createdDate, Long createdBy, Date modifiedDate, Long modifiedBy, String password, String forgotCode, String email, String displayName, String avatar, String phone, Date expireForgotCode, String district, String city, Integer type, Integer gender) {
        super(id, createdDate, createdBy, modifiedDate, modifiedBy);
        this.password = password;
        this.forgotCode = forgotCode;
        this.email = email;
        this.displayName = displayName;
        this.avatar = avatar;
        this.phone = phone;
        this.expireForgotCode = expireForgotCode;
        this.district = district;
        this.city = city;
        this.type = type;
        this.gender = gender;
    }

    public AccountEntity() {

    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getPassword() {
        return password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getForgotCode() {
        return forgotCode;
    }

    public void setForgotCode(String forgotCode) {
        this.forgotCode = forgotCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Date getExpireForgotCode() {
        return expireForgotCode;
    }

    public void setExpireForgotCode(Date expireForgotCode) {
        this.expireForgotCode = expireForgotCode;
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

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "AccountEntity{" +
                "password='" + password + '\'' +
                ", forgotCode='" + forgotCode + '\'' +
                ", email='" + email + '\'' +
                ", displayName='" + displayName + '\'' +
                ", avatar='" + avatar + '\'' +
                ", phone='" + phone + '\'' +
                ", expireForgotCode=" + expireForgotCode +
                ", district='" + district + '\'' +
                ", city='" + city + '\'' +
                ", type=" + type +
                ", gender=" + gender +
                '}';
    }
}
