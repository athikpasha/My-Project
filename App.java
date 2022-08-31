import java.util.*;
import java.lang.*;
import java.io.*;

public class App
{
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        System.out.println("!!! WELCOME TO THE NUMBER GUESS GAME !!!");
        System.out.println("GAME RULES:");
        System.out.println("1.YOU NEED TO GUESS A RANDOM NUMBER");
        System.out.println("2.YOU HAVE TO GUESS IN LESS THAN 5 CHANCES");
        System.out.println("3.IF YOU GUESS THE NUMBER CORRECTLY YOU WILL BE PROMOTED TO NEXT LEVEL");
        System.out.println("4.YOU NEED TO ENTER A NUMBER BETWEEN 1 TO 100 ");
        System.out.println("YOU HAVE 3 LEVELS");
        Random rand = new Random();
        int chance=5;
        int score=0;
        boolean flag = false;
        System.out.println("LET'S BEGIN THE GAME");
        for(int i =1;i<4;i++)
        {
            flag = false;
            int rand_number = rand.nextInt(100)+1;
            System.out.println();
            //System.out.println("NUMBER IS :"+rand_number);
            System.out.println("LEVEL:"+i);    
            int p=1;
            for(int j=1;j<=chance;j++)
            {
                
                System.out.println("CHANCE :"+ p++ +"\n");
                int num1 = sc.nextInt();
                if(num1>rand_number)
                System.out.println("ENTER A SMALLER NUMBER");
                else if(num1<rand_number)
                System.out.println("ENTER A GREATER NUMBER");
                else 
                {
                    if(num1==rand_number)
                    {
                        score=score+10;
                        System.out.println("HURRAYY!!! YOU GUSSED CORRECTLY");
                        if(i!=3)
                        {
                            System.out.println("CONGRATS..!! YOU ARE QUALIFIED TO "+(i+1)+" LEVEL");
                        }
                        else{
                        System.out.println("YOU WON THE GAME..!!!");
                        System.out.println("!!!...CONGARTUALTIONS...!!!");
                        }
                        flag=true;
                        break;
                    }
                }
            }
            if(flag==false)
            {
                System.out.println("YOU LOST THE GAME :( ");
                System.out.println("PLAY FROM BEGINNING");
                break;
            }   
         }
         System.out.println();
         System.out.println("YOUR SCORE IS:"+score);
         System.out.println("THANKS FOR PLAYING..!!");
    }

}