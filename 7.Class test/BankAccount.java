public class BankAccount{
    private String Aname;
    private String Atype;
    private double balance;

    public BankAccount(String Aname){
        this.Aname = Aname;
        this.Atype = "Savings";
        this.balance = 100000;
    }

    public BankAccount(String Aname, String Atype, double balance){
        this.Aname = Aname;
        this.Atype = "Savings";
        this.balance = 100000;
    }
    public void deposit(double amount){
        balance += amount;
        System.out.println("You deposit " + amount);
    }
    public void withdraw(double amount){
        if(amount < balance){
            balance -= amount;
            System.out.println("You withdraw " + amount);
        }
        else{
            System.out.println("NAN");
        }
    }
    public String printStatement(){
        return "Your account name is " + Aname + "Your account type is " + Atype + "Your current balance is " + balance;
    }
}