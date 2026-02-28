public class Main{
    public static void main(String[] args){
        try{
            calculate(4, 0);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println("Handling ArithmeticException.");
        }
    }
    static void calculate(int a, int b){
        try{
            int c = a/b;
            System.out.println("Result = " + c);
        }
        catch(ArithmeticException e){
            throw new ArithmeticException("Arithmetic Exception thrown.");
        }
    }
}