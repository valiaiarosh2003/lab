package com.company;
import java.util.Scanner;
public class lab2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("x=1-1/4*sin**2*2a+cos2a");
        System.out.print("Введите переменную а: ");
        double a = in.nextDouble();
        double x = (1 - 0.25*(Math.pow(Math.sin(2*a),2))+Math.cos(2*a));
        System.out.println(x);
    }
}
