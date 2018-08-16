package ru.job4j.pseudo;

/**
 * Class Triangle builds the triangle shape.
 * @author Kovtun Konstantin (kovtun.kostya@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Triangle implements Shape {
    /**
     * draw. Builds the triangle shape.
     * @return the shape.
     */
    @Override
    public String draw() {
        StringBuilder pic = new StringBuilder();
        pic.append("  + ").append(System.lineSeparator());
        pic.append(" +++").append(System.lineSeparator());
        pic.append("+++++").append(System.lineSeparator());
        return pic.toString();
    }
}
