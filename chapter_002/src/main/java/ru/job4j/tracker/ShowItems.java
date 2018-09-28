package ru.job4j.tracker;

public class ShowItems implements UserAction {

    public ShowItems(int key, String desc) {
    }

    @Override
    public int key() {
        return 1;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        for (Item items : tracker.findAll()) {
            System.out.println(items.toString());
        }
    }

    @Override
    public String info() {
        return "Show all items : ";
    }
}
