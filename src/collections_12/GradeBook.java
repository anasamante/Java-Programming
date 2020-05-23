package collections_12;

import java.util.Map;

  /*
        the students were given a pop quiz and collectively they didn't do so great. As a result,
        the instructor decided to give them a makeup exam to allow them to improve their scores.
        Given two Maps of test scores, update the student's grades only if they did better on the makeup exam.
        Then print the final grades.
     */

public class GradeBook {
    public static void main(String[] args) {
        updateAndPrintGrades();
    }

    public static void updateAndPrintGrades() {

        Map<String, Integer> originalGradesMap = TestResults.getOriginalGrades();
        Map<String, Integer> makeUpGradesMap = TestResults.getMakeUpGrades();

        for (var student : originalGradesMap.keySet()) {
            int originalGrade = originalGradesMap.get(student);
            int makeUpGrade = makeUpGradesMap.get(student);
            if (makeUpGrade > originalGrade) {
                originalGradesMap.put(student, makeUpGrade);
            }
            System.out.println(student + " highest grade is: " + originalGradesMap.get(student));
        }

    }
}
