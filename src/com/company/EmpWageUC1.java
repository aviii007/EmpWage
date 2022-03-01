package com.company;

public class EmpWageUC1 {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Welcome to Employee Wage computation program on Master Branch");
            int IS_FULL_TIME = 1;
            double empCheck = Math.floor(Math.random() * 10) % 2;
            if (empCheck == IS_FULL_TIME)
                System.out.println("Employee is Present");
            else
                System.out.println("Employee is Absent");
    }
}
