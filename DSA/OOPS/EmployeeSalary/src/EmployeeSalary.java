//Create a class EmployeeSalary with overloaded calculateSalary() methods:

//a. calculateSalary(int basicSalary)
//* Returns basic salary
//
//b. calculateSalary(int basicSalary, int bonus)
//* Returns salary + bonus
//
//c. calculateSalary(int basicSalary, int bonus, int taxPercentage)
//* Returns final salary after tax deduction on your basic salary



public class EmployeeSalary {

    void calculateSalary(int basicSalary){
        System.out.println("Your Salary is : " + basicSalary);
    }

    void calculateSalary(int basicSalary , int bonus){

        System.out.println("Your total salary is : " + (basicSalary + bonus) + " with a bonus of " + bonus);
    }

    void calculateSalary(int basicSalary , int bonus , int taxPercentage){
        int totaltax = (basicSalary * taxPercentage)/100;
        int totalSalary = basicSalary + bonus - totaltax;
        System.out.println("Your total salary is : " + totalSalary + " with a bonus of " + bonus + " and a tax deduction of " + taxPercentage + "%");
    }


    public static void main(String[] args){

        EmployeeSalary salary = new EmployeeSalary();

        salary.calculateSalary(10000);
        salary.calculateSalary(10000 , 5000);
        salary.calculateSalary(10000 , 5000 , 10);

    }
}
