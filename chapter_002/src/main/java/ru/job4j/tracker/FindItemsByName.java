package ru.job4j.tracker;

public class FindItemsByName implements UserAction {

    private int key;
    private String desc;

    public FindItemsByName(int key, String desc) {
        this.key = key;
        this.desc = desc;
    }

    @Override
    public int key() {
        return this.key;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        String id = input.ask("Enter an Item name to find an Item what you need : ");

        for (Item item : tracker.findByName(id)) {
            System.out.println("The current id by name was founded !!!: " + item.toString());
        }
    }

    @Override
    public String info() {
        return String.format("%d. %s", key, desc);
    }
}
