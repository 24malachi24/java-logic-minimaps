
/**
 * Write a description of class TaxReturn here.
 *
 * @Malachi Robinson
 * @YDY946
 */
public class TaxReturn
{
    // instance variables - replace the example below with your own
    public class Tax {
   //Declaring instance variables
   private String maritalStatus;
   private int income;
   private double taxedOwed;

   //Parameterized constructor
   public Tax(int income, String maritalStatus) {
       this.income = income;
       this.maritalStatus = maritalStatus;
   }

   //This method will calculate the tax based on the marital status and income
   public void calculateTax() {

       if (maritalStatus.equalsIgnoreCase("single")) {
           if (income > 0 && income < 8000) {
               taxedOwed = 0.10 * income;
           } else if (income > 8000 && income < 32000) {
               taxedOwed = 800 + (income - 8000) * 0.15;
           } else if (income > 32000) {
               taxedOwed = 4400 + 0.25 * (income - 32000);
           }
       } else if (maritalStatus == "single") {
           if (income > 0 && income < 16000) {
               taxedOwed = 0.10 * income;
           } else if (income > 16000 && income < 32000) {
               taxedOwed = 1600 + (income - 16000) * 0.15;
           } else if (income > 64000) {
               taxedOwed = 8800 + 0.25 * (income - 64000);
           }
       }
   }
   public double getTaxesOwed()
   {
       return taxedOwed;
   }
}
}

