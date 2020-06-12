package ru.job4j.stream;

import ru.job4j.lambda.Attachment;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CutClone {
    public static void main(String[] args) {
        List<Profile> pr = new ArrayList<>(
                Arrays.asList(
                        new Profile(),
                        new Profile(),
                        new Profile(),
                        new Profile(),
                        new Profile(),
                        new Profile(),
                        new Profile()
                ));
        List<Address> address = new ArrayList<>(
                Arrays.asList(
                        new Address("Kiev", "Petlyry", 50, 5),
                        new Address("Kiev", "Petlyry", 50, 5),
                        new Address("Odessa", "Vasylkovskaya", 10, 1),
                        new Address("Vienna", "Arhangelska", 20, 2),
                        new Address("Lisbon", "Yaroslavskaya", 30, 3),
                        new Address("Lisbon", "Yaroslavskaya", 30, 3),
                        new Address("Washington", "Volodymirska", 40, 4)
                ));

        for (int i = 0; i < address.size(); i++) {
            pr.get(i).setAddress(address.get(i));
        }

        Comparator<Address> comparat =  (o1, o2) -> o1.getCity().compareTo(o2.getCity());

        address.sort(comparat);

        for (Address add : address) {
            System.out.println(add.getCity());
        }
        System.out.println();
        System.out.println(address);
        System.out.println();
        address.stream().distinct().forEach(System.out::println);
    }
}
