package com.javaDemo.javaDemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.lang.annotation.Documented;

@Entity
@Table(name = "javaDemo")
public class Customers {
    @Id
    private Integer customerId;
    @Column(name = "companyName")
    private String companyName;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "billingAddress")
    private String billingAddress;
    @Column(name = "city")
    private String city;
    @Column(name = "stateOrProvince")
    private String stateOrProvince;
    @Column(name = "zipCode")
    private String zipCode;
    @Column(name = "email")
    private String email;
    @Column(name = "companyWebsite")
    private String companyWebsite;
    @Column(name = "phoneNumber")
    private String phoneNumber;
    @Column(name = "faxNumber")
    private String faxNumber;
    @Column(name = "shipAddress")
    private String shipAddress;
    @Column(name = "shipCity")
    private String shipCity;
    @Column(name = "shipStateOrProvince")
    private String shipStateOrProvince;
    @Column(name = "shipZipCode")
    private String shipZipCode;
    @Column(name = "shipZipCodeNumber")
    private String shipZipCodeNumber;


    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStateOrProvince() {
        return stateOrProvince;
    }

    public void setStateOrProvince(String stateOrProvince) {
        this.stateOrProvince = stateOrProvince;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompanyWebsite() {
        return companyWebsite;
    }

    public void setCompanyWebsite(String companyWebsite) {
        this.companyWebsite = companyWebsite;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public String getShipAddress() {
        return shipAddress;
    }

    public void setShipAddress(String shipAddress) {
        this.shipAddress = shipAddress;
    }

    public String getShipCity() {
        return shipCity;
    }

    public void setShipCity(String shipCity) {
        this.shipCity = shipCity;
    }

    public String getShipStateOrProvince() {
        return shipStateOrProvince;
    }

    public void setShipStateOrProvince(String shipStateOrProvince) {
        this.shipStateOrProvince = shipStateOrProvince;
    }

    public String getShipZipCode() {
        return shipZipCode;
    }

    public void setShipZipCode(String shipZipCode) {
        this.shipZipCode = shipZipCode;
    }

    public String getShipZipCodeNumber() {
        return shipZipCodeNumber;
    }

    public void setShipZipCodeNumber(String shipZipCodeNumber) {
        this.shipZipCodeNumber = shipZipCodeNumber;
    }
}
