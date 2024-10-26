package Other;

import java.util.Random;

enum DayOfTheWeek {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

    public double getTime() {
        return switch (this) {
            case SUNDAY, SATURDAY -> 1.0;
            default -> 0.2;
        };
    }
}
public class EnumExample {
    public static DayOfTheWeek getRandomDay() {
        int randomInteger = new Random().nextInt(7);
        var allDays = DayOfTheWeek.values();
        return allDays[randomInteger];
    }

    public static void main(String[] args) {
        DayOfTheWeek day = DayOfTheWeek.MONDAY;
        System.out.println(day);
        System.out.println(day.name());
        System.out.println(day.ordinal());
        System.out.println(day.getTime());

        System.out.println(getRandomDay());
    }
}
