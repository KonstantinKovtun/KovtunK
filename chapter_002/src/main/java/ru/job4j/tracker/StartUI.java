package ru.job4j.tracker;

import java.util.Arrays;
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

    /**
     * Метод реализует добавленяи новый заявки в хранилище.
     */
    private void createItem() {
        System.out.println("------------ Добавление новой заявки --------------");
        String name = this.input.ask("Введите имя заявки :");
        String desc = this.input.ask("Введите описание заявки :");
        Item item = new Item("123", name, desc, 131232); //String id, String name, String desc, long create
        this.tracker.add(item);
        System.out.println("------------ Новая заявка с getId : " + item.getId() + "-----------");
    }

    /**
     * Метод реализует получение списка заявок.
     */
    private void findAllItems() {
        for (Item items : this.tracker.findAll()) {
            System.out.println("Items' name : " + items.getName() + " " + "items' id : " + items.getId());
        }
    }

    /**
     * Метод реализует редактирование заявки.
     */
    private void editItem() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an Item id to replace an Item : ");
        String scan = scanner.nextLine();
        Item item = new Item("123", "nameKostya", "desc", 131232);
        this.tracker.replace(scan, item);
    }

    /**
     * Метод реализует удаление заявки.
     */
    private void deleteItem() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Item id to delete an Item : ");
        String scan = scanner.nextLine();
        this.tracker.delete(scan);
    }

    /**
     * Метод реализует поиск заявки по id.
     */
    private void findItemById() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Item id to find an Item what you need : ");
        String scan = scanner.nextLine();
        this.tracker.findById(scan);
        System.out.println(this.tracker.findById(scan).getName() + "   " + this.tracker.findById(scan).getId());
    }

    /**
     * Метод реализует поиск заявки по имени.
     */
    private void findItemByName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Item name to find an Item what you need : ");
        String scan = scanner.nextLine();
        for (Item item : this.tracker.findByName(scan)) {
            System.out.println(item.getName() + "  " + item.getId());
        }
    }

    /**
     * Метод реализует меню пользователя.
     */
    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0.Add new Item.");
        System.out.println("1.Show all items.");
        System.out.println("2.Edit item.");
        System.out.println("3.Delete item.");
        System.out.println("4.Find item by Id.");
        System.out.println("5.Find items by name.");
        System.out.println("6.Exit Program.");
        // добавить остальные пункты меню.
    }

    /**
     * Запускт программы.
     *
     * @param args
     */
    public static void main(String[] args) {
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }
}