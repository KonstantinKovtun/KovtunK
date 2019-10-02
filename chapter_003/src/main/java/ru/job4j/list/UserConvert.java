package ru.job4j.list;
import ru.job4j.list.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class UserConvert. This class convert collection List to Map behavior.
 * @author Kovtun Konstantin (kovtun.kostya@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class UserConvert {
    /**
     * Method process. The method returns the array from list.
     * @param list contains the number of elements.
     * @return the HashMap.
     */
    public HashMap<Integer, User> process(List<User> list) {
        HashMap<Integer, User> mp = new HashMap<Integer, User>();
        Map<Integer, User> map = new HashMap<>();

        for (User sr : list) {
            map.put(sr.getId(), sr);
        }

        return (HashMap)map;
    }
}
