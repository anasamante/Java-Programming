package loops_4;

import java.util.Scanner;

/*
 * NESTED LOOPS:
 * Find the average of each student's test scores
 */


public class AverageTestScore {
    public static void main(String[] args) {
        //what we know
        int numOfStudents = 3;
        int numOfTests = 4;

        Scanner scanner = new Scanner(System.in);

        // process all students
        for(int i = 0; i < numOfStudents; i++){

            double total = 0;
            for(int j = 0; j < numOfTests; j++){
                System.out.println("enter the score for test #" + (j+1));
                double score = scanner.nextDouble();
                total = total + score;
            }

            double average = total/numOfTests;
            System.out.println("The average score for the student # " + (i+1) + " is " + average);
        }
        scanner.close();

    }
}
