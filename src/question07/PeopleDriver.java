/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question07;
import java.lang.Enum;

/**
 *
 * @author Ajay Kumar Reddy Arram
 */
public class PeopleDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("The salary of " + People.CHINTU + " is $" + 
                People.CHINTU.getSalary());
        System.out.println("The salary of " + People.BANTU + " is $" + 
                People.BANTU.getSalary());
        System.out.println("The salary of " + People.PINTU + " is $" + 
                People.PINTU.getSalary());
        
        // using valueOf() method for enums
        
        System.out.print("These three people belong to same familiy and total"
                + " salary of the family is: $");
        System.out.println(+People.valueOf("CHINTU").getSalary()
        +People.valueOf("BANTU").getSalary()+People.valueOf("PINTU").getSalary());
    }

    }
    
