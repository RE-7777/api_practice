package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class AddressService {
    @Autowired
    public static List<Address> findKawasaki() {
        return Arrays.asList(new Address("1101", "川崎"));     
    }

    @Autowired
    public static List<Address> findYokohama() {
        return Arrays.asList(new Address("1102", "横浜"));     
    }
    
    
}
