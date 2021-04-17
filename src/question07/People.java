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
public enum People {
    CHINTU(20000),BANTU(30000),PINTU(40000);
    
    private int salary;
    private People(int salary){
        this.salary=salary;
    }
    
    public int getSalary(){
        return salary;
    }
}
