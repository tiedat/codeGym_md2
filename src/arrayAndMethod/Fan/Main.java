package arrayAndMethod.Fan;

public class Main {
    public static void main(String[] args) {

        Fan fan1 = new Fan();

        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);


        Fan fan2 = new Fan();
        fan2.setSpeed(fan2.MEDIUM);

        System.out.println("fan2. = " + fan2);
        System.out.println("fan1 = " + fan1);
    }
}
