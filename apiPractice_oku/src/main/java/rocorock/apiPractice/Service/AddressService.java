package rocorock.apiPractice.Service;

import org.springframework.beans.factory.annotation.Autowired;

import rocorock.apiPractice.Entity.Address;


public class AddressService {
    //@Autowired
    public static Address findKawasaki() {
        return new Address("10", "川崎");     
    }

    //@Autowired
    public static Address findYokohama() {
        return new Address("20", "横浜");     
    }
    
}
