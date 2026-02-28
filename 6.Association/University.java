import java.util.ArrayList;

public class University {

    public String name;
    public String location;
    public ArrayList<Department> departments;
    public ArrayList<Student> students;

    public University(String name, String location) {
        this.name = name;
        this.location = location;
        this.departments = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    // Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ArrayList<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(ArrayList<Department> departments) {
        this.departments = departments;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
}