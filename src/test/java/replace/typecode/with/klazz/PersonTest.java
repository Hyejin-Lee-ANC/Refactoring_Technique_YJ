package replace.typecode.with.klazz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    public void testBloodGroupEquals() {
        Person father = new Person(Person.AB);
        Person mother = new Person(Person.O);
        Person son = new Person(Person.A);
        Person daughter = new Person(Person.B);

        assertTrue(Person.AB == father.getBloodGroup());
        assertTrue(Person.O == mother.getBloodGroup());
        assertTrue(Person.A == son.getBloodGroup());
        assertTrue(Person.B == daughter.getBloodGroup());
    }
}