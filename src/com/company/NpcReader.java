package com.company;

import java.util.Scanner;
import com.company.Player;
public class NpcReader extends ComandReader  {
    int story = 1;
    int minAtack = 1;
    int minPlayerAtack = 3;

    /*int pAtack;
    int npcAtack;*/
    public static  final Scanner sc = new Scanner(System.in);
    String Cteni = sc.nextLine();

    public int PlayerRandomAtack (int minPlayerAtack,int playeraAtack )
    {
        var random = Math.floor(Math.random() * playeraAtack ) + minPlayerAtack;
        double d = random;
        int randomPAtack = (int)d;
        return randomPAtack;
    }
    public int NpcRandomAtack (int minAtack ,int atack )
    {
        var random = Math.floor(Math.random() * atack ) + minAtack;
        double d = random;
        int randomNpcAtack = (int)d;
        return  randomNpcAtack;
    }
    
    @Override
    public boolean reader (String Cteni) //todo peripisat nazvanije parsera
    {
        switch (Cteni)
        {
            case "Loot":

                return true;
            case "Fight":
                fight(  playerHp,   hp,  randomPAtack,  randomNpcAtack,  playeraAtack,  atack); //todo pls help i dont understand why it doesnt work
                return true;
            case "Lore":
                storyTell(story);
                return true;
            case "Skip":
                System.out.println("Да пребудет с тобой сила мой падаван. ");
                return true;
            case "Help":
                writeHelp();
                return true;
        }
        return false;

    }
    @Override
    public  void writeHelp()
    {
        System.out.println("Command *Loot* - Npc give some loot ");
        System.out.println("Command *Fight* - Fight with Npc ");
        System.out.println("Command *Lore* - Npc tell some story ");
        System.out.println("Command *Skip* - Npc do nothing and skip all event ");
        System.out.println("Help-show you comand for use");

    }
    public void storyTell(int story)
    {
        if(story == 1) //todo some vyzyvat istoriju iz drugogo faila +XML+ ili *CSV*
        {
            System.out.println("some story ");
            story ++;
        }
        else if (story == 2)
        {
            System.out.println("some story ");
            story ++;
        }
        else if (story == 3)
        {
            System.out.println("some story ");
            story ++;
        }
        else if (story == 4)
        {
            System.out.println("some story ");
            story ++;
        }
        else if (story == 5)
        {
            System.out.println("some story ");
            story ++;
        }
        else
            {
            System.out.println("i say all story ");

             }



    }
   
    public void fight (int playerHp,  int hp, int randomPAtack, int randomNpcAtack, int playeraAtack, int atack)
    {
        do {
             NpcRandomAtack( minAtack,atack);
             playerHp = (playerHp -  randomNpcAtack);
            System.out.println("Zbylo ti " +" "+  playerHp+" "+ "zivotu" );
            PlayerRandomAtack ( minPlayerAtack, playeraAtack );
            hp = hp - randomPAtack;
            System.out.println("Npc zbylo " +" "+  hp +" "+ "zivotu" );

        } while (playerHp <= 0 || hp <=0);

        if (playerHp <= 0)
        {
            System.out.println("You die" );
        }
        else if (hp <=0 )
        {
            System.out.println("Porazil jsi npc muzes pokracovat v ceste" );
        }
        else
            {
                System.out.println("error ");
            }

    }



}
