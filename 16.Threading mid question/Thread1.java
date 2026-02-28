public class Thread1 extends Thread{
    int count;
    String objName;
    public Thread1(int count, String objName){
        this.count = count;
        this.objName = objName;
    }
    public void run(){
        for(int i=1; i<=count; i++){
            System.out.println(count);
        }
        System.out.println(objName);
    }
} 