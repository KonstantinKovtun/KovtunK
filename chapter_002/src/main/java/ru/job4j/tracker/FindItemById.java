package ru.job4j.tracker;

public class FindItemById implements UserAction {

    private int key;
    private String desc;

    public FindItemById(int key, String desc) {
        this.key = key;
        this.desc = desc;
    }

    @Override
    public int key() {
        return this.key;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        String id = input.ask("Enter an Item id to find an Item what you need : ");
        Item byId = tracker.findById(id);
        if (byId != null) {
            System.out.println("The current id was founded by id !!!: ");
            System.out.println(byId);
        } else {
            System.out.println("The current id didn't exist in the class Tracker !!!");
        }
    }

    @Override
    public String info() {
        return String.format("%d. %s", key, desc);
    }
}
