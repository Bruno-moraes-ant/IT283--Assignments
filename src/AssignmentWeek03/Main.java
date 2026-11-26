package AssignmentWeek03;


public class Main {
    public static void main(String[] args) {

        ClockDisplay clock = new ClockDisplay(23, 59, 55);

        System.out.println("Digital Clock:");

        for (int i = 0; i < 10; i++) {
            System.out.println(clock.getTime());
            clock.timeTick();
        }
    }
}

