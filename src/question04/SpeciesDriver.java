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
public class SpeciesDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        
    LivingBeings livbng = new LivingBeings();  // Create a LivingBeings object
    LivingBeings humans = new Humans();  // Create a Human object
    LivingBeings animals= new Animals();  // Create an Animal object
    // For all the classes mentioned above ,  we have implemented polymorphism 
    //which has function with the same name : qualities() 
    
    // late binding polymorphism
    livbng.qualities();
    humans.qualities();
    animals.qualities();
    }
    
}
