package ru.job4j.tracker;

import java.util.List;
import java.util.Scanner;

/**
 * Class ValidateInput uses for handling exceptions which you created.
 * @author Kovtun Konstantin (kovtun.kostya@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class ValidateInput implements Input {
    /**
     * Stores the link on the interface Input.
     */
    private final Input input;
    private Scanner scanner = new Scanner(System.in);

    /**
     * The constructor initializes the field.
     * @param input data input.
     */
    public ValidateInput(final Input input) {
        this.input = input;
    }

    @Override
    public String ask(String question) {
        return this.input.ask(question);
    }

    @Override
    public int ask(String question, List<Integer> range) {
        System.out.print(question + "from 0 to 6: ");
        return Integer.valueOf(scanner.nextLine());
    }

    /**
     * Method ask. Handling exceptions.
     * @param question, select menu name.
     * @param range, element in array which we search.
     * @return value menu item class.
     */
    @Override
    public int ask(String question, int[] range) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = this.input.ask(question, range);
                invalid = false;
            } catch (MenuOutException moe) {
                System.out.println("Please select key for menu.");
            } catch (NumberFormatException nfe) {
                System.out.println("Please enter a valid data again.");
            }
        } while (invalid);
        return value;
    }
}
