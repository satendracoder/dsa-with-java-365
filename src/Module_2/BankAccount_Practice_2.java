package Module_2;

//✅ Practice-2: Encapsulation
public class BankAccount_Practice_2 {
    private double balance;
    public void setBalance(double amount){
        if (amount > 0){
            balance = amount;
        }
    }

    public double getBalance(){
        return balance;
    }
}
