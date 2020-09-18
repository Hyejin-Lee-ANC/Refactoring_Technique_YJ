package encapsulate.collection;

import java.util.Set;

class Person {
    private Set courses;

    public Set getCourses() {
        return courses;
    }
    public void setCourses(Set arg) {
        courses = arg;
    }
}
