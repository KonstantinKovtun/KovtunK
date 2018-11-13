package ru.job4j.tracker;

/**
 * Class MenuOutException uses for handling IndexOutOfBoundsException exceptions which you created.
 * @author Kovtun Konstantin (kovtun.kostya@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class MenuOutException extends RuntimeException {
    /**
     * Method MenuOutException. Constructor of MenuOutException class.
     * @param question, select menu name.
     */
    public MenuOutException(String question) {
        super(question);
    }
}
