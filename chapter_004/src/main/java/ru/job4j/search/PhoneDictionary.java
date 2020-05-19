package ru.job4j.search;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Class PhoneDictionary. This class describes how we can use the phone dictionary of the Persons.
 * @author Kovtun Konstantin (kovtun.kostya@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class PhoneDictionary {
    private List<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public List<Person> find(String key) {

//        Predicate<Person> combine = k -> {
//            k.getName().contains(key);
//            k.getSurname().contains(key);
//            k.getPhone().contains(key);
//            k.getPhone().contains(key);
//            k.getAddress().contains(key);
//
//        };

        ArrayList<Person> result = new ArrayList<>();

//        for (Person person : persons) {
//            if (combine.test(person)) {
//                result.add(person);
//            }
//        }

//        for (int i = 0; i < result.size(); i++) {
//            if (result.size() == 0) {
//                System.out.println("Collections empty!!!!!!!");
//            } else {
//                System.out.print(result.get(i).getName());
//                System.out.print(result.get(i).getSurname());
//                System.out.print(result.get(i).getPhone());
//                System.out.print(result.get(i).getAddress());
//            }
//            System.out.println();
//        }

        return result;
    }

    /**
     * Main
     * @param args - args.
     */
    public static void main(String[] args) {

//        PhoneDictionary persn = new PhoneDictionary();
//
//        persn.add(new Person("name1", "surname1", "phone1", "adderss1"));
//        persn.add(new Person("name20", "surname2", "phone20", "adderss20"));
//        persn.add(new Person("name30", "surname30", "phone5", "adderss50"));
//        persn.add(new Person("name1", "surname40", "phone40", "adderss+100500"));
//        persn.add(new Person("name70", "surname70", "phone70", "adderss70"));
//
//        persn.find("name1");
//        persn.find("surname2");
//        persn.find("phone5");
//        persn.find("adderss+100500");
    }
}
