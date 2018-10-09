package ru.job4j.tracker;

public class ExitProgram implements UserAction {

    private int key;
    private String desc;


    public ExitProgram(int key, String desc) {
        this.key = key;
        this.desc = desc;
    }

    @Override
    public int key() {
        return this.key;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        String id = input.ask("Enter an character to exit program : ");
    }

    @Override
    public String info() {
        return String.format("%d. %s", key, desc);
    }
}
