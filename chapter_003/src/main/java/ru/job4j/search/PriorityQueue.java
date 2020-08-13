package ru.job4j.search;

import java.util.LinkedList;

/**
 * Class PriorityQueue. This class describes how we can use insert elements in correct order.
 * @author Kovtun Konstantin (kovtun.kostya@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позиция определять по полю приоритет.
     * Для вставик использовать add(int index, E value)
     * @param task задача
     */
    public void put(Task task) {
        //TODO добавить вставку в связанный список.
        var index = -1;

        for (Task lk : tasks) {
            if (lk.getPriority() > task.getPriority()) {
                index = tasks.indexOf(lk);
                break;
            }
        }

        if (index != -1) {
            tasks.add(index, task);
        } else {
            tasks.add(task);
        }
    }

    /**
     * Method take. Delete the first element of the LinkedList.
     */
    public Task take() {
        return this.tasks.poll();
    }
}