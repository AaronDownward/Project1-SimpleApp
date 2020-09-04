package com.mycompany.app;

import java.time.LocalTime;
import java.util.Scanner;

public class App 
{
    public static void main(String[] args) {
        System.out.println("The local time is: " + LocalTime.now().toString());
        System.out.println("Tell us something nice...");
        Scanner scanner = new Scanner(System.in);
        String output = scanner.nextLine();
        System.out.println(output + " is really nice");
        
    }
}
