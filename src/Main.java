public class Main {
    public static void main(String[] args) {
        Fan fan = new Fan();
        String myfan = fan.toString();
        System.out.println(myfan);

        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.setOn(true);
        System.out.println("Fan 1: " + fan1.toString());

        Fan fan2 = new Fan();
        fan2.setSpeed(fan2.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("Blue");
        fan2.setOn(false);
        System.out.println("Fan 2: " + fan2.toString());

    }
}
