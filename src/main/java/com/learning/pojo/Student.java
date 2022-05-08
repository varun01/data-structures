package com.learning.pojo;

import lombok.Data;

import java.util.List;

@Data
public class Student {
    private String name;
    private int age;
    private Address address;
    private List<MobileNumber> mobileNumbers;
    private String department;

    public Student(String name, int age, Address address, List<MobileNumber> mobileNumbers, String department) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.mobileNumbers = mobileNumbers;
        this.department = department;
    }
}
