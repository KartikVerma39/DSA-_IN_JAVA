//2. Bank Account Simulation:-
//        =======================
//
//Create a BankAccount class:
//        - int accountNumber
//- String accountHolderName
//- double balance
//
//Methods:
//        - deposit(amount)
//- withdraw(amount)
//- displayBalance()
//
//Use a loop to perform multiple transactions.
//
//double[] transactions = {1000, -2000, -4000, 3000};//Do not need to create array just copy this array and use  for-each loop.
//
//Rules
//- Withdrawal only if sufficient balance (if)

public class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance = 0;

    void deposit(double amount){
        balance = balance + amount;
    }

    void withdraw(double amount){
        if(balance >= amount){
            balance = balance - amount;
        }
        else if(balance < amount){
            System.out.println("THE WITHDRAWL AMOUNT IS TOO HIGH");
        }
    }

    void displayBalance(){
        System.out.println("Your Ball Amount is : " + Math.round(balance*100.0)/100.0);
    }

    public static void main(String[] args){
        double[] transactions = {1000 , -2000 , -4000 , 3000};
        BankAccount bank = new BankAccount();
        for(double it: transactions){
            if(it > 0){
                bank.deposit(it);
            }
            else if(it < 0){
                bank.withdraw(Math.abs(it));
            }
            bank.displayBalance();
        }
    }
}


