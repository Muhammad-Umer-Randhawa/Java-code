import java.io.*;
public class Main{
    public static void main(String[] args){
        int i;
        String s = new String();
        System.out.println("Enter any number from 1 to 4: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            s= br.readLine();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        i = Integer.parseInt(s);
        try{
            if (i==1){
                throw new ArithmeticException("Java's Arithmetic Exception thrown by" +
                                              " using thrown keyword.");
            }
            if(i==2){
                throw new NegativeArraySizeException("Java's NegativeArraySizeException" +
                                                     " thrown by using throw keyword");
            }
            if(i==3){
                throw new ArrayIndexOutOfBoundsException("Java's" + 
                "ArrayIndexOutOfBoundsException thrown by using throw keyword");
            }
            if(i==4){
                throw new ArrayStoreException();
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            System.out.println("Handling ArrayIndexOutOfBoundsException");
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println("Handling ArithmeticException");
        }
        catch(NegativeArraySizeException e){
            System.out.println(e.getMessage());
            System.out.println("Handling NegativeArraySizeException");
        }
        catch(ArrayStoreException e){
            System.out.println(e);
            System.out.println(e.getMessage());
            System.out.println("Handling Java's ArrayStoreException");
        }
    }
}