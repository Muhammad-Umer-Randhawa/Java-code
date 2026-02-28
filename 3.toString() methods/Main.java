public class Main {
    static class Student{
        String name = "Umer";
        String rollno = "567898";

        public String toString(){
            return  "Student name: " + name + "\t" + "\n" + "Student rollno: " + rollno;
        }
    }
    public static void main(String[] args){
        Student s1 = new Student();
        System.out.println(s1);
    }
}
