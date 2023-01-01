package construction.builder;

import org.junit.jupiter.api.Test;

import static construction.builder.GenderEnum.MALE;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PersonBuilderTest {

    @Test
    void test() {
        Person expected = getExpected();
        Person actual = getActual();

        assertTrue(valuesEquals(expected, actual));
    }

    private Person getExpected() {
        return new Person("Adam", "Kowalski", 21, MALE);
    }

    private Person getActual() {
        return new PersonBuilder()
                .setFirstName("Adam")
                .setLastName("Kowalski")
                .setAge(21)
                .setGender(MALE)
                .build();
    }

    private boolean valuesEquals(Person expected, Person actual) {
        return expected.getFirstName().equals(actual.getFirstName())
                && expected.getLastName().equals(actual.getLastName())
                && expected.getAge().equals(actual.getAge())
                && expected.getGender().equals(actual.getGender());
    }
}
