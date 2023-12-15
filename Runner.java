import java.util.Scanner;

public class Runner {

    public static Point stringInputToPoint(String input){
        // int p;
        // for (int i = 0; i < input.length(); i++){
        //     double x = Double.parseDouble(input.substring(0,p));
        //     double y = Double.parseDouble(input.substring(p, input.length()));
        // }

        double x = Double.parseDouble(input.substring(1, input.indexOf(",")));
        double y = Double.parseDouble(input.substring(input.indexOf(",")+1, input.length()-1));
        return new Point(x,y);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hi! This is a program that will tell you if a point is inside or outside of a given circle.");
        System.out.println("Let's make our circle first.");
        System.out.println("Enter the center of the circle (double, double): ");
        String sc1 = scan.nextLine();
        Point center = stringInputToPoint(sc1);
        System.out.println("I've constructed the point: " + center.toString());
        System.out.println("Enter the radius: ");
        double radius = scan.nextDouble();
        Circle circle = new Circle(center, radius);
        System.out.println("I've constructed the circle: Radius = " + radius + " and Center = " + center.toString());
        System.out.println("Type in a point and I will tell you if it's inside of the circle or outside: ");
        scan.nextLine();
        String sc2 = scan.nextLine();
        Point point1 = stringInputToPoint(sc2);
        if (circle.isInside(point1)){
            System.out.println("The point " + point1.toString() + " is inside of the circle.");
        }
        else{
            System.out.println("The point " + point1.toString() + " is outside of the circle.");
        }
        System.out.println("Let's do another point!");
        System.out.println("Type in a point and I will tell you if it's inside of the circle or outside: ");
        String sc3 = scan.nextLine();
        Point point2 = stringInputToPoint(sc3);
        if (circle.isInside(point2)){
            System.out.println("The point " + point2.toString() + " is inside of the circle.");
        }
        else{
            System.out.println("The point " + point2.toString() + " is outside of the circle.");
        }
        System.out.println("Bye!");
    }
}