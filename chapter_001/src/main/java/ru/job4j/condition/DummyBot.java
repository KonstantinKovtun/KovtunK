package ru.job4j.condition;

/**
 * Class DummyBot receives a word and returns a response.
 *
 * @author Kovtun Konstantin (kovtun.kostya@gmai.com)
 * @version $Id$
 * @since 0.1
 */
public class DummyBot {
	/**
	 * nswers the questions.
	 * @param question Question from a client.
	 * @return An answer.
	 */
	public String answer(String question) {
		String rsl = "Это ставит меня в тупик. Спросите другой вопрос.";

		if ("Привет, Бот.".equals(question)) {
			rsl = "Привет, умник.";
		} else if ("Пока.".equals(question)) {
			rsl = "До скорой встречи.";
		} else {
			rsl = "Это ставит меня в тупик. Спросите другой вопрос.";
		}

		return rsl;
	}

	public static void main(String[] args) {
		final String HELLO = "Привет, Бот.";
		final String BYE = "Пока.";
		final String SEE_YOU_SOON = "До скорой встречи.";

		DummyBot dummyBot = new DummyBot();

		dummyBot.answer(HELLO);
		dummyBot.answer(BYE);
		dummyBot.answer(SEE_YOU_SOON);
	}
}