package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

/**
 * @version $Id$
 * @since 0.1
 */
public class Tracker {
    /**
     * Массив для хранение заявок.
     */
    private final Item[] items = new Item[4];
    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    private static final Random RN = new Random();
    /**
     * Метод добавленя новой заявки.
     */
    public Item add(Item item) {
        item.setId(this.generatedId());
        this.items[position++] = item;
        return item;
    }

    public void replace(String id, Item item) {
        for (int i = 0; i < items.length; i++) {
            if (this.items[i].getId().equals(id)) {
                this.items[i] = item;
            }
        }
    }

    public void delete(String id) {
        for (int i = 0; i < items.length; i++) {
            if (this.items[i].getId().equals(id)) {
                System.arraycopy(items, i + 1, items, i, items.length - 1 - i);
                position--;
                break;
            }
        }
    }

    public Item[] findAll() {
        Item[] result = new Item[this.position];
        for (int index = 0; index != this.position; index++) {
            result[index] = this.items[index];
        }
        return result;
    }

    public Item[] findByName(String key) {
        Item[] result = new Item[this.position];
        for (int i = 0; i < result.length; i++) {
            if (this.items[i].getName().equals(key)) {
                result[i] = this.items[i];
                break;
            }
        }
        return result;

    }

    protected Item findById(String id) {
        Item result = null;
        for (Item item : items) {
            if (item != null && item.getId().equals(id)) {
                result = item;
                break;
            }
        }
    return result;
    }

    String generatedId() {
        return String.valueOf(System.currentTimeMillis() + (RN.nextInt()));
    }

    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        tracker.add(new Item("19", "Name1", "desc1", 121));
        tracker.add(new Item("29", "Name2", "desc2", 122));
        tracker.add(new Item("39", "Name3", "desc3", 123));
        tracker.add(new Item("29", "Name2", "desc2", 122));

        tracker.findByName("Name2");

        Item[] res = new Item[tracker.items.length];

        for (int i = 0; i < res.length; i++) {
            if (res[i].getName().equals("Name2")) {
                System.out.println(res[i].getName());
            }
        }


        System.out.println();



        /*
        for (Item item : tracker.findAll()) {
            System.out.println(item.getId() + " " + item.getName() + " " + item.getDesc());
        }
        */
        /*
        System.out.println(tracker.findById("39").getId() + " " + tracker.findById("39").getName() + " "
         + tracker.findById("39").getDesc());
        */
        /*
        Item[] item = tracker.findByName("Name2");
        for (int i = 0; i < item.length; i++) {
            System.out.println(item[i].getId() + " " + item[i].getName() + " " + item[i].getDesc());
        }
        */

        /******delete()
        tracker.delete("29");
        for (Item item : tracker.findAll()) {
            System.out.println(item.getId() + " " + item.getName() + " " + item.getDesc());
        }
        */
        //System.out.println(item[0].getId() + " " + item[0].getName() + " " + item[0].getDesc());
        //System.out.println(tracker.findByName("Name2") + " " + item.getName() + " " + item.getDesc());
    }
}