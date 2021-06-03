package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        double x, y;
        System.out.print("Введите Х: ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextDouble();
        if (x <= 8){
            y = Math.acos(Math.pow(Math.E, (-1) * Math.abs(x)));
        }
        else if (x > 8 && x < 9){
            y = Math.cos(Math.pow(x, 5) / 7 + x * x);
        }
        else {
            y = Math.pow(x, 8) + Math.pow(x, x - 10);
        }

        System.out.println("y(x) = " + y + " при x = " + x);
    }
}
