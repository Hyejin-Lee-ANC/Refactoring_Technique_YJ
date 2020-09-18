package substitute.algorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GroupTest {
    @Test
    public void testFoundPerson() {
        Group group = new Group();
        String[] list = new String[] {"Johnny", "Donald", "Obama", "Don", "Gates"};
        assertEquals("Don", group.foundPerson(list));

        list = new String[] {"Johnny", "Donald", "John", "Don", "Gates"};
        assertEquals("John", group.foundPerson(list));

        list = new String[] {"Johnny", "Kent", "John", "Don", "Gates"};
        assertEquals("Kent", group.foundPerson(list));
    }
}