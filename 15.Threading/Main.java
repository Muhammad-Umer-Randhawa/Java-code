public class Main extends Thread{
    // @Override
    public void run(){
        for(int i=1; i<=10; i++){
            System.out.println("Inside class Main....");
            if(i%2 == 0){
                try{
                    Thread.sleep(2000);
                }
                catch(Exception e){
                    System.out.println("Thread Exception ");
                }
            }
        }
    }
    
}