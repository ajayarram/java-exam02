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
public class Person {
    private String name;
    private String address;
    private String phone_number;
    private String email_address;

    public Person(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        phone_number = phone;
        email_address = email;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone_number;
    }

    public String getEmail() {
        return email_address;
    }

    @Override
    public String toString() {
        return  "Name: " + name + ", address=" + address + ", phone_number=" + 
                phone_number + ", email_address=" + email_address;
    }
    

   
    
}
