public class Clock {

    private Hour hour;
    private Minute minute;

    public Clock(int hour, int minute) {
        try {
            this.hour = Hour.create(hour);
            this.minute = Minute.create(minute);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    public int getHour() {
        return hour.getValue();
    }

    public int getMinute() {
        return minute.getValue();
    }
}
