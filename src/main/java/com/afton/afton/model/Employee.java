package com.afton.afton.model;

import org.springframework.data.annotation.Id;

import java.util.List;

public class Employee {
    private String firstName;
    private String lastName;
    private String mobileNum;
    private String gmail;
    private String ssn;
    private List<EmpAddress> empAddress;

    public List<EmpAddress> getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(List<EmpAddress> empAddress) {
        this.empAddress = empAddress;
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

    public String getMobileNum() {
        return mobileNum;
    }

    public void setMobileNum(String mobileNum) {
        this.mobileNum = mobileNum;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", mobileNum='" + mobileNum + '\'' +
                ", gmail='" + gmail + '\'' +
                ", ssn='" + ssn + '\'' +
                ", empAddress=" + empAddress +
                '}';
    }
}
