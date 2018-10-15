package ru.job4j.tracker;

public class ExitProgram implements UserAction {

    private StartUI startUI;
    private int key;
    private String desc;


    public ExitProgram(int key, String desc, StartUI startUI) {
        this.key = key;
        this.desc = desc;
        this.startUI = startUI;
    }

    @Override
    public int key() {
        return this.key;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("Exit program : ");
        startUI.stop();
    }

    @Override
    public String info() {
        return String.format("%d. %s", key, desc);
    }
}
