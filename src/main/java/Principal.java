
public class Principal {

    public static void main(String[] args) {
        Clock clock = new Clock(22, 55);

        System.out.printf("%d:%d \n", clock.getHour(), clock.getMinute());

        System.out.println(AngleCalculator.calculateMinorArc(clock) + "°");
        System.out.println(AngleCalculator.calculateMajorArc(clock) + "°");
    }
}
