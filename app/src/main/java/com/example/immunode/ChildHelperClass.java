package com.example.immunode;

public class ChildHelperClass {
    String childName, childAge, childDOB, childHospital;

    public String getChildName() {
        return childName;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }

    public String getChildAge() {
        return childAge;
    }

    public void setChildAge(String childAge) {
        this.childAge = childAge;
    }

    public String getChildDOB() {
        return childDOB;
    }

    public void setChildDOB(String childDOB) {
        this.childDOB = childDOB;
    }

    public String getChildHospital() {
        return childHospital;
    }

    public void setChildHospital(String childHospital) {
        this.childHospital = childHospital;
    }

    public ChildHelperClass(String childName, String childAge, String childDOB, String childHospital) {
        this.childName = childName;
        this.childAge = childAge;
        this.childDOB = childDOB;
        this.childHospital = childHospital;
    }

    public ChildHelperClass() {

    }
}
