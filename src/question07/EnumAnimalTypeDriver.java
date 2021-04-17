/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question07;

/**
 *
 * @author Ajay Kumar Reddy Arram
 */
public class EnumAnimalTypeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
   EnumTest animaltype1 = new EnumTest(AnimalTypes.CARNIVORES);
    System.out.println("Carnivores animal means: ");
   animaltype1.typeOfAnimal();
   EnumTest animaltype2 = new EnumTest(AnimalTypes.HERBIVORES);
    System.out.println("HERBIVORES animal means: ");
   animaltype2.typeOfAnimal();
   EnumTest animaltype3 = new EnumTest(AnimalTypes.OMNIVORES);
    System.out.println("OMNIVORES animal means: ");
   animaltype3.typeOfAnimal();
   
 }
}
    