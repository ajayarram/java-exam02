/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question05;
import java.util.Date;
/**
 *
 * @author Ajay Kumar Reddy Arram
 */
public class PersonDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date hiredDate=new Date(07, 07, 18);
        Person person = new Person("Ajay","Karimnagar","970777772","ajay@gmail.com");

        Student student = new Student(9.8,"teja","guntur",
                        "989878978","teja@gmail.com");

	Employee employee = new Employee("Banjara Hills roadno:2 ",25000.0,hiredDate,
                        "chinnaSai","Banjara Hills","666666666","chinnasai@gmail.com");

	Faculty faculty = new Faculty(40,3,"Banglore roadno:3",135000.0,
                        hiredDate,"peddasai","karnataka","6677755666","peddasai@gmail.com");

	Staff staff = new Staff("labIncharge","Hydreabad",10000.0,
                        hiredDate,"raman","telangana","888899978",
                        "raman@gmail.com");
    // Invoke toString of Person, Student, Employee, Faculty and Staff
		System.out.println(person);
		System.out.println(student);
		System.out.println(employee);
		System.out.println(faculty);
		System.out.println(staff);
	}
    }
    
