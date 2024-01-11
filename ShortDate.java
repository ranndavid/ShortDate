import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ShortDate {
    public static void main(String[] args) {
        System.out.println("===========Number Date========");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number date (YYYY-MM-DD): ");
        String shortDate = scanner.nextLine();
        scanner.close();
        int year = Integer.parseInt(shortDate.substring(0, 4));
        int month = Integer.parseInt(shortDate.substring(5, 7));
        int day = Integer.parseInt(shortDate.substring(8));

        String fullmonthName = getMonthName(month);

        String fullDate = fullmonthName + " " + day + ", " + year;
        System.out.println("Full date representation is: " + fullDate);
    }

    private static String getMonthName(int month) {
        LocalDate date = LocalDate.of(1, month, 1); // Create a dummy date with the given month
       if(month>=1 && month<=12){
            return date.format(DateTimeFormatter.ofPattern("MMMM"));
       }else{
           return "Date not found";
       }
    }
}
