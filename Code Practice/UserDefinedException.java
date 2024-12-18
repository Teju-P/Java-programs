class LowBalance extends Exception{
    public String toString(){
        return "Account has the low balance: The bank balance can never be less than $7000/-";
    }
}

class BankAccount{
    private int bal = 7000;
    public void addMoney(int money){
        bal += money;
        System.out.println("Credited $"+money+" to account. Balance = $"+bal);
    }
    public void checkBal(){
        System.out.println("Checking balance.....Balance = $"+bal);
    }
    public void withDraw(int amount){ 
        if((bal-amount)<7000){
            try{
                throw new LowBalance();
            }catch(LowBalance e){
               System.out.println( e.toString());
               System.out.println("You can withdraw only $"+(bal-7000)+" from your account.");
            }
        }
        else {
            bal -= amount;
            System.out.println("You have withdrawn $"+amount+". Balance = $"+bal);
        }
    }
}

public class UserDefinedException {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        b1.checkBal();
        b1.addMoney(10000);
        b1.checkBal();
        b1.withDraw(30000);
        b1.checkBal();
    }
}
