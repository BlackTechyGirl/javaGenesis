package chapterThree;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ClockTest {
    @Test
    void checkDisplayTime(){
        Clock clock = new Clock(24, 60, 60);
        assertEquals("00:00:00", clock.displayTime());
    }
}
