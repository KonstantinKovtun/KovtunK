package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Profile {
    private Address address;

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return this.address;
    }

    List<Address> collect(List<Profile> profiles) {
        List<Address> list = profiles.stream()
                .map(profile -> profile.getAddress()).sorted((o1, o2) -> o1.getCity().compareTo(o2.getCity()))
                .distinct()
                .collect(Collectors.toList());
        return list;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (!(obj instanceof Profile)) {
//            return false;
//        }
//
//        Profile profile = (Profile) obj;
//
//        return this.getAddress().equals(profile.getAddress());
//    }
//
//    @Override
//    public int hashCode() {
//        final int prime = 31;
//        int result = 1;
//        result = prime * result + ((address == null) ? 0 : address.hashCode());
//        return result;
//    }
}
