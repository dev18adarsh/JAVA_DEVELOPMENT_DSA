package Basics_Learning.OOPS_practice.Encapsulation_Inheritance_Practice;

public class BankAccount {
    private String AccountNo;
    private double AccountBalance;

    public String getAccountNo(){
        return AccountNo;
    }

    public void setAccountBalance(double amount){
        if(amount < 0){
            System.out.println("Transactions can't be negative.");
        }
        else{
            this.AccountBalance = amount;
        }
    }
}
