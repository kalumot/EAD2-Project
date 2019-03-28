package org.gc.helloworldvolleyclient;

public class Match {
    public int ID;
    public Team Home = new Team();
    public Team Away = new Team();
    //public int HomeScore;
    //public int AwayScore;

    public String toString()
    {
        return ID + " " + Home + " " + Away;
    }
}
