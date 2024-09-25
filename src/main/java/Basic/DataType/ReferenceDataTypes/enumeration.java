package Basic.DataType.ReferenceDataTypes;

public class enumeration {
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    }

    // with Fields, Methods, and Constructors
    enum Size {
        SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRALARGE("XL");

        private String s;

        Size(String s) {
            this.s = s;
        }

        public String getS() {
            return s;
        }
    }

    // with Abstract Methods
    enum Operation{
        ADD {
            @Override
            double calculate(double x, double y) {
                return x+y;
            }
        },
        SUBTRSCT {
            @Override
            double calculate(double x, double y) {
                return x-y;
            }
        };
        // Abstract method
        abstract double calculate(double x, double y);
    }

    public static void main(String[] args) {
        Day today = Day.TUESDAY;

        switch (today) {
            case MONDAY:
                System.out.println("Start of the week");
                break;
            case WEDNESDAY:
                System.out.println("Mid-week day!");
                break;
            case FRIDAY:
                System.out.println("End of the work week");
                break;
            default:
                System.out.println("It's another day");
                break;
        }

        // values()
        Day[] days = Day.values();
        for(Day d : days) {
            System.out.println(d);
        }

        // valueOf()
        Day firstDay = Day.valueOf("MONDAY");
        System.out.println(firstDay);

        // ordinal()
        System.out.println("Position of MONDAY: " + Day.MONDAY.ordinal());

        Size size = Size.LARGE;
        System.out.println(size);
        System.out.println(size.getS());

        double result = Operation.ADD.calculate(1.0,2.0);
        System.out.println("Result: " + result);
    }
}
