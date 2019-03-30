package org.gc.helloworldvolleyclient;

public class Match {
    public int id;
    public Team home;
    public Team away;
    public int homescore;
    public int awayscore;

    public String toString()
    {
        return "\nID: " + id + "\nHome: " + home + "\tAway: " + away + "\nHome Score: " + homescore + "\nAway Score: " + awayscore;
    }
}
