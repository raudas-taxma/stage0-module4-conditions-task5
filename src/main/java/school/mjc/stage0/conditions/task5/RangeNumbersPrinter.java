package school.mjc.stage0.conditions.task5;

public class RangeNumbersPrinter {
    public void printRange(int number) {
        String range = "";
        switch (number) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                range = "number is between 1 and 5";
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                range = "number is between 6 and 10";
                break;
            default:
                range = "out of range";
                break;
        }
        System.out.println(range);
    }
}
