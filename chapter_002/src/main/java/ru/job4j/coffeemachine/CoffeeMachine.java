package ru.job4j.coffeemachine;

import java.util.Arrays;

/**
 * Class CoffeeMachine checks how the singleton works.
 *
 * @author Kovtun Konstantin (kovtun.kostya@gmail.com).
 * @version $Id$
 * @since 04.08.2019.
 */
public class CoffeeMachine {

    /**
     * Contains numeric of coins.
     */
    private static final int[] COINS = {10, 5, 2, 1};

    /**
     * Method changes.
     * @param value Your number of coins which you put in.
     * @param price Cup of coffee  price.
     * @return the array returns charge.
     */
    public int[] changes(int value, int price) {
        int returnMoney = value - price;
        int[] res = new int[5];
        int count = 0;

        for (int i = 0; i < this.COINS.length; i++) {
            while (returnMoney > 0) {
                if (returnMoney >= this.COINS[i]) {
                    res[count] = this.COINS[i];
                    returnMoney -= this.COINS[i];
                    count++;
                } else {
                    break;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {

        CoffeeMachine coffeeMachine = new CoffeeMachine();

        System.out.println(Arrays.toString(coffeeMachine.changes(29, 1)));
    }
}
