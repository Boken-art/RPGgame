package com.company;

import java.util.Scanner;

public class DungenMove extends ComandReader {
    int x = 0;
    int y = 0;
    public static final Scanner sc = new Scanner(System.in);
    String Cteni = sc.nextLine();

    @Override
    public boolean reader(String Cteni) //todo peripisat nazvanije parsera
    {
        switch (Cteni) {
            case "w":

                return true;
            case "s":

                return true;
            case "a":

                return true;
            case "d":

                return true;
            case "Help":
                writeHelp();
                return true;
        }
        return false;

    }

    @Override
    public void writeHelp() {
        System.out.println("Command *w* - Jdes dopredu ");
        System.out.println("Command *s* - Jdes dozadu ");
        System.out.println("Command *a* - Jdes do leva "); // -y
        System.out.println("Command *d* - Jdes do prava "); //+y
        System.out.println("Help-show you comand for use");

    }

    public void storyTell(int story) {
        if (x==1 && y==0 || x== -1 && y==0 )
        {

        }
        else if (x==2 && y==0 || x== -2 && y==0)
        {
//todo per
        }
        else if (x==3 && y==0 || x== -3 && y==0)
        {

        }
        else if (x==4 && y==0 || x== -4 && y==0)
        {
//todo per
        }
        else if (x==5 && y==0 || x== -5 && y==0)
        {

        }
        else if (x==6 && y==0 || x== -6 && y==0)
        {

        }
        else if (x==7 && y==0 || x== -7 && y==0)
        {

        }
        else if (x==8 && y==0 || x== -8 && y==0)
        {

        }
        else if (x==9 && y==0 || x== -9 && y==0)
        {

        }
        else if (x==10 && y==0 || x== -10 && y==0)
        {
//todo per final
        }
        else if (x==0 && y==0 )
        {
//todo tupik
        }
        else if (x==2 && y== -1 )
        {

        }
        else if (x==2 && y== 1 )
        {

        }
        else if (x==3 && y== 1 )
        {

        }
        else if (x==4 && y== 1 )
        {
//todo per
        }
        else if (x==4 && y== 2 )
        {

        }
        else if (x==5 && y== 1 )
        {

        }
        else if (x==6 && y== 1 )
        {
//todo dead
        }
        else if (x==5 && y== 2 )
        {

        }
        else if (x==6 && y== 2 )
        {
//todo per
        }
        else if (x==7 && y== 2 )
        {

        }
        else if (x==8 && y== 2 )
        {

        }
        else if (x==9 && y== 2 )
        {
//todo tupik
        }
        else if (x==6 && y== 3 )
        {

        }
        else if (x==7 && y== 3 )
        {

        }
        else if (x==8 && y== 3 )
        {
//todo per
        }
        else if (x==9 && y== 3 )
        {
//todo tupik
        }
        else if (x==8 && y== 4 )
        {

        }
        else if (x==9 && y== 4 )
        {

        }
        else if (x==10 && y== 4 )
        {
//todo final
        }
        else if (x== -2 && y== -1 )
        {

        }
        else if (x== -3 && y== -1 )
        {
//todo per
        }
        else if (x== -4 && y== -1 )
        {
//todo per
        }
        else if (x== -5 && y== -1 )
        {
//todo per
        }
        else if (x== -6 && y== -1 )
        {

        }
        else if (x== -7 && y== -1 )
        {

        }
        else if (x== -8 && y== -1 )
        {

        }
        else if (x== -9 && y== -1 )
        {

        }
        else if (x== -3 && y== -2 )
        {

        }
        else if (x== -4 && y== -2 )
        {

        }
        else if (x== -5 && y== -2 )
        {
//todo per
        }
        else if (x== -6 && y== -2 )
        {

        }
        else if (x== -5 && y== -3 )
        {

        }
        else if (x== -6 && y== -3 )
        {
//todo posxalka
        }
        else if (x== -2 && y== 1 )
        {

        }
        else if (x== -3 && y== 1 )
        {

        }
        else if (x== -4 && y== 1 )
        {
//todo per
        }
        else if (x== -4 && y== 2 )
        {

        }
        else if (x== -5 && y== 2 )
        {

        }
        else if (x== -6 && y== 2 )
        {
//todo dead
        }
        else
            {


            }
    }
}
