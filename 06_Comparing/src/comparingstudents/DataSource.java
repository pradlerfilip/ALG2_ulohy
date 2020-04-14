
package comparingstudents;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author filip
 */
public class DataSource {
    private static Student[] data = {
      new Student("Alice", "Mala", 345),
        new Student("Bob", "Velky", 123),
        new Student("Cyril", "Stredny", 567)
    };
    
  public static Student[] loadDataAsArray(){
       return Arrays.copyOf(data, data.length);
     }
  
  public static List<Student> loadDataAsList()
  {
      return Arrays.asList(data);
     // ArrayList<Student> students = new ArrayList<>();
     // students.addAll(Arrays.asList(data));
  }

}
