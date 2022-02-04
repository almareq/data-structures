package datastructures.arrays.scoreboard;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ScoreBoardTest {

    private ScoreBoard board;

    @BeforeEach
    void setUp() {
        board = new ScoreBoard(2);
    }

    @Test
    void add() {
        GameEntry peter = addNewEntry("peter", 300);
        GameEntry rust = addNewEntry("rust", 800);
        GameEntry boqueron = addNewEntry("boqueron", 700);

        var entries = board.entries();
        assertSame(entries[0], rust);
        assertSame(entries[1], boqueron);
        assertFalse(Arrays.asList(entries).contains(peter));
    }

    private GameEntry addNewEntry(String name, int score) {
        var entry = new GameEntry(name, score);
        board.add(entry);
        return entry;
    }
}