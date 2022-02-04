package org.datastructures.arrays.scoreboard;

public class ScoreBoard {

    private int numEntries = 0;
    private final GameEntry[] board;

    public ScoreBoard(int capacity) {
        board = new GameEntry[capacity];
    }

    public GameEntry[] entries() {
        return board;
    }

    public void add(GameEntry newEntry) {
        if (qualifiesForBoard(newEntry)) {
            sortNewEntry(newEntry);
        }
    }

    public void remove(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= numEntries) {
            throw new IndexOutOfBoundsException("Invalid index " + index);
        }

        if (numEntries - 1 - index >= 0) {
            System.arraycopy(board, index + 1, board, index, numEntries - 1 - index);
        }

        board[numEntries - 1] = null;
        numEntries--;
    }

    private boolean qualifiesForBoard(GameEntry newEntry) {
        return boardNotFull() || lastRecord().lessThan(newEntry);
    }

    private GameEntry lastRecord() {
        return board[numEntries - 1];
    }

    private boolean boardNotFull() {
        return numEntries < board.length;
    }

    private void sortNewEntry(GameEntry newEntry) {
        if (boardNotFull()) {
            numEntries++;
        }

        int j = numEntries - 1;
        while (j > 0 && board[j - 1].lessThan(newEntry)) {
            board[j] = board[j - 1];
            j--;
        }
        board[j] = newEntry;
    }
}
