/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question05;

/**
 *
 * @author Ajay Kumar Reddy Arram
 */
public class Student extends Person {
    private double grade;
    public static final String status="Graduate";

    public Student(double grade, String name, String address, String phone_number,
            String email_address) {
        super(name, address, phone_number, email_address);
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student Name: " + super.getName() + ", address=" + super.getAddress() + ", phone_number=" + 
                super.getPhone() + ", email_address: " + super.getEmail()+", grade: " + grade;
    }
    
    
}
