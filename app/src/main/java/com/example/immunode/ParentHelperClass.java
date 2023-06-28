package com.example.immunode;

public class ParentHelperClass {

    String fatherName, fatherMobile, fatherAge, motherName, motherMobile, motherAge;

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getFatherMobile() {
        return fatherMobile;
    }

    public void setFatherMobile(String fatherMobile) {
        this.fatherMobile = fatherMobile;
    }

    public String getFatherAge() {
        return fatherAge;
    }

    public void setFatherAge(String fatherAge) {
        this.fatherAge = fatherAge;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getMotherMobile() {
        return motherMobile;
    }

    public void setMotherMobile(String motherMobile) {
        this.motherMobile = motherMobile;
    }

    public String getMotherAge() {
        return motherAge;
    }

    public void setMotherAge(String motherAge) {
        this.motherAge = motherAge;
    }

    public ParentHelperClass(String fatherName, String fatherMobile, String fatherAge, String motherName, String motherMobile, String motherAge) {
        this.fatherName = fatherName;
        this.fatherMobile = fatherMobile;
        this.fatherAge = fatherAge;
        this.motherName = motherName;
        this.motherMobile = motherMobile;
        this.motherAge = motherAge;
    }

    public ParentHelperClass() {
    }
}