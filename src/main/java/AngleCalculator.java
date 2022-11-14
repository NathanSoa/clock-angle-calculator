public class AngleCalculator {

    private final static int ANGLE_PER_HOUR = 30;
    private final static int ANGLE_PER_MINUTE = 6;

    public static double calculateMinorArc(Clock clock) {
        double difference = calculateAngleDifference(clock);
        return difference > 180 ? (360 - difference) : difference;
    }

    public static double calculateMajorArc(Clock clock) {
        double difference = calculateAngleDifference(clock);
        return difference < 180 ? (calculateMinorArc(clock) - 360) * -1 : difference;
    }

    private static double calculateAngleDifference(Clock clock) {
        double hour = handle24HourNotation(clock.getHour());
        double hourAngleValue = ANGLE_PER_HOUR * hour;

        double minute = clock.getMinute();
        double minuteAngleValue = ANGLE_PER_MINUTE * minute;

        double angleDifference = (minuteAngleValue - hourAngleValue) < 0 ?
                (minuteAngleValue - hourAngleValue) * -1 :
                (minuteAngleValue - hourAngleValue);


        return angleDifference;
    }

    private static double handle24HourNotation(int hourValue) {
        if(hourValue > 12)
            return hourValue - 12;

        return hourValue;
    }
}
