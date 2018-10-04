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
        String id = input.ask("Enter an character to exit program : ");
    }

    @Override
    public String info() {
        return "Exit program : ";
    }
}
