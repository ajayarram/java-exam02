/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question03;

/**
 *
 * @author Ajay Kumar Reddy Arram
 */
public class Loan {
    
    private double amount;
    private double rateOfInterest;
    private double timePeriodInYears;
    public Loan(double amountIn , double rateOfInterestIn,double timePeriodInYearsIn)
     {
         amount=amountIn;
         rateOfInterest=rateOfInterestIn;
         timePeriodInYears=timePeriodInYearsIn;
         
     }
      @Override
    public String toString() {
        return "Loan Details are :\n" + "amount= " + amount + ", rateOfInterest="
                + rateOfInterest + ", timePeriodInYears=" + timePeriodInYears ;
    }
    
}
