public class Main {
    public static void main(String[] args){
        BankAccount b1 = new BankAccount("John");
        b1.deposit(10000);
       System.out.println(b1.printStatement());
     }
}
