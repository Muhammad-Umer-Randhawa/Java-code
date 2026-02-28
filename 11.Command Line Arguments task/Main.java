public class Main{
    public static void main(String[] args) {
        int num1 = Integer.valueOf(args[0]);
        int num2 = Integer.valueOf(args[1]);

        int result = sum(num1, num2);
        System.out.println("Sum: " + result);

        int num3 = Integer.valueOf(args[2]);
        int num4 = Integer.valueOf(args[3]);

        int result2 = sum2(num3, num4);
        System.out.println("Sum: " + result2);
    }
    static int sum(int a, int b){
        return a+b;
    }
    static int sum2(int a, int b){
        return a+b;
    }
}