package comparingstudents.mycomparing;

import comparingstudents.Datasource;
import comparingstudents.Student;
import java.util.List;

/**
 * Vytvoreni vlastnich metod pro trideni a vlastnich rozhrani (interface)
 * @author janvit
 */
public class MyComparing {

    public static void main(String[] args) {
        Student[] students = Datasource.loadDataAsArray();
        print(students);
        
        System.out.println("Sort by number");
        //sortByNumber(students);
        //sort(students);
        sort(students, new PorovnavacStudentByNumber());
        print(students);
        
        System.out.println("Sort by firstname");
        sort(students, new PorovnavacStudentByFirstname());
        print(students);
    }
    
    //tridi pole studentů
    public static void sortByNumber(Student[] array){
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 1; j < array.length-i; j++) {
                if(array[j-1].isBigger(array[j])){
                    Student temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
    }
    
    //tridi pole jakychkoliv objektu, ktere jsou typove kompatibilni
    //s ComapareInterface t.j. implementuji metodu isBigger
    public static void sort(CompareInterface[] array){
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 1; j < array.length-i; j++) {
                if(array[j-1].isBigger(array[j])){
                    CompareInterface temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
    }
    
    //tridi pole jakychkoliv objektu, metoda bigger objektu typovo 
    //kompatibilniho s ComparatorInterface definuje, jak tridit
    public static void sort(Object[] array, ComparatorInterface o){
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 1; j < array.length-i; j++) {
                if(o.bigger(array[j-1], array[j])){
                    Object temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
    }
    
    public static void print(Object[] array){
        for (Object object : array) {
            System.out.println(object);
        }
    }
    
    public static void print(List list){
        for (Object object : list) {
            System.out.println(object);
        }
    }
    
}
