package ru.job4j.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CutCloneTest {
    /**
     * Test whenInputManyAddressesOutPutAddressesWithoutDuplicates.
     */
    @Test
    public void whenInputManyAddressesOutPutAddressesWithoutDuplicates() {
        CutClone cutClone = new CutClone();
        List<Profile> profiles = new ArrayList<>(
                Arrays.asList(
                        new Profile(),
                        new Profile(),
                        new Profile(),
                        new Profile(),
                        new Profile(),
                        new Profile(),
                        new Profile()
                ));

        List<Address> address = new ArrayList<>(
                Arrays.asList(
                        new Address("Lisbon", "Yaroslavskaya", 30, 3),
                        new Address("Kiev", "Petlyry", 50, 5),
                        new Address("Washington", "Volodymirska", 40, 4),
                        new Address("Odessa", "Vasylkovskaya", 10, 1),
                        new Address("Vienna", "Arhangelska", 20, 2),
                        new Address("Lisbon", "Yaroslavskaya", 30, 3),
                        new Address("Kiev", "Petlyry", 50, 5)
                ));

        for (int i = 0; i < address.size(); i++) {
            profiles.get(i).setAddress(address.get(i));
        }

        List<Address> result = cutClone.sorted(profiles);
        List<Address> expected =
                Arrays.asList(
                        new Address("Kiev", "Petlyry", 50, 5),
                        new Address("Lisbon", "Yaroslavskaya", 30, 3),
                        new Address("Odessa", "Vasylkovskaya", 10, 1),
                        new Address("Vienna", "Arhangelska", 20, 2),
                        new Address("Washington", "Volodymirska", 40, 4)
                );
        assertThat(result, is(expected));
    }
}
