package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int IS_FULL_TIME = 1;
        double empCheck = Math.floor(Math.random() * 10) % 2;
if (empCheck == IS_FULL_TIME)
       System.out.println("Employee is Present");
else
       System.out.println("Employee is Absent");
    }
}