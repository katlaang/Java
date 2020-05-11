public class MinutesToYearsAndDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long year =0;
            long days = 0;
            long remainingDays = 0;
            if (minutes >0) {
                days = (minutes / (24*60));
                year = (days /365 );
                remainingDays = (days % 365);
            }
            System.out.println(minutes + " min = " + year + " y and " + remainingDays + " d");


        }
    }
}