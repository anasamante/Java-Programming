package arrays_7;

/*
 * Create a program that allows a user to enter any
 * number of grades and provides them with their
 * average score, as well as the highest and lowest scores.
 */

import java.util.Scanner;

public class Grades {

    private static int grades[];

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please enter the number of grades to enter: " );
        grades = new int[scanner.nextInt()];

        getGrades();
        scanner.close();

        System.out.println("The average score is " + String.format("%.2f", gradeAverage()));
        System.out.println("The highest score is " + getHighest());
        System.out.println("The lowest score is " + getLowest());
    }

    public static void getGrades(){
        for (int i = 0; i < grades.length ; i++) {
            System.out.println("Enter grade #" + (i+1));
            grades[i] = scanner.nextInt();
        }
    }

    public static double sumGrades(){
        double sum = 0;
        for (int grade: grades) {
            sum = sum + grade;
        }
        return sum;
    }

    public static double gradeAverage(){
        return sumGrades()/grades.length;
    }

    public static int getHighest(){
        int highest = grades[0];
        for (int value: grades) {
            if (value > highest) {
                highest = value;
            }
        }
        return highest;
    }

    public static int getLowest(){
        int lowest = grades[0];
        for (int value: grades) {
            if (value < lowest) {
                lowest = value;
            }
        }
        return lowest;
    }
 }


