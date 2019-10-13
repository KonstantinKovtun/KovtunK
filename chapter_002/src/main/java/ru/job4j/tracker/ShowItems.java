package ru.job4j.tracker;

public class ShowItems implements UserAction {

    private int key;
    private String desc;

    public ShowItems(int key, String desc) {
        this.key = key;
        this.desc = desc;

    }

    @Override
    public int key() {
        return this.key;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        for (Item items : tracker.findAll()) {
            System.out.println(items.toString());
        }
        System.out.println();
    }

    @Override
    public String info() {
        return String.format("%d. %s", key, desc);
    }
}
