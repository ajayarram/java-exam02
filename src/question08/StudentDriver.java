/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question08;

/**
 *
 * @author Ajay Kumar Reddy Arram
 */
public class StudentDriver extends Student {

    /**
     * @param args the command line arguments
     */
    // type_of_degree() method implematation in this subclass
    @Override
    public void type_of_degree()
        {
            System.out.println("if a studnet joined in undergraduate course , "
                    + "he/she donot have any degree");
            System.out.println("if a studnet joined in Graduate course , "
                    + "he/she has undergraduate degree");
        }
    public static void main(String[] args) {
        // TODO code application logic here
   
        Student stu=new StudentDriver() ;
        stu.type_of_degree();
                
    }
    
}
