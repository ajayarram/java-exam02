/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question03;

/**
 *
 * @author Ajay Kumar Reddy Arram
 */
public class Circle {
     private double radius;
     private double circumference;
     private double area;

    public Circle(double radius)
    {
        this.radius = radius;
        circumference = 2*3.14*radius;
        this.area = 3.14*radius*radius;
    }
    
     @Override
    public String toString() {
        return "Circle Details are :" + "radius=" + radius + ", circumference=" + circumference + ", area=" + area;
    }
    
}
