/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question09;

/**
 *
 * @author Ajay Kumar Reddy Arram
 */
public class ImplementsCar implements Car {
    String carCompany="BMW";
    String carModel="Q4 series";
    
     @Override
    public void companyOfCar() {
        System.out.println("The company of Car is :"+carCompany);
    }

    @Override
    public void carModel() {
        System.out.println("The company of Car is :"+carModel);
    }
    
}
