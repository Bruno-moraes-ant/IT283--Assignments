package AssignmentWeek03;


public class ClockDisplay {
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private NumberDisplay seconds;

    public ClockDisplay() {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        seconds = new NumberDisplay(60);
    }

    public ClockDisplay(int hour, int minute, int second) {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        seconds = new NumberDisplay(60);

        hours.setValue(hour);
        minutes.setValue(minute);
        seconds.setValue(second);
    }

    public void timeTick() {
        seconds.increment();

        if (seconds.getValue() == 0) {
            minutes.increment();

            if (minutes.getValue() == 0) {
                hours.increment();
            }
        }
    }

    public String getTime() {
        return hours.getDisplayValue() + ":" +
                minutes.getDisplayValue() + ":" +
                seconds.getDisplayValue();
    }
}
