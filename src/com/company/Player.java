package com.company;

import java.util.Scanner;

public class Player {
public String playerName;
    public int  playerHp  ;
    public int playeraAtack ;
    public Player(String playerName, int playerHp, int playeraAtack)
    {
        this.playerName = playerName;
        this.playerHp = playerHp;
        this.playeraAtack = playeraAtack;
    }

    public void setPName(){
        System.out.println("Zadej jmeno hrace: ");
        Scanner Jmeno = new Scanner(System.in);
        this.playerName = Jmeno.nextLine();
    }

    public void setPHp()
    {
        this.playerHp = 100;
    }
    public void setPAtack()
    {
        this.playeraAtack = 10;
    }

    public static int getPHp() {
        return playerHp;
    }
    public int getPAtack() {
        return playeraAtack;
    }
}
