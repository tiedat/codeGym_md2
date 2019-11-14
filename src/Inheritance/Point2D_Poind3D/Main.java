package Inheritance.Point2D_Poind3D;

public class Main {
    public static void main(String[] args) {


        Point2D point2D = new Point2D(5, 6);
        Point2D point2D1 = new Point2D();
        System.out.println(point2D.toString());
        System.out.println(point2D1 + "\n");

        Point3D point3D = new Point3D();
        Point3D point3D1 = new Point3D(2,3,4);
        System.out.println(point3D1.getZ());
        System.out.println(point3D1.toString());
        System.out.println(point3D.toString());

    }
}
