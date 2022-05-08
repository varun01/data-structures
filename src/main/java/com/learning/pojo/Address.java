package com.learning.pojo;

import lombok.Data;

@Data
public class Address {
    private String zipcode;

    public Address(String zipcode) {
        this.zipcode = zipcode;
    }
}
