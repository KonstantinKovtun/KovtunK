package ru.job4j.search;

/**
 * Class Person. This class describes the information of a Person.
 * @author Kovtun Konstantin (kovtun.kostya@gmail.com)
 * @version $Id$
 * @since 17.05.2020
 */
public class Person {

    /**
     * Contains the name of the Person.
     */
    private String name;

    /**
     * Contains the surname of the Person.
     */
    private String surname;

    /**
     * Contains the phone of the Person.
     */
    private String phone;

    /**
     * Contains the address of the Person.
     */
    private String address;

    /**
     * The constructor Person. Build the object of the Person.
     * @param name the name of the Person.
     * @param surname the surname of the Person.
     * @param phone the steps of the Person.
     * @param address the steps of the Person.
     */
    public Person(String name, String surname, String phone, String address) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.address = address;
    }

    /**
     * Method getName.
     * @return name of the Person.
     */
    public String getName() {
        return name;
    }

    /**
     * Method getSurname.
     * @return surname of the Person.
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Method getPhone.
     * @return phone of the Person.
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Method getAddress.
     * @return address of the Person.
     */
    public String getAddress() {
        return address;
    }
}
