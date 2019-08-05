package ru.job4j.coffeemachine;

import java.util.Arrays;

/**
 * Class CoffeeMachine checks how the singleton works.
 *
 * @author Kovtun Konstantin (kovtun.kostya@gmail.com).
 * @version $Id$
 * @since 03.03.2019.
 */
public class CoffeeMachine {

    public int[] changes(int value, int price) {

        int returnMoney = value - price;

        int[] res = new int[5];
        int[] coints = {10, 5, 2, 1};
        int count = 0;

        for (int i = 0; i < coints.length; i++) {
            while (returnMoney > 0) {
                if (returnMoney >= coints[i]) {
                    res[count] = coints[i];
                    returnMoney -= coints[i];
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
