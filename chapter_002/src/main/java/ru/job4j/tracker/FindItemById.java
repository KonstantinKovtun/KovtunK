package ru.job4j.tracker;

public class FindItemById implements UserAction {

    public FindItemById(int key, String desc) {
    }

    @Override
    public int key() {
        return 4;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        String id = input.ask("Enter an Item id to find an Item what you need : ");

        if (id != null) {
            System.out.println("The current id was founded by id !!!: " + tracker.findById(id).toString());
        } else {
            System.out.println("The current id didn't exist in the class Tracker !!!");
        }
    }

    @Override
    public String info() {
        return "Find item by Id : ";
    }
}
