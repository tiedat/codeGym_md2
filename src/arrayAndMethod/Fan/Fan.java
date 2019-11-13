package arrayAndMethod.Fan;

public class Fan {
    final int SLOW = 1, MEDIUM = 2, FAST = 3;

    private int speed = SLOW;

    private boolean on = false;

    private double radius = 5;

    private String color = "blue";

    Fan() {
    }

    public int getSpeed() {
        return speed;
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (this.on) {
            return "Fan{" +
                    "speed=" + speed +

                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    ", fan is on" +
                    '}';
        }
        return "Fan{" +
                "color='" + color + '\'' +
                ", fan is off" +
                '}';
    }

}
