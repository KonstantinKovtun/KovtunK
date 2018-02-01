package ru.job4j;

/**
 * Calculate.
 *
 * @author Kovtun Konstantin (kovtun.kostya@gmai.com)
 * @version $Id$
 * @since 0.1
 *  онструктор, выводит строки в консоль.
 * @param arg - arg.
*/
public class Calculate {
    /**
     * Main.
     * @param args - args.
     */
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
	
    /**
     * Method echo.
     * @param name Your name.
     * @return Echo plus your name.
     */
    public String echo(String name) {
        return "Echo, echo, echo : " + name;
    }
}