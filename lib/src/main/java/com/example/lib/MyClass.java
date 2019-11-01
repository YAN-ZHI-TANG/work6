package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int year =sc.nextInt();
        if (((year%400==0)&&(year%4000!=0))||
                ((year%4==0)&&(year%100!=0)))
            System.out.println(year+"是閏年");
        else
            System.out.println(year+"不是閏年");
    }
}

}