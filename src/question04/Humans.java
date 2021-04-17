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
public class Humans extends LivingBeings{ // inheritance applied here as we can 
    //see that Humans class aquires the properties of LvingBeings class

    @Override
    public void qualities() {
        super.qualities(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("But humans can cook food , innovate things and think clearly");
    }
    
}
