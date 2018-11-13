package ru.job4j.tracker;

public class AddAction implements UserAction {

    private int key;
    private String desc;

    public AddAction(int key, String desc) {
        this.key = key;
        this.desc = desc;
    }

    @Override
    public int key() {
        return this.key;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Adding new item --------------");
        String name = input.ask("Please, provide item name:");
        String desc = input.ask("Please, provide item description:");
        Item item = new Item(name, desc);
        tracker.add(item);
        System.out.println("------------ New Item with Id : " + item.getId());
        System.out.println("------------ New Item with Name : " + item.getName());
        System.out.println("------------ New Item with Description : " + item.getDesc());
        System.out.println();
    }

    @Override
    public String info() {
        return String.format("%d. %s", key, desc);
    }
}
