package org.gc.helloworldvolleyclient;

public class Team {
    public int id;
    public String name;
    public String code;
    public teamImg img;

    public Team(int ID, String name, String code) {
        this.id = id;
        this.name = name;
        this.code = code;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public void setID(int ID) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String toString()
    {
        return "\nID: " + id + "\nName: " + name + "\nCode: " + code;
    }
}
