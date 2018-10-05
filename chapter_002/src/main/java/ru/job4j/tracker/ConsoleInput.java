package ru.job4j.tracker;

import java.util.*;

public class ConsoleInput implements Input {

    private Scanner scanner = new Scanner(System.in);

    @Override
    public String ask(String question) {
        System.out.print(question);
        return scanner.nextLine();
    }

    @Override
    public int ask(String question, List<Integer> range) {
        System.out.print(question + " from 0 to 6: ");
        return Integer.valueOf(scanner.nextInt());
    }
}
