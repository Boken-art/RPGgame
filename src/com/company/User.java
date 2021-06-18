package com.company;


public class User {
    String name;
    public int hp = 0 ;
    public int atack = 0 ;

    public User(String name, int hp , int atack)
    {

        this.name = name ;
        this.hp = hp ;
        this.atack = atack ;
    }

    public String getName() {
        return name;
    }
    public int getHp() { return hp; }
    public int getAtck() {return atack; }

    public void setName(String name) {
        this.name = name;
    }

}
