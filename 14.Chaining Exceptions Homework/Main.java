public class Main{
    public static void main(String[] args){
        calculate1(8, 0);
        try{
            calculate2();
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            System.out.println("Hanlding ArrayIndexOutOfBoundsException.");
        }
    }
    static void calculate1(int a, int b){
        try{
            int c = a/b;
            System.out.println("Result: " + c);
            throw new ArithmeticException("ArithmeticException thrown by using throw keyword.");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    static void calculate2(){
        try{
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);
            throw new ArrayIndexOutOfBoundsException("ArrayIndexOutOfBoundsException thrown by thrown keyword.");
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println("Handling ArithmeticException.");
        }
    }
}