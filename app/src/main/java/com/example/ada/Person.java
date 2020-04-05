package com.example.ada;

public class Person {
    private String name, surname, middleName, phone, job;

    public String getJob() {
        return job;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public Person(String PerName, String PerSurname,String PerMiddleName,String PerPhone,String PerJob){
        name=PerName;
        surname=PerSurname;
        middleName=PerMiddleName;
        phone=PerPhone;
        job=PerJob;

    }
}
