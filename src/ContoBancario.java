public class ContoBancario {
    
    private int accountNumber;
    private int balance;

    public ContoBancario(int accountNumber){
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public int getAcconuntNumber(){
        return this.accountNumber;
    }

    public int getBalace(){
        return this.balance;
    }

    public void withdraw(int amount){
        if(this.balance < amount){
            this.balance = 0;
        }else{
            this.balance -= amount;
        }
    }

    public void deposit(int amount){
        this.balance += amount;
    }
}
