package ru.job4j.tracker;

import java.util.List;

public interface Input {
    String ask(String question);
    //все модификаторы доступа в интерфейса по умолчанию public

    //List<Integer> ask(String question, List<Integer> range);
}