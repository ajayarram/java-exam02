/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question03;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Ajay Kumar Reddy Arram
 */
public class DisplayDiffObjects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Object> list=new ArrayList<Object>();
        Loan loan= new Loan(10000.0,12.0,2.5);
        Circle circle=new Circle(5.0);
        Date date=new Date();
        String str="Hello";
        
        list.add(loan);
        list.add(circle);
        list.add(date);
        list.add(str);
        for(Object obj:list)
        {
            System.out.println(obj);
        }
        
    }
    
}
