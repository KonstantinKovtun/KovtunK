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
        System.out.print(question + "from 0 to 6: ");
        return Integer.valueOf(scanner.nextLine());
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
