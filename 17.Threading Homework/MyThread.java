import java.io.FileWriter;
import java.io.IOException;
public class MyThread extends Thread {
    private int number;
    private int numLimit;
    private String fileName;

    public MyThread(int number, int numLimit, String fileName){
        this.number = number;
        this.numLimit = numLimit;
        this.fileName = fileName;
    }
    @Override
    public void run(){
        try{
            FileWriter writer = new FileWriter(fileName);
            for(int i=1; i<=numLimit; i++){
                String line = number + " x " + i + " = " + (number*i);
                writer.write(line + "\n");
            }
            writer.close();
        }
        catch(IOException e){
            System.out.println("Error Writing File " + e.getMessage());

        }
    }
}
