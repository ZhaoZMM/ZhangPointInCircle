public class Point {
    private double x;
    private double y;

    public Point() {
        x = 0.0;
        y = 0.0;
    }

    public Point(double setX, double setY) {
        x = setX*1.0;
        y = setY*1.0;
    }

    public double distance(Point other) {
        return Math.sqrt(Math.pow(other.x - x, 2) + Math.pow(other.y - y, 2));
    }

    public boolean equals(Point other) {
        return x == other.x && y == other.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double setX) {
        x = setX;
    }

    public void setY(double setY){
        y = setY;
    }
    
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}