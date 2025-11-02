import java.util.Scanner;

class Student {
    String name;
    int rollNumber;
    double marks;

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }

    void calculateGrade() {
        char grade;
        if (marks >= 90)
            grade = 'A';
        else if (marks >= 75)
            grade = 'B';
        else if (marks >= 60)
            grade = 'C';
        else if (marks >= 40)
            grade = 'D';
        else
            grade = 'F';

        System.out.println("Grade: " + grade);
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter number of students: ");
    int n = sc.nextInt();

    Student[] s = new Student[n];
    for (int i = 0; i < n; i++) {
        s[i] = new Student();

        System.out.println("\nEnter details for Student " + (i + 1) + ":");
        System.out.print("Enter name: ");
        s[i].name = sc.next();
        System.out.print("Enter roll number: ");
        s[i].rollNumber = sc.nextInt();
        System.out.print("Enter marks: ");
        s[i].marks = sc.nextDouble();
    }

    System.out.println("\n----- Student Details -----");
    for (int i = 0; i < n; i++) {
        System.out.println("\nStudent " + (i + 1) + ":");
        s[i].displayInfo();
        s[i].calculateGrade();
    }

    sc.close();

}
}


   
