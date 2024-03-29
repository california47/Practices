package Inheritance.Practice6;
/*
    2. create a subclass of person called Employee
            attributes: name, age, gender, ID, jobTitle, salary
            first constructor: can initialize name, age, gender of the employee
            second constructor: can initialize the entire attributes of the Employee class
            override the toString method  that can help you to print out the EmployeeObject*/

public class Employee extends Person {
    String ID;
    String jobTitle;
    double salary;


    public Employee(String name, int age, char gender,String ID,String jobTitle,double salary) {
        super(name, age, gender);
        this.ID = ID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID='" + ID + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                '}';
    }
}
