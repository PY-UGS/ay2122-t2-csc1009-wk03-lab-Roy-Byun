package Week_3;

import java.util.Date;

public class Lab03Q1Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;

    public Lab03Q1Loan(){
        this.annualInterestRate = 2.5 / 100;
        this.numberOfYears = 1;
        this.loanAmount = 1000;
        Date now = new Date();
        this.loanDate = now;
    }

    public Lab03Q1Loan(double annualInterestRate, int year, double loanAmount)
    {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = year;
        this.loanAmount = loanAmount;
        Date now = new Date();
        this.loanDate = now;

    }

    public double getAnnualInterestRate() {

        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {

        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYears() {

        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {

        this.numberOfYears = numberOfYears;
    }

    public double getLoanAmount() {

        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {

        this.loanAmount = loanAmount;
    }

    public Date getLoanDate() {

        return loanDate;
    }

    public void setLoanDate(Date loanDate) {

        this.loanDate = loanDate;
    }

    public double getMonthlyPayment(){
        double monthlyInterestRate = this.getAnnualInterestRate() / 12 / 100;
        double monthlyPayment = (this.getLoanAmount() * monthlyInterestRate) / (1 - 1/(Math.pow(1 + monthlyInterestRate,this.getNumberOfYears() * 12)));

        return  monthlyPayment;
    }

    public double getTotalPayment(){
        double totalPayment = this.getMonthlyPayment() * this.getNumberOfYears() * 12;
        return  totalPayment;
    }

}