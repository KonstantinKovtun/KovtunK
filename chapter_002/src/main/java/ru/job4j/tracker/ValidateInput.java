package ru.job4j.tracker;

/**
 * Class ValidateInput uses for handling exceptions which you created.
 * @author Kovtun Konstantin (kovtun.kostya@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class ValidateInput extends ConsoleInput {
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
                value = super.ask(question, range);
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
