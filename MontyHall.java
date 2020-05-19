//Jamison Wilkes
//Monty Hall Program

import java.util.Scanner;
import java.util.Random;

public class MontyHall
{
   public static void main(String args[])
   {
      int contestantDoor = 0;
      int prizeDoor = 0;
      int openDoor = 0;
      int extraDoor = 0;  
      
      Random gen = new Random();
      Scanner xyz = new Scanner(System.in);
      
      prizeDoor = gen.nextInt(3)+1;
      
      openDoor = prizeDoor;

      while(openDoor == prizeDoor)
            {
            openDoor = gen.nextInt(3)+1;
            }
      extraDoor = openDoor;

      while(extraDoor == openDoor || extraDoor == prizeDoor)
            {
               extraDoor = gen.nextInt(3)+1;
            }
            
            
      System.out.println("Please select either door number 1, 2 or 3");
      contestantDoor = xyz.nextInt();
      if(contestantDoor == 1 || contestantDoor == 2 || contestantDoor == 3)
         System.out.println("Please continue with the game");
      while(contestantDoor != 1 && contestantDoor != 2 && contestantDoor != 3)
         {
            System.out.println("Please select 1, 2, or 3");
         }
         
      System.out.println("You chose door number: " + contestantDoor);
      
      if(prizeDoor + contestantDoor == 4) 
         { 
         openDoor = 2;
         }
      else if(prizeDoor + contestantDoor == 5) { 
             openDoor = 1;
         }
      else 
         { 
          openDoor = 3;
         }
         
      if(openDoor + contestantDoor == 4)
         {
         contestantDoor = 2;
         }
      else if(openDoor + contestantDoor == 5)
         {
         contestantDoor = 1;
         }
      else
         {
         contestantDoor = 3;
         }
      System.out.println("Behind door number " + extraDoor + " is a goat");  
      System.out.println("Would you like to switch your answer?");
      char answer = xyz.next().charAt(0);
      
      if (answer == 'y')
         {
            //contestantDoor = extraDoor;
            if(contestantDoor == extraDoor)
               contestantDoor = prizeDoor;
            else
            contestantDoor = extraDoor;
         }
      while(answer != 'y' && answer != 'n')
            {
                System.out.println("Please enter either y/n");
                answer = xyz.next().charAt(0);
            } 
      
       
      if(contestantDoor == prizeDoor)
         {
         System.out.println("You are the winner!");
         }
      else
         {
         System.out.println("Sorry you lost");
         }
         
      System.out.println("The prize was behind door number " + prizeDoor);
      
      
      System.out.println("You have a 33.33% chance of winning if you don't switch doors");
      System.out.println("You have a 66.67% chance of winning if you do switch doors");
   }
}