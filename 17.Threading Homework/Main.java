import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyThread[] threads = new MyThread[5];
        try{
            for(int i=0; i<5; i++){
                System.out.print("Enter Number whose table you want: ");
                int num = scanner.nextInt();

                System.out.print("Enter how many times you want to multiply it for the table: ");
                int num2 = scanner.nextInt();

                String filename = "Table " + num + " .txt";
                threads[i] = new MyThread(num,num2,filename);
                threads[i].start();
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out of bounds" + e.getMessage());
        }
        scanner.close();
    }
}