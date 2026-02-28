public class Main{
    static class Calc{
        int var1;
        int var2;

        int add(int var1, int var2){
            return var1+var2;
        }
        int subtract(int var1, int var2){
            return var1-var2;
        }
        int product(int var1, int var2){
            return var1*var2;
        }
        float divide(float var1, float var2){
            return var1/var2;
        }
    }
    public static void main(String[] args) {
        Calc mycalc = new Calc();
        int sum = mycalc.add(100, 200);
        int subtract = mycalc.subtract(200, 90);
        int multiply = mycalc.product(2, 9);
        float divide = mycalc.divide(5.0f, 2.0f);
        System.out.println(sum);
        System.out.println(subtract);
        System.out.println(multiply);
        System.out.println(divide);
    }
}