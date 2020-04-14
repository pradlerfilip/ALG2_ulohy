/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparingstudents;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;



/**
 *
 * @author filip
 */
public class Comparing {
    public static void main(String[] rags)
    {
        List<Student> students1 = DataSource.loadDataAsList();
        MyComparing.print(students1);
        System.out.println(" ");
         // sortByNumber(students);
         // print(students);
         // sort(students);
        Collections.sort(students1); // students musi byt typove kompatibilni s interface Comparable
        MyComparing.print(students1);
        
        
    }
}
