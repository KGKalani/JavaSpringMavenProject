package org.example.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NonAcademicStaff implements Employee {

    @Autowired
    private Address defaultAddress;

    public Address getDefaultAddress() {
        return defaultAddress;
    }

    public void setDefaultAddress(Address defaultAddress) {
        this.defaultAddress = defaultAddress;
    }

    @Override
    public String toString() {
        return "NonAcademicStaff{" +
                "nonAcademicStaffAddress=" + defaultAddress +
                '}';
    }
    @Override
    public void getEmployeeDetails() {
        System.out.println("NonAcademicStaff details");
    }
}
