package com.example.demo.Controller;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import com.example.demo.Entity.Address;
import com.example.demo.Exception.BusinessException;
import com.example.demo.Service.AddressService;

import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("search")
public class AddressController {
    @GetMapping
    Address getItems(@RequestParam("zipcode") String zipcode) {
        Address address = AddressService.findAddress(zipcode);
        return address; 
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(BusinessException.class)
    @ResponseBody
    public Map<String, Object> handleError() {
        Map<String, Object> errorMap = new HashMap<String, Object>();
        errorMap.put("message", "住所の値が不正です");
        errorMap.put("status", HttpStatus.BAD_REQUEST.toString());
        return errorMap;
    } 
}