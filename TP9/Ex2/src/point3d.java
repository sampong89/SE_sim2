import java.util.Scanner;

/**
 * point3d
 */
public class point3d {

    private double x,  y , z;

    public point3d() {
        setX(x);
        setY(y);
        setZ(z);
    }

    public double getX() { return this.x; }

    public void setX(double x) { this.x = x; }

    public double getY() {return this.y; }

    public void setY(double y) { this.y = y; }

    public double getZ() { return this.z; }

    public void setZ(double z) { this.z = z; }

    public void displayPoint() {
        System.out.printf("The coordinate is (0,%.2f,%.2f,%.2f)", x, y, z);
    }
}

class driver {
    private static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        point3d point = new point3d();
        System.out.print("Enter the point x: ");
        point.setX(sc.nextDouble());
        System.out.print("Enter the point y: ");
        point.setY(sc.nextDouble());
        System.out.print("Enter the point z: ");
        point.setZ(sc.nextDouble());

        point.displayPoint();
    }
}