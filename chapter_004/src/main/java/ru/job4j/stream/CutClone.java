package ru.job4j.stream;

import ru.job4j.lambda.Attachment;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
                        new Address("Lisbon", "Yaroslavskaya", 30, 3),
                        new Address("Kiev", "Petlyry", 50, 5),
                        new Address("Washington", "Volodymirska", 40, 4),
                        new Address("Odessa", "Vasylkovskaya", 10, 1),
                        new Address("Vienna", "Arhangelska", 20, 2),
                        new Address("Lisbon", "Yaroslavskaya", 30, 3),
                        new Address("Kiev", "Petlyry", 50, 5)
                ));

        for (int i = 0; i < address.size(); i++) {
            pr.get(i).setAddress(address.get(i));
        }

        CutClone.sorted(address);

        System.out.println();
        System.out.println();
        System.out.println();

        for (Address add : address) {
            System.out.println(add.getCity());
        }

//        List<String> names = new ArrayList<>();
//        names.add("Ivan");
//        names.add("Stepan");
//        names.add("Petrucho");
//        names.add("Ivan");
//        names.stream()
//                .distinct()
//                .forEach(System.out::println);
//
//        System.out.println();
//        System.out.println();
//        System.out.println();
//
//        for (String add : names) {
//            System.out.println(add);
//        }

    }

    public static List<Address> sorted(List<Address> address) {
        address = address.stream().sorted((o1, o2) -> o1.getCity().compareTo(o2.getCity())).
                distinct().collect(Collectors.toCollection(ArrayList<Address>::new));
        for (Address add : address) {
            System.out.println(add.getCity());
        }
        return address;
    }
}
