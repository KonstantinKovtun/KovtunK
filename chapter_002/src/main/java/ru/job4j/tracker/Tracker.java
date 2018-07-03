package ru.job4j.tracker;

import java.util.Random;

/**
 * @version $Id$
 * @since 0.1
 */
public class Tracker {
    /**
     * Массив для хранение заявок.
     */
    private final Item[] items = new Item[5];
    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    private static final Random RN = new Random();

    public Item add(Item item) {
        item.setId(this.generatedId());
        this.items[position++] = item;
        return item;
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

    public void replace(String id, Item item) {
        for (int i = 0; i < items.length; i++) {
            if (this.items[i].getId().equals(id)) {
                this.items[i] = item;
            }
        }
    }

    public Item[] getAll() {
        Item[] result = new Item[this.position];
        for (int index = 0; index != this.position; index++) {
            result[index] = this.items[index];
        }
        return result;
    }
/*
    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        tracker.add(new Item("19", "Name1", "desc1", 121));
        tracker.add(new Item("29", "Name2", "desc2", 122));

        tracker.replace("19", new Item("555", "Name555", "desc555", 555));

        for (Item item : tracker.getAll()) {
            System.out.println(item.getId() + " " + item.getName() + " " + item.getDesc());
        }
    }
*/
}