package datastructures.arrays.scoreboard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class GameEntryTest {

    @Test
    void lessThan() {
        var peter = new GameEntry("peter", 100);
        var rust = new GameEntry("rust", 200);
        assertTrue(peter.lessThan(rust));
    }
}