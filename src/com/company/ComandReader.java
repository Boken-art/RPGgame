package com.company;

import java.util.Scanner;


public class ComandReader {

    public static  final Scanner sc = new Scanner(System.in);
   String Cteni = sc.nextLine();


    public boolean reader (String Cteni)
    {
        switch (Cteni)
        {
            case "Exit":
                //todo how to exit from app
                closeProgram();
                return true;
            case "Help":
                writeHelp();
                return true;
        }
        return false;


    }
    public  void writeHelp()
    {
        System.out.println("Exit-exit from app");
        System.out.println("Help-show you comand for use");

    }
    private void closeProgram() {
        System.exit(0);
    }
}
