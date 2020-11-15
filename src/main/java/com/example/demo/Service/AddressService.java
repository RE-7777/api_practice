package com.example.demo.Service;

import java.util.Arrays;
import java.util.List;

import com.example.demo.Entity.Address;
import com.example.demo.Exception.BusinessException;

import org.springframework.beans.factory.annotation.Autowired;

public class AddressService {
    public static Address findAddress(String zipcode) {
        Address address;
        if (zipcode.equals("10")) {
            return address = AddressService.findKawasaki();
        } else if (zipcode.equals("20")) {
            return address = AddressService.findYokohama();
        } else {
            throw new BusinessException("message");
        }
    }
    @Autowired
    public static Address findKawasaki() {
        return new Address("10", "川崎");     
    }

    @Autowired
    public static Address findYokohama() {
        return new Address("20", "横浜");     
    }
    
}
