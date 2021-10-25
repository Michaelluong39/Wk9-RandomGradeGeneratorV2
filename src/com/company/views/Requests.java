package com.company.views;

import java.util.Scanner;


public class Requests {


    public String callName(){
    System.out.println("Select student to randomize grade: ");
        Scanner input = new Scanner(System.in);
        return input.next();
    }
}
