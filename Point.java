public class Point {
    float x;
    float y;

    public Point(){
        x=0;
        y=0;
    }
    public Point(int _x){
        x=_x;
        y=0;
    }
    public Point(int _x, int _y){
        x=_x;
        y=_y;
    }
    public double distance(Point anotherPoint){
        double distance =0;
        distance = Math.sqrt(Math.pow(anotherPoint.x-x, 2) + Math.pow(anotherPoint.y-y, 2) );
        return distance;
    }
}
class Segment{
    
    public static void main(String[] args){

        Point p1 = new Point(0,0);
        Point p2 = new Point(4,0);
        Point p3 = new Point(2,4);
        Point st = new Point();
        Point p = new Point(1,4);
        Triangle t = new Triangle(st,p);
      
        double distanceAB= p1.distance(p2);
        double distanceBC= p2.distance(p3);
        double distanceCA = p3.distance(p1);

        Double total = distanceAB + distanceBC + distanceCA;
        System.out.println("Perimeter of triangle is :" +total);
    } 
}

class Triangle{
    Segment s = new Segment();
    Point p, startPoint;
  
    public Triangle (Point startPoint,Point p){
        this.p =p;
        this.startPoint= startPoint;
    }
}

