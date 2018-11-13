package ru.job4j.tracker;

import java.util.List;
import java.util.Scanner;

public class StubInput implements Input {
    private final String[] value;
    private int position = 0;
    private Scanner scanner = new Scanner(System.in);

    public StubInput(String[] value) {
        this.value = value;
    }

    @Override
    public String ask(String question) {
        return value[this.position++];
    }

    @Override
    public int ask(String question, List<Integer> range) {
        return Integer.valueOf(value[this.position++]);
    }

    @Override
    public int ask(String question, int[] range) {
        int key = Integer.valueOf(this.ask(question));
        boolean exist = false;
        for (int value : range) {
            if (value == key) {
                exist = true;
                break;
            }
        }

        if (exist) {
            return key;
        } else {
            throw new MenuOutException("Out of menu range!!!");
        }
    }
}
