public class Student {

    public String sname;
    public byte age;
    public University enrolledIn;

    public Student(String sname, byte age, University enrolledIn) {
        this.sname = sname;
        this.age = age;
        this.enrolledIn = enrolledIn;
        enrolledIn.students.add(this);
    }

    // Getters & Setters
    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public University getEnrolledIn() {
        return enrolledIn;
    }

    public void setEnrolledIn(University enrolledIn) {
        this.enrolledIn = enrolledIn;
    }
}