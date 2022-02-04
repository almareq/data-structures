package org.datastructures.arrays.scoreboard;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ScoreBoardTest {

    public static final int CAPACITY = 3;

    private ScoreBoard board;

    @BeforeEach
    void setUp() {
        board = new ScoreBoard(CAPACITY);
    }

    @Test
    void add() {
        addNewEntry("peter", 300);
        GameEntry rust = addNewEntry("rust", 800);
        GameEntry boqueron = addNewEntry("boqueron", 700);
        GameEntry potatoman = addNewEntry("potatoman", 400);

        GameEntry[] expectedEntriesOrder = new GameEntry[]{rust, boqueron, potatoman};
        assertArrayEquals(expectedEntriesOrder, board.entries());
    }

    private GameEntry addNewEntry(String name, int score) {
        var entry = new GameEntry(name, score);
        board.add(entry);
        return entry;
    }
}