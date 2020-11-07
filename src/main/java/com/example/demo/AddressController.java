package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("api/test")
public class AddressController {
    @GetMapping
    List<Address> getItems(@RequestParam("postAddress") String postAddress) {
        List<Address> address = null;
        if (postAddress.equals("1101")) {
            address = AddressService.findKawasaki();
        } else {
            address = AddressService.findYokohama();
        }
        return address;
    }

}