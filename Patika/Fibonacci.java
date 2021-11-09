    package com.company;

    public class Prime {
        public static void main(String[] args) {
            int num1=1,num2=1,temp;
            for (int i = 1; i <= 7; i++) {
                temp = num1+num2;
                System.out.println(num1 +" + "+ num2+" = "+temp);
                num1=num2;
                num2=temp;
            }
        }
    }
