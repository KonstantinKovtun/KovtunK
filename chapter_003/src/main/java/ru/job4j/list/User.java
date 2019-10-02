package ru.job4j.list;

public class User {
    private int id;
    private String name;
    private String city;

    public User(String name, String city, int id) {
        this.name = name;
        this.city = city;
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getCity() {
        return this.city;
    }
}
