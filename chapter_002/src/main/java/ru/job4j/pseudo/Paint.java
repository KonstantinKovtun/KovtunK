package ru.job4j.pseudo;

/**
 * Class Paint builds some shapes.
 * @author Kovtun Konstantin (kovtun.kostya@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Paint {
    /**
     * draw. Builds differets shape.
     * @return the shape.
     */
    public void draw(Shape shape) {
        System.out.println(shape.draw());
    }
    /**
     * Main.
     * @param args - args.
     */
    public static void main(String[] args) {

        Paint pt = new Paint();

        pt.draw(new Triangle());
        pt.draw(new Square());
    }
}
