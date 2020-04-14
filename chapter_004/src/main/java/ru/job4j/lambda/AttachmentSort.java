package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Class AttachmentSort sorts elements and names of ArrayList by using anonymous classes.
 * @author Kovtun Konstantin (kovtun.kostya@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class AttachmentSort {
    public static void main(String[] args) {
        List<Attachment> attachments = Arrays.asList(
                new Attachment("image 1", 100),
                new Attachment("image 2", 34),
                new Attachment("image 3", 13)
        );
        Comparator comparator =  new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Attachment left = (Attachment) o1;
                Attachment right = (Attachment) o2;
                return left.getSize() - right.getSize();
            }
        };
        attachments.sort(comparator);
        System.out.println(attachments);

        Comparator<Attachment> comparatt =  new Comparator<Attachment>() {
            @Override
            public int compare(Attachment o1, Attachment o2) {
                Attachment left = (Attachment) o1;
                Attachment right = (Attachment) o2;
                return left.getName().compareTo(right.getName());
            }
        };
        attachments.sort(comparatt);
        System.out.println(attachments);
    }
}