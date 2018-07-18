package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * Test class TrackerTest.
 *
 * @author Kovtun Konstantin (kovtun.kostya@gmai.com)
 * @version $Id$
 * @since 0.1
 */

public class TrackerTest {
    /**
     * Test whenFindsArrayElementsByNameInTracker.
     */
    @Test
    public void whenFindsArrayElementsByNameInTracker() {
        Tracker tracker = new Tracker();
        tracker.add(new Item("19", "Name1", "desc1", 121));
        tracker.add(new Item("29", "Name2", "desc2", 122));
        tracker.add(new Item("39", "Name3", "desc3", 123));
        tracker.add(new Item("292", "Name2", "desc24", 1224));
        //tracker.findByName("Name2");
        //int[] result = square.calculate(5);
        //int[] expected = {1, 4, 9, 16, 25};
        //assertThat(result, is(expected));

        Item[] items = tracker.findByName("Name2");
        assertThat(items.length, is(2));
        assertThat(items[0].getName(), is("Name2"));
        assertThat(items[1].getName(), is("Name2"));
    }
    /**
     * Test whenAddNewItemInTracker.
     */
    @Test
    public void whenAddNewItemInTracker() {
        Tracker tracker = new Tracker();
        tracker.add(new Item("19", "Name1", "desc1", 121));
        tracker.add(new Item("29", "Name2", "desc2", 122));
        tracker.add(new Item("39", "Name3", "desc3", 123));
        tracker.add(new Item("292", "Name2", "desc24", 1224));

        assertThat(tracker.findAll().length, is(4));
    }
    /**
     * Test whenReplaceAnItemInTracker.
     */
    @Test
    public void whenReplaceItemInTracker() {
        Tracker tracker = new Tracker();
        Item item = tracker.add((new Item("19", "Name1", "desc1", 121)));
        tracker.add(new Item("29", "Name2", "desc2", 122));
        tracker.add(new Item("39", "Name3", "desc3", 123));
        tracker.add(new Item("49", "Name4", "desc4", 124));
        boolean b = tracker.replace(item.getId(), new Item("89", "Name89", "desc89", 189));
        assertTrue(b);
        /** НЕ ПОНИМАЮ ДЛЯ ЧЕГО МЫ ЭТОТ МЕТОД ИСПОЛЬЗОВАЛИ. ПОТОМУ, ЧТО метод реплейс возращает тру, если
         * удалась замена айтема, в другом случае тестирование не прошло бы. Я прав ?
        */
        assertThat(tracker.findAll().length, is(4)); /// ЗАЧЕМ МЫ ИСПОЛЬЗУЕМ ДАННЫЙ МЕТОД ?
        assertThat(tracker.findAll()[0].getName(), is("Name89"));
        assertThat(tracker.findAll()[0].getId(), is(item.getId()));
    }
    /**
     * Test whenDeleteItemInTracker.
     */
    @Test
    public void whenDeleteItemInTracker() {
        Tracker tracker = new Tracker();
        tracker.add(new Item("19", "Name1", "desc1", 121));
        tracker.add(new Item("29", "Name2", "desc2", 122));
        tracker.add(new Item("39", "Name3", "desc3", 123));
        tracker.add(new Item("292", "Name4", "desc4", 124));

        Item[] items = tracker.findAll();
        boolean b = tracker.delete(items[0].getId());
        assertTrue(b);
        assertThat(tracker.findAll().length, is(3));
        assertThat(tracker.findAll()[0].getId(), is(items[0].getId()));
        assertThat(tracker.findAll()[1].getId(), is(items[1].getId()));
        assertThat(tracker.findAll()[2].getId(), is(items[2].getId()));
    }
}
