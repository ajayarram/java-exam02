/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question04;

/**
 *
 * @author Ajay Kumar Reddy Arram
 */

class Two extends One {
    
  
    // Driver Code
    public static void main(String[] args)
    {
        One one = new One();
        one.sum(6, 5);
        one.sum(1, 2, 3);// polymorphism: method overloading
  
        Two two = new Two();
  
        two.print();// polymorphism method overriding
    }
    
    public void print()
    {
        System.out.println("Class Two's method is ");
    }
}
