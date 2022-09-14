package com.company;

public class Main {

    public static void main(String[] args) {
        for(int k=0; k<=10;k++)
        {
            double alpha = k * Math.PI/5;
            String answer = alpha + ", " + Math.sin(alpha) + ", " + Math.cos(alpha);
            System.out.println(answer);
        }
    }
}
