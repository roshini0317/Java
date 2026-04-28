package learning;

import java.util.Scanner;

public class UserDetails {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = s.nextLine();
        System.out.print("Enter age: ");
        int age = s.nextInt();
        System.out.print("Enter salary: ");
        double sal = s.nextDouble();
        double y = sal*12;
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Monthly Salary: " + sal);
        System.out.println("Yearly Salary: " + y);
        s.close();
    }
}