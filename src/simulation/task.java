/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulation;

import static java.lang.Math.log;
import java.util.Random;
import java.util.Scanner;
import static jdk.nashorn.internal.parser.TokenType.EOF;

/**
 *
 * @author rajesh
 */
public class task {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int start = 1,end,at,bt,r,x = 0,y = 0,counter=1,num=1,flag=0;
        
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the Generation (n) : ");
        end = sc.nextInt();
        at = end;
        bt = 0;
        

        while(at!=0)
        {   
            r = Generate_Random_Int(start, end, random);
            if(r <= at || at==0)
            {
                x = at--;
                y = bt++;
            }
            else
            {
                
                x = at++;
                y = bt--;
            }
          
         System.out.println("The Random Number : "+r+" 'at' = "+at);
         
         if(x!=1)
         {
             System.out.println("State for Dog-1 : "+x +" --> State for Dog-2 : "+y);
         }
         
         
         counter++;   
        }
        System.out.println("State for Dog-1 : "+at +" --> State for Dog-2 : "+bt);
        System.out.println("Number of Iteration Needed : " +counter);
    
       
    }
    
    public static int Generate_Random_Int(int aStart, int bEnd,Random aRandom)
    {
        
        long range = (long)bEnd - (long)aStart + 1;
        long fraction = (long)(range * aRandom.nextDouble());
        int randomNumber =  (int)(fraction + aStart); 
        
    return randomNumber;
    }
    
}
