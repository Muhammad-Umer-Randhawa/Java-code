public class Demo{
    public static void main(String[] args){
        Thread1 t1 = new Thread1(10, "t1");
        Thread1 t2 = new Thread1(10, "t2");
        try{
            t1.start();
            t2.start();
        }
        catch(Exception e){
            System.out.println("Interrupted Exception");
        }

    }
}