/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package internship;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class formula_based {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String D = sc.next();
        int C = 50;
        int H = 30;
        String output="";
        
        if(D.contains(","))
        {
            String[] ar = D.split(",");
            for(int i=0;i<ar.length;i++)
            {
                int d = Integer.parseInt(ar[i]);
                int Q = (int) Math.sqrt((2*C*d)/H);
                output = output + Q + ",";
            }
            System.out.println(output);
            
            
        }
        else{
            int d = Integer.parseInt(D);
            int Q = (int) Math.sqrt((2*C*d)/H);
            System.out.println(Q);
        }
    }
    
}
