package school.mjc.stage0.conditions.task5;

public class SwitchDaysInMonthPrinter {
    public void amountOfDays(int month) {
        String days = "31";
        switch (month) {
            case 2:
                days = "28";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = "30";
                break;
            default:
                days = "wrong number!";
                break;
        }
        System.out.println(days);
    }
}
