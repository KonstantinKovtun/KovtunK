package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @version $Id$
 * @since 0.1
 */
public class StartUI {

    /**
     * Константа меню для добавления новой заявки.
     */
    private static final String ADD = "0";

    /**
     * Константа получения списка всех заявок.
     */
    private static final String SHOW = "1";

    /**
     * Константа для редактирования заявки.
     */
    private static final String EDIT = "2";

    /**
     * Константа для удаления заявки.
     */
    private static final String DELETE = "3";

    /**
     * Константа для получения заявки по id.
     */
    private static final String FINDBYID = "4";

    /**
     * Константа для получения заявки по имени.
     */
    private static final String FINDBYNAME = "5";

    /**
     * Константа для выхода из цикла.
     */
    private static final String EXIT = "6";

    /**
     * Получение данных от пользователя.
     */
    private final Input input;

    private boolean working = true;

    /**
     * Хранилище заявок.
     */
    private final Tracker tracker;

    /**
     * Конструтор инициализирующий поля.
     *
     * @param input   ввод данных.
     * @param tracker хранилище заявок.
     */
    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * Основой цикл программы.
     */
/*
    public void init() {
        boolean exit = false;
        while (!exit) {
            this.showMenu();
            String answer = this.input.ask("Введите пункт меню : ");
            if (ADD.equals(answer)) {
                this.createItem();
            } else if (SHOW.equals(answer)) {
                this.findAllItems();
            } else if (EDIT.equals(answer)) {
                this.editItem();
            } else if (DELETE.equals(answer)) {
                this.deleteItem();
            } else if (FINDBYID.equals(answer)) {
                this.findItemById();
            } else if (FINDBYNAME.equals(answer)) {
                this.findItemByName();
            } else if (EXIT.equals(answer)) {
                exit = true;
            }
        }
    }
*/

    public void init() {
        MenuTracker menu = new MenuTracker(this.input, this.tracker);
        List<Integer> range = new ArrayList<>();
        //int[] listRange = range.stream().mapToInt(i->i).toArray();

        menu.fillActions(this);

        for (int i = 0; i < menu.getActionsLentgh(); i++) {
            range.add(i);
        }

        int[] listRange = new int[range.size()];

        for (int i = 0; i < listRange.length; i++) {
            listRange[i] = range.get(i);
        }

        do {
            menu.show();
            System.out.println();
            menu.select(input.ask("Select: ", listRange));
        } while (this.working); //while (!"y".equals(this.input.ask("Exit?(y): ")));
    }

    public void stop() {
        this.working = false;
    }

    /**
     * Метод реализует добавленяи новый заявки в хранилище.
     */
    private void createItem() {
        System.out.println("------------ Добавление новой заявки --------------");
        String name = this.input.ask("Введите имя заявки :");
        String desc = this.input.ask("Введите описание заявки :");
        Item item = new Item("123", name, desc, System.currentTimeMillis()); //String id, String name, String desc, long create
        this.tracker.add(item);
        System.out.println("------------ Новая заявка с getId : " + item.getId() + "-----------");
    }

    /**
     * Метод реализует получение списка заявок.
     */
    private void findAllItems() {
        for (Item items : this.tracker.findAll()) {
            System.out.println(items.toString());
        }
    }

    /**
     * Метод реализует редактирование заявки.
     */
    private void editItem() {
        String id = this.input.ask("Enter an Item id to be replaced : ");
        String name = this.input.ask("Enter an Item name : ");
        String desc = this.input.ask("Enter an Item description : ");
        Item item = new Item("888", name, desc, System.currentTimeMillis());

        if (this.tracker.replace(id, item)) {
            System.out.println("The Item was replaced !!!");
        } else {
            System.out.println("The Item wasn't replaced !!!");
        }
    }

    /**
     * Метод реализует удаление заявки.
     */
    private void deleteItem() {
        String id = this.input.ask("Enter an Item id to delete an Item :");

        if (this.tracker.delete(id)) {
            System.out.println("The current Item was deleted !!!");
        } else {
            System.out.println("The current Item wasn't found !!!");
        }
    }

    /**
     * Метод реализует поиск заявки по id.
     */
    private void findItemById() {
        String id = this.input.ask("Enter an Item id to find an Item what you need : ");

        if (id != null) {
            System.out.println("The current id was founded by id !!!: " + this.tracker.findById(id).toString());
        } else {
            System.out.println("The current id didn't exist in the class Tracker !!!");
        }
    }

    /**
     * Метод реализует поиск заявки по имени.
     */
    private void findItemByName() {
        String id = this.input.ask("Enter an Item name to find an Item what you need : ");

        for (Item item : this.tracker.findByName(id)) {
            System.out.println("The current id by name was founded !!!: " + item.toString());
        }
    }

    /**
     * Метод реализует меню пользователя.
     */
    private void showMenu() {
        System.out.println();
        System.out.println("Menu.");
        System.out.println("0.Add new Item.");
        System.out.println("1.Show all items.");
        System.out.println("2.Edit item.");
        System.out.println("3.Delete item.");
        System.out.println("4.Find item by Id.");
        System.out.println("5.Find items by name.");
        System.out.println("6.Exit Program.");
        System.out.println();
        // добавить остальные пункты меню.
    }

    /**
     * Запускт программы.
     *
     * @param args
     */
    public static void main(String[] args) {
        new StartUI(new ValidateInput(), new Tracker()).init();
    }
}