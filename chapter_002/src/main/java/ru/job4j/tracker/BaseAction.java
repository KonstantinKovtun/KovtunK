package ru.job4j.tracker;

/**
 * Class BaseAction uses for implementing class UserAction.
 * @author Kovtun Konstantin (kovtun.kostya@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public abstract class BaseAction implements UserAction {
    private final int key;
    private final String name;

    protected BaseAction (final int key, final String name) {
        this.key = key;
        this.name = name;
    }

    /**
     * Use for choose element of menu Item.
     */
    @Override
    public int key(){
        return this.key;
    }
    /**
     * Shows info of list Items.
     */
    @Override
    public String info() {
        return String.format("%s : %s", this.key, this.name);
    }
}
