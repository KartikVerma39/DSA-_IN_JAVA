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

public class ResultCalculator {
    static double totalMarks(double marks1 , double marks2 , double marks3){
        double total = marks1 + marks2 + marks3;
        total = Math.round(total * 100.0)/100.0;
        return total;
    }

    double percentage(double marks1 , double marks2 , double marks3){
        double total = totalMarks(marks1 , marks2 , marks3);
        double percentage = (total/300.0)*100.0;
        percentage = Math.round(percentage * 100.0)/100.0;
        return percentage;
    }

    char grade(double percentage){
        if(percentage >= 90 && percentage <= 100){
            return 'O';
        }
        else if(percentage >= 70 && percentage < 90){
            return 'A';
        }
        else if(percentage >= 50 && percentage < 70){
            return 'B';
        }
        else{
            return 'F';
        }
    }
}
