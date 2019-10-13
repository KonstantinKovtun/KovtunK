package ru.job4j.tracker;

import com.sun.deploy.util.ArrayUtil;

import java.util.*;

/**
 * Class Tracker contains an array elements of items and also makes some operation with items.
 *
 * @author Konstantin
 * @version $Id$
 * @since 0.1
 */
public class Tracker {
    /**
     * An array which contains an items.
     */
    private final List<Item> items = new ArrayList<>(100);

    private static final Random RN = new Random();

    /**
     * A methods which adds a new item.
     *
     * @param item, item value.
     * @return item, return an array of item.
     */
    public Item add(Item item) {
        item.setId(this.generatedId());
        this.items.add(item);
        return item;
    }

    /**
     * A methods which replace a new item with an old item.
     *
     * @param id, new items' id.
     * @param item, new item.
     * @return boolean.
     */
    public boolean replace(String id, Item item) {
        for (int i = 0; i != this.items.size(); i++) {
            if (this.items.get(i).getId().equals(id)) {
                this.items.set(i, item);
                item.setId(id);
                return true;
            }
        }
        return false;
    }

    /**
     * A methods which deletes items from array.
     *
     * @param id, new items' id.
     * @return boolean.
     */
    public boolean delete(String id) {
        boolean referenceIdResult = false;

        for (int i = 0; i < items.size(); i++) {
            if (this.items.get(i) != null) {
                if (this.items.get(i).getId().equals(id)) {
                    this.items.remove(i);
                    referenceIdResult = true;
                    break;
                }
            } else {
                System.out.println("NULL!!!"); // If item's id doesn't match to current id.
                break;
            }
        }
        return referenceIdResult;
    }

    /**
     * A methods which gets all items from array.
     *
     * @return boolean.
     */

    public List<Item> findAll() {
        return this.items;
    }

    /**
     * A methods which finds items by key.
     *
     * @param key, name of items' element.
     * @return item, an array of founded items in array.
     */
    public List<Item> findByName(String key) {
        ArrayList<Item> result = new ArrayList<>();

        for (int i = 0; i < this.items.size(); i++) {
            if (this.items.get(i).getName().equals(key)) {
                result.add(this.items.get(i));
            }
        }
        return result;
    }

    /**
     * A methods which finds items by key.
     *
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
     *
     * @return id, return generated id for item parameter.
     */
    private String generatedId() {
        return String.valueOf(System.currentTimeMillis() + (RN.nextInt()));
    }
}