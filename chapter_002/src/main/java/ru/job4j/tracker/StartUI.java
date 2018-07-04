package ru.job4j.tracker;

import java.util.Arrays;

//Отображение данных, наше меню
public class StartUI {
    public static void main(String[] args) {

        Tracker tracker = new Tracker();
        tracker.add(new Item("19", "Name1", "desc1", 121));
        tracker.add(new Item("29", "Name2", "desc2", 122));
        tracker.add(new Item("39", "Name3", "desc3", 123));
        tracker.add(new Item("49", "Name4", "desc4", 124));
        tracker.add(new Item("59", "Name5", "desc5", 125));

        tracker.delete(("19"));
        for (Item item : tracker.getAll()) {
            System.out.println(item.getId() + " " + item.getName() + " " + item.getDesc());
        }
    }
}