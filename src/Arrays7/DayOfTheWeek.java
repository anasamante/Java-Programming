package Arrays7;
/*
Make an array that holds its actual values of the days of the week, and then have the user input a number corresponding
to some day of the week. And assume that the week starts on Monday.

Your program should output the String that represents the day of the week that corresponds to the number that the user input.
For example, if the user inputs the number 1, your program should print “Monday”.
*/

import java.util.Scanner;

public class DayOfTheWeek {

    private static String[] weekday = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    private static Scanner scanner = new Scanner(System.in);
    private static int selectedDay;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        askWeekday();
        printDay(selectedDay);

        scanner.close();
    }

    public static int askWeekday() {

        System.out.println("Please input a number");
        selectedDay = scanner.nextInt();

        return selectedDay;
    }

    public static void printDay(int selectedDay){
        if (selectedDay <= weekday.length) {
            System.out.println("your selected weekday is: " + weekday[selectedDay-1]);
        }else{
            System.out.println("Invalid number, please try again");
        }



    }
}
