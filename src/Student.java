/**
 * Created by RyanHarper on 1/9/17.
 */
public class Student {
    private String firstName;
    private String lastName;
    private int age;

    public Student(String firstName, String lastName, int age) { //constructor
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}

//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//    public void setAge(int age) {
//        this.age = age;
//    }

