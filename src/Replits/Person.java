package Replits;
/*  - private String instance variables: firstName, lastName
 - private int instance variable: age

Methods:
  - getter and setter methods for each instance variable. try to use this. keyword
     -   toString method.No parameters and Returns(does not print! no println in the method!) person info in this format: "firstName | lastName | age"

Constructors:

1) No-Args constructor
 -sets default values for the Person object
 name and lastName => "undefined"
 age => -1

2) 3-Args  Constructor:
 - accepts firstName, lastName, age parameters and assigns values to encapsulated instance variable
 try to use this. keyword
*/

class Person {

    private String firstName;
    private String lastName;
    private int age;

    public Person(){
        firstName = "undefined";
        lastName = "undefined";
        age = -1;
    }

    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getAge(){
        return age;
    }


    public String toString(){
        return firstName+" | "+lastName+" | "+age;
    }
}
