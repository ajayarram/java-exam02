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

class One {
    private int a, b, c;
  
    public void sum(int a, int b)
    {
        this.a = a;
        this.b = b;
        System.out.println("Sum of two integrs  is:" + (a + b));
    }
  
    public void sum(int x, int y, int z)
    {
        a = x;
        b = y;
        c = z;
        System.out.println("sum of a+b+c is:" + (a + b + c));
    }
  
    public void print()
    {
        System.out.println("Class one's method is executing");
    }
}
