package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

/**
 * Class Tracker contains an array elements of items and also makes some operation with items.
 * @author Konstantin
 * @version $Id$
 * @since 0.1
 */
public class Tracker {
    /**
     * An array which contains an items.
     */
    private final Item[] items = new Item[4];
    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    private static final Random RN = new Random();
    /**
     * A methods which adds a new item.
     * @param item, item value.
     * @return item, return an array of item.
     */
    public Item add(Item item) {
        item.setId(this.generatedId());
        this.items[position++] = item;
        return item;
    }
    /**
     * A methods which replace a new item with an old item.
     * @param id, new items' id.
     * @param item, new item.
     * @return boolean.
     */
    public boolean replace(String id, Item item) {
        for (int i = 0; i != this.position; i++) {
            if (this.items[i].getId().equals(id)) {
                this.items[i] = item;
                item.setId(id);
                return true;
            }
        }
        return false;
    }
    /**
     * A methods which deletes items from array.
     * @param id, new items' id.
     * @return boolean.
     */
    public boolean delete(String id) {
        boolean referenceIdResult = false;

        for (int i = 0; i < items.length; i++) {
            if (this.items[i].getId().equals(id)) {
                System.arraycopy(items, i + 1, items, i, items.length - 1 - i);
                position--;
                referenceIdResult = true;
            }
        }
        return referenceIdResult;
    }
    /**
     * A methods which gets all items from array.
     * @return boolean.
     */
    public Item[] findAll() {
        return Arrays.copyOf(items, position);
    }
    /**
     * A methods which finds items by key.
     * @param key, name of items' element.
     * @return item, an array of founded items in array.
     */
    public Item[] findByName(String key) {
        int count = 0;
        int index = 0;
        Item[] result = new Item[this.position];
        for (int i = 0; i < result.length; i++) {
            if (this.items[i].getName().equals(key)) {
                result[index++] = this.items[i];
                count++;
            }
        }
        return Arrays.copyOf(result, index);
    }
    /**
     * A methods which finds items by key.
     * @param id, id of items' element.
     * @return item, an array of founded items in array by id.
     */
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
    /**
     * A methods which generate id value.
     * @return id, return generated id for item parameter.
     */
    private String generatedId() {
        return String.valueOf(System.currentTimeMillis() + (RN.nextInt()));
    }

    public static void main(String[] args) {
        System.out.println("Hi");
    }
}