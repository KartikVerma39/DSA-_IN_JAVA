//1. Student Result Calculator:-
//        =========================
//
//Create a Student class with:
//        - int rollNo
//- String name
//- int marks1, marks2, marks3
//- static variable collage name
//
//Create a ResultCalculator class with:
//        - a static method to calculate total marks
//- a non-static method to calculate percentage and grade
//
//Rules
//- Grade logic using if-else
//        - Set values directly

public class Student {
    int rollNo;
    String name;
    double marks1;
    double marks2;
    double marks3;
    static String collageName;

    public static void main(String[] args){
        Student student = new Student();
        student.rollNo = 49;
        student.name = "Kartik";
        student.marks1 = 90;
        student.marks2 = 90;
        student.marks3 = 99;
        Student.collageName = "Chitkara University";
        ResultCalculator result = new ResultCalculator();
        double total = ResultCalculator.totalMarks(student.marks1 , student.marks2 , student.marks3);
        double percentage = result.percentage(student.marks1 , student.marks2 , student.marks3);
        char grade = result.grade(percentage);

        System.out.println("The total marks are :" + total);
        System.out.println("The percentage is :" + percentage);
        System.out.println("Your Grade is :" + grade);
    }

}


