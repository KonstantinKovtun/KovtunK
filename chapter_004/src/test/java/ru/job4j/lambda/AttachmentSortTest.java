package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test class AttachmentSort.
 *
 * @author Kovtun Konstantin (kovtun.kostya@gmai.com)
 * @version $Id$
 * @since 0.1
 */
public class AttachmentSortTest {
    /**
     * Test whenSortElementsInArrayList.
     */
    @Test
    public void whenSortElementsInArrayList() {
        AttachmentSort attachmentSort = new AttachmentSort();
        List<Attachment> attachments = Arrays.asList(
                new Attachment("image 31", 100),
                new Attachment("image 88", 34),
                new Attachment("image 7", 13)
        );
        List<Attachment>expect = Arrays.asList(
                new Attachment("image 7", 13),
                new Attachment("image 31", 100),
                new Attachment("image 88", 34)
        );
        List<Attachment> result = attachmentSort.sort(attachments);
         assertThat(result, is(expect));
    }
}
