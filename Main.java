import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
     //Variables.
     int numDays;
     double earnings = 0.01;
     double totalEarned = 0.00;
     
     //Create a Scanner object called keyboard to read keyboard input from user.
     Scanner keyboard = new Scanner(System.in);

     //Get number of days worked from user.
     System.out.println("How many days do you want to be considered when calculating your salary?");
     numDays = keyboard.nextInt();

     //Input validation.
     while (numDays < 1)
     {
       System.out.println("Re-enter a valid number of days. Note: Number of days worked cannot be less than 1.");
       /*Continue to receive input from users who make invalid entries*/
       numDays = keyboard.nextInt();
     }

     
     System.out.println("Day(s)\t\tSalary");
     System.out.println("_________________");
     for (int days = 1; days <= numDays; days++)
       {
         System.out.println(days + "\t\t$" + earnings);
         //Add the amount earned to the total.
         totalEarned += earnings;
         //Double the earnins after each iteration.
         earnings *= 2;
       }

     //Print the total salary for the given number of days.
     System.out.printf("Total Salary: $%,.2f", totalEarned);
     

   }
}
