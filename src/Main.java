public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        System.out.println(fan1);

        fan1.setOn(true);
        System.out.println(fan1);

        fan1.setSpeed(fan1.FAST);
        System.out.println(fan1);

    }
}
