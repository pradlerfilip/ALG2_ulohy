package comparingstudents.mycomparing;

import comparingstudents.Student;

/**
 *
 * @author janvit
 */
public class PorovnavacStudentByFirstname implements ComparatorInterface {

    @Override
    public boolean bigger(Object o1, Object o2) {
        return ((Student)o1).getFirstName().compareTo(((Student)o2).getFirstName()) > 0;
    }
    //String implementuje Comparable, tj ma metodu compareTo, ktera porovna 
    //String se zadanym druhym Stringem. Vraci +int, 0 nebo -int
}
