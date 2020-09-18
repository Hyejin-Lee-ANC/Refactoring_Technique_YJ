package decompose.conditional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class StadiumTest {

    private Stadium stadium;

    @BeforeEach
    public void setUp() {
        stadium = new Stadium();
        stadium.summerRate = 100;
        stadium.winterRate = 150;
        stadium.winterServiceCharge = 10;
    }

    @Test
    public void testTicketPrice_winter() {
        assertEquals(1510.0, stadium.getTicketPrice(new Date(Stadium.YEAR, 11, 25), 10));
    }

    @Test
    public void testTicketPrice_summer() {
        assertEquals(1000.0, stadium.getTicketPrice(new Date(Stadium.YEAR, 5, 1), 10));
    }
}