/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package internship;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class rock_paper_scissor {
    public static void main(String[] args)
    {
        System.out.println("Welcome to Rock Paper Scissor Game.. Below Are the Rules: ");
        System.out.println("Press 0 for rock");
        System.out.println("Press 1 for paper");
        System.out.println("Press 2 for scissor");
        
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int input = sc.nextInt();
        
        if(input < 0 || input >= 3)
        {
            System.out.println("OOPS!! you entered a wrong input");
        }
        else{
           int input_b = random.nextInt(3);
           System.out.println("Another player "+input_b);
           if(input_b == 0)
           {
               System.out.println("Another player selected Rock");
           }
            if(input_b == 1)
           {
               System.out.println("Another player selected Paper");
           }
             if(input_b == 2)
           {
               System.out.println("Another player selected Scissor");
           }
           
           if(input == 0 && input_b == 0)
           {
               System.out.println("Draw");
           }
           if(input == 0 && input_b == 1)
           {
               System.out.println("OOPS.. You lost");
           }
           if(input == 0 && input_b == 2)
           {
               System.out.println("BINGO.. You won");
           }
           if(input == 1 && input_b == 0)
           {
               System.out.println("BINGO.. You won");
           }
            if(input == 1 && input_b == 1)
           {
               System.out.println("Draw");
           }
             if(input == 1 && input_b == 2)
           {
               System.out.println("OOPS.. You lost");
           }
             if(input == 2 && input_b == 0)
           {
               System.out.println("OOPS.. You lost");
           }
            if(input == 2 && input_b == 1)
           {
               System.out.println("BINGO.. You won");
           }
             if(input == 1 && input_b == 2)
           {
               System.out.println("Draw");
           }
             
           
        }
        
    }
    
}
