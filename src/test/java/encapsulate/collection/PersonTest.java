package encapsulate.collection;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    public void testAddRemoveCourses() {
        // Client code
        Person kent = new Person();
        Set s = new HashSet();
        s.add(new Course("Smalltalk Programming", false));
        s.add(new Course("Appreciating Single Malts", true));
        kent.setCourses(s);
        assertEquals(2, kent.getCourses().size());
        Course refact = new Course("Refactoring", true);
        kent.getCourses().add(refact);
        kent.getCourses().add(new Course("Brutal Sarcasm", false));
        assertEquals(4, kent.getCourses().size());
        kent.getCourses().remove(refact);
        assertEquals(3, kent.getCourses().size());

        Iterator iter = kent.getCourses().iterator();
        int count = 0;
        while (iter.hasNext()) {
            Course each = (Course) iter.next();
            if (each.isAdvanced()) {
                count++;
            }
        }
        assertEquals(count, 1);
    }
}