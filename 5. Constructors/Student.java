public class Student {
    int stdRollno;
    String stdName;

    public Student(int rollno) { stdRollno = rollno; }
    public Student(int rollno, String name){ stdRollno = rollno; stdName = name;}
    public Student(Student s){
        stdRollno = s.stdRollno;
        stdName = s.stdName;
    }
    public String toString(){
        return "Student Roll no. is: " + stdRollno + "\n" + "Student name is: " + stdName;
    }
    public static void main(String[] args){
        Student s1 = new Student(123, "Umer");
        System.out.println(s1);
        Student s2 = new Student(s1);
        // Student s2 = s1;
        System.out.println(s2);
    }
}
