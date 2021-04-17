/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question01;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Ajay Kumar Reddy Arram
 */
public class RemovingDuplicates {

    /**
     * @param args the command line arguments
     * 
     */
    
    public static void removeDuplicate(ArrayList<Integer> list)
       {
        ArrayList<Integer> newList= new ArrayList<Integer>();
        
        for(Integer aList :list)
        {
            if(!newList.contains(aList))
            {
                newList.add(aList);
            }
        }
        System.out.print("The distinct integers are");
        for(Integer aList :newList)
        {
            System.out.print(" "+aList);
        }
        
        
       }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        ArrayList<Integer> list= new ArrayList<Integer>();
        System.out.print("Enter ten integers: ");
        for(int i=0;i<10;i++)
        {
            list.add(sc.nextInt());
        }
        
        removeDuplicate(list);
        
    }
    
       
    
}
