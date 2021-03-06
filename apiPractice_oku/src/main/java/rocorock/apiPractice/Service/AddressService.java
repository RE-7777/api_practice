package rocorock.apiPractice.Service;

import org.springframework.beans.factory.annotation.Autowired;

import rocorock.apiPractice.Entity.Address;


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
    //@Autowired
    public static Address findKawasaki() {
        return new Address("10", "川崎");     
    }

    //@Autowired
    public static Address findYokohama() {
        return new Address("20", "横浜");     
    }
    
}
