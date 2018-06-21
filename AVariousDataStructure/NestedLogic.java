package AVariousDataStructure;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class NestedLogic {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

  /*      int returnDay = scan.nextInt();
        int returnMonth = scan.nextInt();
        int returnYear = scan.nextInt();

        int expectDay = scan.nextInt();
        int expectMonth = scan.nextInt();
        int expectYear = scan.nextInt();
*/
  /*29 12 2015
1 1 2016*/
  /*29 6 2016
1 7 2016*/
        int returnDay = 29;
        int returnMonth = 12;
        int returnYear = 2015;

        int expectDay = 1;
        int expectMonth = 1;
        int expectYear = 2016;


 /*       Calendar expectDate = Calendar.getInstance();
        Calendar returnDate = Calendar.getInstance();
                expectDate.set(expectYear, expectMonth, expectDay);
        returnDate.set(returnYear, returnMonth, returnDay);
*/
        LocalDate expectDate = LocalDate.of(expectYear, expectMonth, expectDay);
        LocalDate returnDate = LocalDate.of(returnYear, returnMonth, returnDay);

        int difInDays = returnDate.getDayOfMonth() - expectDate.getDayOfMonth();
        int difInYear = returnDate.getYear() - expectDate.getYear();
        int difInMonth = returnDate.getMonthValue() - expectDate.getMonthValue();


        long penalty = 0;

        if (returnDate.isAfter(expectDate)) {
            if (difInYear == 0) {
                if (difInMonth == 0) {
                    penalty = difInDays * 15;
                } else {
                    penalty = difInMonth * 500;
                }
            } else {
                penalty = 10000;
            }
        }

        System.out.println(penalty);
    }

}

