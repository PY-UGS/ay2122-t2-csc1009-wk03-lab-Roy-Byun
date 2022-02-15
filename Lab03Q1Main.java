package Week_3;

import java.util.Scanner;


public class Lab03Q1Main {
    public static void main(String arg[]){
        Lab03Q1Loan lab03Q1Loan;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter annual interest rate, for example, 8.25: ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Enter number of years as an integer: ");
        int year = input.nextInt();

        System.out.print("Enter loan amount, for example, 120000.95: ");
        double loanAmount = input.nextDouble();

        lab03Q1Loan =new Lab03Q1Loan(annualInterestRate, year, loanAmount);

        System.out.println("The loan was created on "+ lab03Q1Loan.getLoanDate());
        System.out.printf("The monthly payment is %.2f\n", lab03Q1Loan.getMonthlyPayment());
        System.out.printf("The total payment is %.2f\n", lab03Q1Loan.getTotalPayment());
    }
}
