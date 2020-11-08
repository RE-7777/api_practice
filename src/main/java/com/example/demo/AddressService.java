package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class AddressService {
    @Autowired
    public static Address findKawasaki() {
        return new Address("10", "川崎");     
    }

    @Autowired
    public static Address findYokohama() {
        return new Address("20", "横浜");     
    }
    
}
