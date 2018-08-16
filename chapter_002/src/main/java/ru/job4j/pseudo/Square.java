package ru.job4j.pseudo;

/**
 * Class Square builds the square shape.
 * @author Kovtun Konstantin (kovtun.kostya@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Square implements Shape {
    /**
     * draw. Builds the square shape.
     * @return the shape.
     */
    @Override
    public String draw() {
        StringBuilder pic = new StringBuilder();
        pic.append("++++").append(System.lineSeparator());
        pic.append("++++").append(System.lineSeparator());
        pic.append("++++").append(System.lineSeparator());
        return pic.toString();
    }
}
