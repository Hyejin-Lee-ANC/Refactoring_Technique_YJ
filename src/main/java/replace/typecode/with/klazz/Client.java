package replace.typecode.with.klazz;

public class Client {
    void doThing(Person child) {
        // Somewhere in client code.
        Person parent = new Person(Person.O);
        if (parent.getBloodGroup() == Person.AB) {
            // ...
        }
        child.setBloodGroup(parent.getBloodGroup());
    }
}
