package org.gc.helloworldvolleyclient;

public class Match {
    public int id;
    public Team home;
    public Team away;
    public int homeScore;
    public int awayScore;

    public String toString()
    {
        return home.toString() + "| " + homeScore + ":" + awayScore + " |" + away.toString();
    }
}
