
package comparingstudents;

/**
 *
 * @author filip
 */
public class Student implements CompareInterface, Comparable {
    private String firstName;
    private String lastName;
    private int studentNumber;

    public Student() {
    }

    public Student(String firstName, String lastName, int studentNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentNumber = studentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    @Override
    public String toString() {
        return String.format("%10s%10s%10d",firstName,lastName,studentNumber);
    }
    
    public boolean isBigger(Student student) {
        return this.studentNumber > student.studentNumber;
    }
    
    @Override
    public boolean isBigger(CompareInterface o) {
        return this.studentNumber > ((Student)o).studentNumber;
    }

    @Override
    public int compareTo(Object o) {
        return this.studentNumber - ((Student)o).studentNumber;
    }
     
    
}
