/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question06;
import java.util.Scanner;

/**
 *
 * @author Ajay Kumar Reddy Arram
 */
public class TriangleDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        boolean isColorFilled = false;
        double side1;
        double side2;
        double side3;
        do {
            
            System.out.println("Enter side1 of triangle: ");
            side1 = scan.nextDouble();
            System.out.println("Enter side2 of triangle: ");
            side2 = scan.nextDouble();
            System.out.println("Enter side3 of triangle: ");
            side3 = scan.nextDouble();
            if (side1 + side2 <= side3 || side2 + side3<= side1 || side3 + side1 <= side2) {
                System.out.println("The sum of two sides of a traingle must always "
                        + "be greater than the third side. Please renter the sides of triangle");   
            }
            else
            {
                isColorFilled = true;
            }
        } while (isColorFilled== false);
        
        if(isColorFilled==true)
        {
        Triangle triangle = new Triangle(side1, side2, side3, "green", true);
        System.out.println(triangle);
        }
    }
}
