package ru.job4j.condition;
/**
 * Point. Class calculates the distance between two points.
 *
 * @author Kovtun Konstantin (kovtun.kostya@gmai.com)
 * @version $Id$
 * @since 0.1
*/
public class DummyBot {
    /**
     * Отвечает на вопросы.
     * @param question Вопрос от клиента.
     * @return Ответ.
     */
    public String answer(String question) {
        String rsl = "Это ставит меня в тупик. Спросите другой вопрос.";
        if ("Привет, Бот".equals(question)) {
            // заменить ... на правильный ответ rsl = "ответ по заданию".
            rsl = ...;                    
        } else if (....) { // заменить ... на проверку, что этот вопрос известен боту и он знает как на него ответить.
            // заменить ... на правильный ответ rsl = "ответ по заданию".
            rsl = ..;
        }
        return rsl;
     }
}