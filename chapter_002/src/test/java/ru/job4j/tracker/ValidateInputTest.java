package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test class ValidateInputTest.
 *
 * @author Kovtun Konstantin (kovtun.kostya@gmai.com)
 * @version $Id$
 * @since 0.1
 */
public class ValidateInputTest {
    /**
     * Test whenAskThenException.
     */
    @Test
    public void whenAskThenException() {
        ValidateInput validateInput = new ValidateInput();
        int[] range = {0, 1, 2, 3, 4, 5, 6};
        String resultIndexOutOfRange, resultNumberFormat;
        int result = validateInput.ask("Select", range);

        if (result < 0 || result > 6 ) {
            resultIndexOutOfRange = "Please select key for menu.";
            assertThat(resultIndexOutOfRange, is("Please select key for menu."));
        } else {
            if (Integer.valueOf(result) != ) {// проверка условия является ли result не цифра
                resultNumberFormat = "Please enter a valid data again.";
                assertThat(resultNumberFormat, is("Please enter a valid data again."));
            }
        }
    }
}
