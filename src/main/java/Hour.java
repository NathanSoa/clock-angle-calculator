public class Hour {
    int hour;

    private Hour(int hour) {
        this.hour = hour;
    }

    public static Hour create(int hour) {
        if(hour < 0 || hour > 24)
            throw new IllegalArgumentException("Hour should be less than 24 and more than 0");

        return new Hour(hour);
    }

    public int getValue() {
        return hour;
    }
}
