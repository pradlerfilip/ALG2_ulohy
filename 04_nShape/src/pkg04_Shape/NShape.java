
package pkg04_Shape;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class NShape {
    
    public static Scanner sc= new Scanner(System.in);
    
    
    //data
    
    private ArrayList<Point> points = new ArrayList<>();
    
    //constructors
    
    public NShape(){
        
    }
    
    
    
    public NShape (Point[] points){
        this.points.addAll(Arrays.asList(points));
    }
    
    public NShape (ArrayList<Point> points){
       ArrayList<Point> newPoints = (ArrayList<Point>) points.clone();
        this.points.addAll(newPoints);
    }
    
    public void add(Point p){
        points.add(p);
    }
    
    public void add(double x,double y){
        points.add(new Point(x,y));
    }
    
    public double perim(){
        double perim=0;
        for(int i = 0; i < points.size() - 1; i++){
            perim = perim + Point.distanceBetween(points.get(i), points.get(i+1));
        }
        perim = perim + Point.distanceBetween(points.get(points.size()-1), points.get(0));
        return perim;
    }
    
    public Point getPointAt(int index){
        return points.get(index);
    }
    
    public Point getNearest(){
        double min = Double.MAX_VALUE;
        Point nearest = null; //inicializace objektu
        double distance;
        for (Point point : points) { //prechadzanie ArrayListu pomocou foreach
            distance = point.getDistance();
            if(distance < min){
                min = distance;
                nearest = point;
            }
        }
        return nearest;
    }
    
  public Point getFurthest(){
        double max = Double.MIN_VALUE;
        Point furthest = null; //inicializace objektu
        double distance;
        for (Point point : points) { //prechazeni ArrayListu pomoci "for-each"
            distance = point.getDistance();
            if(distance > max){
                max = distance;
                furthest = point;
            }
    }
   return furthest;     
  }

    //vrati min vzdalenost mezi body
    public Point[] minDistanceBetween(){
        Point[] minDistance= new Point[2];
        double min = Double.MAX_VALUE;
        for(int i=0;i<points.size();i++)
        {
            for(int j=0;j<points.size();j++)
            {
                if(i != j)
                {
                 if(Point.distanceBetween(points.get(i),points.get(j)) < min)
                 {
                   minDistance[0]=points.get(i);
                   minDistance[1]=points.get(j);
                 }
                }
            }
        }
        return minDistance;
    }

    //TODO vrati max vzdalenost mezi body
    public Point[] maxDistanceBetween(){
        Point[] maxDistance= new Point[2];
        double max = Double.MIN_VALUE;
        for(int i=0;i<points.size();i++)
        {
            for(int j=0;j<points.size();j++)
            {
                if(i != j)
                {
                 if(Point.distanceBetween(points.get(i),points.get(j)) > max)
                 {
                   maxDistance[0]=points.get(i);
                   maxDistance[1]=points.get(j);
                 }
                }
            }
        }
        return maxDistance;
    }
    
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Point point : points) {
            sb.append(point.toString()).append("\n");
        }
        return sb.toString();
    }

  
}