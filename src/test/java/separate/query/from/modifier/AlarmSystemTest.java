package separate.query.from.modifier;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.mockito.Mockito.*;

class AlarmSystemTest {
    @Test
    public void testAlertMiscreant() {
        PassengerScanner scanner = mock(PassengerScanner.class);
        doReturn(Arrays.asList("Johnny", "Donny", "Jenny", "Don")).when(scanner).getPassengers();
        AlarmSystem system = spy(new AlarmSystem(scanner));

        system.patrol();
        verify(system, times(1)).notify("Don");
        verify(system, times(1)).setOffAlarms();
    }
}