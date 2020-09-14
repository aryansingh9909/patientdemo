package com.patientdemo.model;

import java.util.Date;

public class Patient {
    private String _id;
    private String fname;
    private String lname;
    private String gender;
    private Date dob;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Object getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Patient [_id=" + _id + ", fname=" + fname + ", lname=" + lname + ", gender=" + gender + ", dob=" + dob + "]";
    }

    
    
}