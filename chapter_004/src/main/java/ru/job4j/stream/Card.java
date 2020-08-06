package ru.job4j.stream;

import ru.job4j.lambda.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Card {
    private Suit suit;
    private Value value;

    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    public enum Suit {
        Diamonds, Hearts, Spades, Clubs
    }

    public enum Value {
        V_6, V_7, V_8
    }

    public static void main(String[] args) {
        List<Card> list = new ArrayList<Card>();

        list = Stream.of(Suit.values())// тут мы создаем поток из перечисления Suit
                .flatMap(e -> Stream.of(Value.values())// к потоку добавляем поток из перечисления Value
                        .map(k -> new Card(e, k)))// преобразовываем объекты потока из перечисления Suit и перечисления Value в объекты Card
                .collect(Collectors.toList());

        for (Card m : list) {
            System.out.println("Card[suit = " + m.suit + " value = " + m.value + "]");
        }
//        list.stream().forEach(System.out::println);

//        Stream<Card> deck = Stream.of(Suit.values())// тут мы создаем поток из перечисления Suit
//                .flatMap(s ->
//                        Stream.of(Value.values())// к потоку добавляем поток из перечисления Value
//                                .flatMap(v -> Stream.of(new Card(s, v))));// получаем поток из объектов Card;
//
//        deck.forEach(card ->  System.out.println("Suit:" + card.suit + ", value:" + card.value));
    }
}
