package ru.job4j.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ProfileTest {
    /**
     * Test whenInputOneGroupOutputThreeGroups100.
     */
    @Test
    public void whenEveryUserHasAddress() {
        Profile profile = new Profile();
        List<Profile> pr = new ArrayList<>(
                Arrays.asList(
                        new Profile(),
                        new Profile(),
                        new Profile(),
                        new Profile(),
                        new Profile()
                ));
        List<Address> address = new ArrayList<>(
                Arrays.asList(
                        new Address("Kiev", "Petlyry", 50, 5),
                        new Address("Kiev", "Vasylkovskaya", 10, 1),
                        new Address("Kiev", "Arhangelska", 20, 2),
                        new Address("Kiev", "Yaroslavskaya", 30, 3),
                        new Address("Kiev", "Volodymirska", 40, 4)
                ));

        for (int i = 0; i < address.size(); i++) {
            pr.get(i).setAddress(address.get(i));
        }

        List<Address> result = profile.collect(pr);
        List<Address> expected =
                Arrays.asList(
                        new Address("Kiev", "Petlyry", 50, 5),
                        new Address("Kiev", "Vasylkovskaya", 10, 1),
                        new Address("Kiev", "Arhangelska", 20, 2),
                        new Address("Kiev", "Yaroslavskaya", 30, 3),
                        new Address("Kiev", "Volodymirska", 40, 4)
                );
        assertThat(result, is(expected));
    }
}
