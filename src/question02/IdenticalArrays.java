/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question02;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Ajay Kumar Reddy Arram
 */
public class IdenticalArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][]m1= new int[3][3];
        int [][]m2= new int[3][3];
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter list 1: ");
        for(int row=0;row<m1.length;row++)
        {
            for(int col=0;col<m1[row].length;col++)
            {
                m1[row][col]=sc.nextInt();
            }
        }
        
        System.out.print("Enter list 2: ");
        for(int row=0;row<m2.length;row++)
        {
            for(int col=0;col<m2[row].length;col++)
            {
                m2[row][col]=sc.nextInt();
            }
        }
        
        if(equals(m1,m2))
        {
            System.out.println("The two arrays are strictly identical");
        }
        else
            System.out.println("The two arrays are not strictly identical");
        
        
    }
    
    public static boolean equals(int[][] m1, int[][] m2)
    {
//     if(m1.equals(m2)){
//         return true;
//     }
//     else
//         return false;
//    }
        
        for(int row=0;row<m1.length;row++)
        {
            for(int col=0;col<m1[row].length;col++)
            {
                if(m1[row][col]!=m2[row][col])
                {
                     return false;
                }
            }
        }
        
            return true;    
}
}