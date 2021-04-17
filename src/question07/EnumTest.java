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
public class EnumTest {
    
 AnimalTypes type;
 public EnumTest(AnimalTypes type) {
   this.type = type;
 }
 public void typeOfAnimal() {
   switch(type) {
     case HERBIVORES:
       System.out.println("This type of animal depends on plants matter for food");
       break;
     case CARNIVORES:
       System.out.println("This type of animal depends on animal matter for food");
       break;
     case OMNIVORES:
       System.out.println("This type of animal depends on both  plants and animal matter for food");
       break;
     default:
       System.out.println("Invalid entry");
       break;
   }
 }
}
