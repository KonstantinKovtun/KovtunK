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
//        Predicate<Person> name = new Predicate<Person>() {
//            @Override
//            public boolean test(Person person) {
//                person.getName().contains(key);
//                return false;
//            }
//        };
        Predicate<Person> name = k -> k.getName().contains(key);
        Predicate<Person> surname = k -> k.getSurname().contains(key);
        Predicate<Person> phone = k -> k.getPhone().contains(key);
        Predicate<Person> address = k -> k.getAddress().contains(key);
        Predicate<Person> tcombine = k -> name.or(surname).or(phone).or(address).test(k);


        ArrayList<Person> result = new ArrayList<>();

        for (Person person : persons) {
            if (tcombine.test(person)) {
                result.add(person);
            }
        }

        for (int i = 0; i < result.size(); i++) {
            if (result.size() == 0) {
                System.out.println("Collections empty!!!!!!!");
            } else {
                System.out.print(result.get(i).getName() + " ");
                System.out.print(result.get(i).getSurname() + " ");
                System.out.print(result.get(i).getPhone() + " ");
                System.out.print(result.get(i).getAddress() + " ");
            }
            System.out.println();
        }

        return result;
    }
}
