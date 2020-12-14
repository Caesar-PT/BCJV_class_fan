public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private  double radius = 5;
    private String color = "blue";

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public Fan(){
        this.speed = getSpeed();
        this.on = isOn();
        this.radius = getRadius();
        this.color = getColor();
    }

    public String toString(){
        if (isOn()){
        return "Speed: " + this.getSpeed() + " Radius: " + this.getRadius() + " Color: " + this.getColor() + " Fan is on";
    } else
        {
            return this.getColor() + "\t" + this.getRadius() + "\t" + " Fan is off";
        }
    }
}
