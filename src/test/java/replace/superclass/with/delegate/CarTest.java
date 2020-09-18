package replace.superclass.with.delegate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    @Test
    public void testName() {
        Car car = new Car("hyundai", "genesis", 50, 200);
        assertEquals("hyundai genesis (200.0CV)", car.getName());
    }
}