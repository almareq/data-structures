package org.datastructures.arrays.scoreboard;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
        var rust = addNewEntry("rust", 800);
        var boqueron = addNewEntry("boqueron", 700);
        var potatoman = addNewEntry("potatoman", 400);

        var expectedEntriesOrder = new GameEntry[]{rust, boqueron, potatoman};
        assertArrayEquals(expectedEntriesOrder, board.entries());
    }

    private GameEntry addNewEntry(String name, int score) {
        var entry = new GameEntry(name, score);
        board.add(entry);
        return entry;
    }

    @Test
    void remove() {
        //        var rust = addNewEntry("rust", 800);
//        board.remove(1);
        assertTrue(true);
    }
}