
package studentinformationsystem;

public class StudentInformationSystem {

    public static void main(String[] args) {
        
        // i. Display student name and student ID
        System.out.println("Student Name: Muhammad Mazuki Bin Anuar");
        System.out.println("Student ID: S65160");
        System.out.println("---------------------------------------");
        
        // ii. Store two marks using variables
        double continuousAssessment = 49.0; 
        double finalExam = 38.0;             
        
        // iii. Calculate the total mark
        double totalMark = continuousAssessment + finalExam;
        
        // iv. Display the total
        System.out.println("Continuous Assessment Mark: " + continuousAssessment);
        System.out.println("Final Exam Mark: " + finalExam);
        System.out.println("Total Mark Obtained: " + totalMark);
        
        // v. Display a message based on the total
        System.out.print("Performance Status: ");
        if (totalMark >= 80) {
            System.out.println("Excellent");
        } else if (totalMark >= 50) {
            System.out.println("Good");
        } else {
            System.out.println("Needs Improvement");
        }
    }
}

