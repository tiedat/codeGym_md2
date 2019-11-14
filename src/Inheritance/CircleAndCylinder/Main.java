package Inheritance.CircleAndCylinder;

public class Main {
    public static void main(String[] args) {

        Cirlce cirlce = new Cirlce();
        Cirlce cirlce1Beta = new Cirlce(2.0, "red");

        System.out.println(cirlce.toString());
        System.out.println(cirlce.getArea());
        System.out.println(cirlce.getPerimeter() + "\n");

        System.out.println(cirlce1Beta.getRadius());
        System.out.println(cirlce1Beta.getColor());

        Cylinder cylinder = new Cylinder();
        Cylinder cylinder1=new Cylinder(3.0);
        Cylinder cylinder2=new Cylinder(2.0,"blue",5);

        System.out.println(cylinder.getVolume());
        System.out.println(cylinder2.toString());
    }
}
