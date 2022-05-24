package guru.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstTest {
    @Test
    void firstTest() {
        Assertions.assertFalse(10 < 8);
    }


    @Test
    void SecondTest() {
        Assertions.assertFalse(25 < 33);
    }
}
