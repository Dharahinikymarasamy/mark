import java.util.Scanner;

public class StudentMarksCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input student details
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        // Input marks for 3 subjects
        System.out.print("Enter marks for Subject 1: ");
        int subject1 = sc.nextInt();
        
        System.out.print("Enter marks for Subject 2: ");
        int subject2 = sc.nextInt();
        
        System.out.print("Enter marks for Subject 3: ");
        int subject3 = sc.nextInt();

        // Calculate total and percentage
        int total = subject1 + subject2 + subject3;
        double percentage = total / 3.0;

        // Display result
        System.out.println("\n--- Result ---");
        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");

                // Grade logic
        if (percentage >= 90) {
            System.out.println("Grade: A+");
        } else if (percentage >= 75) {
            System.out.println("Grade: A");
        } else if (percentage >= 60) {
            System.out.println("Grade: B");
        } else if (percentage >= 40) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Fail");
        }

        sc.close();
    }
}