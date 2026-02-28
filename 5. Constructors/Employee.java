public static class Employee{
        int empID;
        String empName;

    public Employee(int id) { empID = id; }

    public Employee(int id, String name){ empID = id; empName = name;}

    public Employee(Employee e){
        empID = e.empID;
        empName = e.empName;
    }

    public String toString(){
        return "Employee id is: " + empID + "\n" + "Employee name is: " + empName;
    }

    }
    public static void main(String[] args){

        Employee e1 = new Employee(4, "Kahaf Ghajni");
        System.out.println(e1);
        // Employee e2 = new Employee(e1);
        Employee e2 = new Employee(e1.empID = 8, e1.empName = "Umer"); 
        System.out.println(e1);
        System.out.println(e2);
    }
