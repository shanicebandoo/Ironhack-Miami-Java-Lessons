package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        myMethod();
        String info = getInfo(1);
        System.out.println(info);

        //Different declarations for each primitive data type
        byte justByte = 127;
        short myShort = 1000;
        int myInt = 2500000;
        long myLong = 50000000000000000L;
        float myFloat = 1.2345f;
        double myDouble = 3.456;
        boolean myBoolean = false;
        char myChar = 's'; //or we can initialize it to 97 since it is the ASCII equivalent

        System.out.println("justByte: " + justByte);
        System.out.println("myShort: "+ myShort);
        System.out.println("myInt: "+ myInt);
        System.out.println("myLong: " + myLong);
        System.out.println("myFloat: " + myFloat);
        System.out.println("myDouble: " + myDouble);
        System.out.println("myBoolean: " + myBoolean);
        System.out.println("myChar: " + myChar);

        myInt = 1234;
        System.out.println("myInt: " + myInt);

        //Non-primitive data types
        //STRINGS - chains of characters

        String myString = "I will get a job!";
        System.out.println("myString");

        //Operations:

        int number = 10;
        System.out.println(number + 1);
        System.out.println(number - 5);
        System.out.println(number * 5);
        System.out.println((double)number / 3);
        System.out.println(number % 3);

        //CONDITIONALS

        number = 123;

        if(number == 0){
            System.out.println("Number is equal to 0");
        } else if(number >= 100 && number < 1000) {
            System.out.println("Number is in fact bigger than 100 and smaller than 1000");
        } else {
            System.out.println("Number is NOT equal to 0");
        }

        //We want to create a conditional to check if a number has at least 2 digits

        int secNumber = 23;
        if(secNumber > 10 || secNumber < -10){
            System.out.println("This number has at least two digits");
        }

        //Check to see if number is even or odd
        if(secNumber % 2 == 0) System.out.println("Number is even");
        else System.out.println("Number is odd");

        //switch case

        int day = 4;

        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Weekend");
                break;
        }

        //termary operators

        double grade = 6.5;

       String hasPassed = grade >= 5 ? "passed":"fail";
        System.out.println(hasPassed);

        //STRING METHODS

        String affirmation = "I will be successful, wealthy, and happy in the future";

        System.out.println("Affirmation: " + affirmation);
        System.out.println("Address length: " + affirmation.length());
        System.out.println(affirmation.toUpperCase());
        System.out.println(affirmation.toUpperCase().replace("E", "x"));

        //WRAPPER

        Integer myNum = 100;
        System.out.println(myNum);

    }

    public static void myMethod(){
        System.out.println("This");
        System.out.println("Is");
        System.out.println("Inside");
        System.out.println("myMethod");
    }

    //we say String because we are returning a String
    public static String getInfo(int option){
        if(option==1) return "I will be very wealthy with a house and car soon";
        else if(option==2) return "I will have my life figured out";
        else return "option" + option + "provides no info";
    }
}