package ru.job4j.tracker;

public class FindItemsByName implements UserAction {

    public FindItemsByName(int key, String desc) {
    }

    @Override
    public int key() {
        return 5;
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
        return "Find item by Name : ";
    }
}
