/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question06;

/**
 *
 * @author Ajay Kumar Reddy Arram
 */
public class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3, String color, boolean filled) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double calcArea() {
        double semiPerimeter =calcPerimeter()/2;
        return Math.round(Math.sqrt(semiPerimeter*(semiPerimeter-side1)*(semiPerimeter-side2)
                *(semiPerimeter-side3))*100)/100.0;
    }

    @Override
    public double calcPerimeter() {
       return Math.round(side1+side2+side3);
               }

    @Override
    public String toString() {
        return "Area of Trainagle is: "+calcArea()+"cm\n Perimeter of Triangle is: "+calcPerimeter()+
                "cm\n Color in Triangle is: "+super.getColor()+"\n IsTriangleFilled: "+super.filled();
    }
    
}
   

