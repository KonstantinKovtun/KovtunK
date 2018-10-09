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
        System.out.print(question + " from 0 to 6: ");
        //return Integer.valueOf(scanner.nextInt());
        return 0;
    }
}
