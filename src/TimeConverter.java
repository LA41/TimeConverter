public class TimeConverter {
    public static void main(String[] args) {
        printYearsAndDays(525600);
    }
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0)
            System.out.println("Invalid value");
        else {
            long years = minutes / 525600;
            long days = (minutes % 525600)/ 1440;
            System.out.println(minutes + " minutes = " + years + " years and " + days + " days");
        }
    }
}
