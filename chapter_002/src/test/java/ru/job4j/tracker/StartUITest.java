package ru.job4j.tracker;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class StartUITest {
    private final PrintStream stdout = System.out;
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker(); // создаём Tracker
        Input input = new StubInput(new String[]{"0", "test name", "desc", "6"}); //создаём StubInput с последовательностью действий
        new StartUI(input, tracker).init(); //создаём StartUI и вызываем метод init()
        assertThat(tracker.findAll()[0].getName(), is("test name")); // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
    }

    @Test
    public void whenUpdateThenTrackerHasUpdatedValue() {
        Tracker tracker = new Tracker();
        //Напрямую добавляем заявку
        Item item = tracker.add(new Item("test name", "desc", 78778789));
        //создаём StubInput с последовательностью действий(производим замену заявки)
        Input input = new StubInput(new String[]{"2", item.getId(), "test replace", "заменили заявку", "6"});
        // создаём StartUI и вызываем метод init()
        new StartUI(input, tracker).init();
        // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
        assertThat(tracker.findById(item.getId()).getName(), is("test replace"));
    }

    @Test
    public void whenDeleteThenTrackerHasNotNewValue() {
        Tracker tracker = new Tracker();
        //Напрямую добавляем заявку
        Item item = tracker.add(new Item("3321", "test name", "item to delete", 78778789));
        //создаём StubInput с последовательностью действий(производим замену заявки)
        Input input = new StubInput(new String[]{"3", item.getId(), "6"});
        // создаём StartUI и вызываем метод init()
        new StartUI(input, tracker).init();
        // проверяем, что добавленная заявка была удалена.
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }

    @Test
    public void whenUserGetsAllItemsThenTrackerReturnsAllItems() {
        Tracker tracker = new Tracker();
        tracker.add(new Item("1", "Name1", "desc1", 121));
        tracker.add(new Item("2", "Name2", "desc2", 122));
        tracker.add(new Item("3", "Name3", "desc3", 123));
        Item[] items = tracker.findAll();
        assertThat(tracker.findAll().length, is(3));
        //создаём StubInput с последовательностью действий
        Input input = new StubInput(new String[]{"1", "6"});
        //создаём StartUI и вызываем метод init()
        new StartUI(input, tracker).init();
        //проверяем какие заявки возращает класс StartUI
        assertThat(tracker.findAll()[0], is(items[0]));
        assertThat(tracker.findAll()[1], is(items[1]));
        assertThat(tracker.findAll()[2], is(items[2]));
    }

    @Test
    public void whenUserFindsItemByIdThenTrackerReturnsItemWithTheSameId() {
        Tracker tracker = new Tracker();
        tracker.add(new Item("1", "Name1", "desc1", 121));
        tracker.add(new Item("2", "Name2", "desc2", 122));
        tracker.add(new Item("3", "Name3", "desc3", 123));
        Item item = tracker.add(new Item("29", "NameAnn", "desc", 240812018));
        Input input = new StubInput(new String[]{"4", item.getId(), "6"});
        new StartUI(input, tracker).init();
        //assertThat(result, is(expected));
        assertThat(tracker.findById(item.getId()).getId(), is(item.getId()));
    }

    @Test
    public void whenUserFindsItemByNameThenTrackerReturnsItemWithTheSameName() {
        Tracker tracker = new Tracker();
        tracker.add(new Item("1", "Name1", "desc1", 121));
        tracker.add(new Item("2", "Name2", "desc2", 122));
        tracker.add(new Item("3", "Name3", "desc3", 123));
        Item item = tracker.add(new Item("29", "Name_Anna", "desc 18.25", 240812018));
        Input input = new StubInput(new String[]{"5", item.getName(), "6"});
        new StartUI(input, tracker).init();
        //assertThat(result, is(expected));
        assertThat(tracker.findByName(item.getName())[0].getName(), is(item.getName()));
    }

    @Before
    public void loadOutput() {
        System.out.println("execute before method");
        System.setOut(new PrintStream(this.out));
    }

    @After
    public void backOutput() {
        System.setOut(this.stdout);
        System.out.println("execute after method");
    }
}
