package com.learning.pojo;

import lombok.Data;

@Data
public class MobileNumber {
    private String number;

    public MobileNumber(String number) {
        this.number = number;
    }
}
