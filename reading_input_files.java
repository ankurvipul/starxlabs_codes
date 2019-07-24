/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package internship;

import java.io.FileReader;

/**
 *
 * @author ADMIN
 */
public class reading_input_files {
    public static void main(String[] args)
    {
        try{
       FileReader fr=new FileReader("C:\\Users/ADMIN/Desktop/happy_numbers.txt");
       FileReader fr1=new FileReader("C:\\Users/ADMIN/Desktop/prime_nos.txt");
        int i;    
        String result_happy = "";
        String result = "";
          while((i=fr.read())!=-1)  
              result_happy = result_happy + (char)i;
          
             
          fr.close();    
          String[] happy = result_happy.split(",");
          
          
          int j;
          while((j=fr1.read())!=-1)  
              result = result + (char)j;
          
          fr1.close();
          String result_prime = result.replaceAll("\\s+", "");
          String[] prime = result_prime.split(",");
          
      
          
          for(int k=0;k<prime.length;k++)
          {
              int number = Integer.parseInt(prime[k]);
              
              for(int l=0;l<happy.length;l++)
              {
                  int number_2 = Integer.parseInt(happy[l]);
                  
                  if(number == number_2)
                  {
                      System.out.println(number_2);
                      break;
                  }
              }
              
          }
          
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
}
