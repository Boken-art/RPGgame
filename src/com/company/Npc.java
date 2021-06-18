package com.company;

public class Npc extends User{

    public Npc(String name, int hp, int atack)
    {
        super(name, hp, atack);
    }
    public void setName(){
        this.name = "PC";
    }
    public void setHp(){
        this.hp = 300;
    }
    public void setAtack(){
        this.atack = 6;
    }
}
