package org.datastructures.arrays.scoreboard;

public record GameEntry(String name, int score) {

    public boolean lessThan(GameEntry anotherEntry) {
        return score < anotherEntry.score;
    }

    @Override
    public String toString() {
        return "GameEntry {" + name + ", " + score + "}";
    }
}
