package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public class MenuTracker {
    /**
     * @param хранит ссылку на объект .
     */
    private Input input;
    /**
     * @param хранит ссылку на объект .
     */
    private Tracker tracker;
    /**
     * @param хранит ссылку на массив типа UserAction.
     */
    private List<UserAction> actions = new ArrayList<>();

    /**
     * Конструктор.
     *
     * @param input   объект типа Input
     * @param tracker объект типа Tracker
     */
    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * Метод для получения массива меню.
     *
     * @return длину массива
     */
    public int getActionsLentgh() {
        return this.actions.size();
    }

    /**
     * Метод заполняет массив.
     */
    public void fillActions(StartUI startUItartUI) {
        this.actions.add(new AddAction(0, "Add program"));
        this.actions.add(new ShowItems(1, "Show all items"));
        this.actions.add(new MenuTracker.EditItem(2, "Edit item"));
        this.actions.add(new MenuTracker.DeleteItem(3, "Delete item"));
        this.actions.add(new FindItemById(4, "Find item by Id"));
        this.actions.add(new FindItemsByName(5, "Find items by name"));
        this.actions.add(new ExitProgram(6, "Exit Program", startUItartUI));
    }

    /**
     * Метод в зависимости от указанного ключа, выполняет соотвествующие действие.
     *
     * @param key ключ операции
     */
    public void select(int key) {
        this.actions.get(key).execute(this.input, this.tracker);
    }

    /**
     * Метод выводит на экран меню.
     */
    public void show() {
        for (UserAction action : this.actions) {
            if (action != null) {
                System.out.println(action.info());
            }
        }
    }

    private class DeleteItem implements UserAction {

        private int key;
        private String desc;

        public DeleteItem(int key, String desc) {
            this.key = key;
            this.desc = desc;
        }

        @Override
        public int key() {
            return this.key;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("------------ Deleting an item --------------");
            String id = input.ask("Enter an Item id to delete an Item :");

            if (tracker.delete(id)) {
                System.out.println("The current Item was deleted !!!");
            } else {
                System.out.println("The current Item wasn't found !!!");
            }
        }

        @Override
        public String info() {
            return String.format("%d. %s", key, desc);
        }
    }

    private static class EditItem implements UserAction {

        private int key;
        private String desc;

        public EditItem(int key, String desc) {
            this.key = key;
            this.desc = desc;
        }

        @Override
        public int key() {
            return this.key;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("------------ Editing an item --------------");
            String id = input.ask("Enter an Item id to be replaced : ");
            String name = input.ask("Enter an Item name : ");
            String desc = input.ask("Enter an Item description : ");
            Item item = new Item("888", name, desc, System.currentTimeMillis());

            if (tracker.replace(id, item)) {
                System.out.println("The Item was replaced !!!");
            } else {
                System.out.println("The Item wasn't replaced !!!");
            }
        }

        @Override
        public String info() {
            return String.format("%d. %s", key, desc);
        }
    }
}
