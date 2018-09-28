package ru.job4j.tracker;

public class ExitProgram implements UserAction {

    public ExitProgram(int key, String desc) {
    }

    @Override
    public int key() {
        return 6;
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
        return "Find item by Id : ";
    }
}
