public class Minute {

    int minute;

    private Minute(int minute) {
        this.minute = minute;
    }

    public static Minute create(int minute) {
        if(minute < 0 || minute > 59)
            throw new IllegalArgumentException("minute should be less than 60 and more or equals to 0");

        return new Minute(minute);
    }

    public int getValue() {
        return minute;
    }
}
