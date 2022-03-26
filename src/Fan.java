public class Fan {

    final int SLOW = 1;
    final int MEDIUM =2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false; // tat quat
    private double radius = 5; //ban kinh quat
    private String color = "blue";

    public Fan() {
    }

    public Fan(boolean on, double radius, String color) {
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSLOW() {
        return SLOW;
    }

    public int getFAST() {
        return FAST;
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

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @java.lang.Override
    public java.lang.String toString() {
        if (!isOn()) {
            return "Fan{" +
                    "Fan is off " +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        }
            return "Fan{" +
                    " Fan is on " +
                    ", speed=" + speed +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';

    }
}