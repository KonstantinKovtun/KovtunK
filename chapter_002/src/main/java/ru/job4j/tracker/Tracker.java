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
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    private static final Random RN = new Random();

    /**
     * Метод реализаущий добавление заявки в хранилище
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
    private String generateId() {
        return String.valueOf(System.currentTimeMillis() + (RN.nextInt()));
    }
    public void replace(String id, Item item) {
        //Реализовать метод редактирование заявок.
    }
    public void update(Item item) {
        //Реализовать метод обновления.
    }
    public Item[] findAll() {
        //Реализовать метод поиска всех заявок.
        return items;
    }
    public Item findById(Item id) {
        //Реализовать метод поиска по индексу.
        return id;
    }
    public Item[] findByName(String key) {
        Item[] result = new Item[this.position];

        for (int i = 0 ; i < result.length; i++) {
            if (result[i].getName().equals(key)) {
                result[i] = this.items[i];
            }
            return result;
        }
        //Реализовать метод получение списка по имени.
        return items;
    }
    public void delete(String id) {
        //Реализовать метод удаления.
    }
    public Item[] getAll() {
        Item[] result = new Item[this.position];
        for (int index = 0; index!= this.position; index++) {
            result[index] = this.items[index];
        }
        return result;
    }

    public static void main(String[] args) {
        Tracker tracker = new Tracker();//String id, String name, String desc, long create, String[] comments
        Item item = new Item("1", "Ann", "DescName", 28, new String[10]);

        System.out.println(item.getName() + item.getId());
    }
}