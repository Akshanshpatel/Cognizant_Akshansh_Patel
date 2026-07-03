package Upskilling_prerequisites.Core_java;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

class Ques1{
     void print(){
        System.out.println("Hello World");
    }
}

class Ques2{
    public void calculate(int a,int b,char op){
        switch (op){
            case '+':
                System.out.println(a+b);
            case '-':
                System.out.println(a-b);
            case '*':
                System.out.println(a*b);
            case '/':
                try{
                    System.out.println(a/b);
                }catch (ArithmeticException e){
                    System.out.println("Not valid division");
                }
        }
    }
}

class Ques3{
    public void check(int a){
        if (a%2==0){
            System.out.println("Even Number");
        }else{
            System.out.println("Odd number");
        }
    }
}

class Ques4{
    public void check(int year){
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }
    }
}

class Ques5{
    public void table(int a){
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(a+" * "+i+" = "+a*i);
        }
    }
}

class Ques6{
    public void show() {
        int a = 10;
        float b = 10.06f;
        double bb = 10.068;
        char ch = 'A';
        boolean done = true;

        System.out.println("int -> " + a);
        System.out.println("float -> " + b);
        System.out.println("double -> " + bb);
        System.out.println("char -> " + ch);
        System.out.println("boolean -> " + done);
    }
}

class Ques7{
    public void castToDouble(int a){
        System.out.println((double)a);
    }
    public void castToInt(double a){
        System.out.println((int)a);
    }
}

class Ques9{
    public void grade(int marks){
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks! Please enter marks between 0 and 100.");
        } else if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 80) {
            System.out.println("Grade: B");
        } else if (marks >= 70) {
            System.out.println("Grade: C");
        } else if (marks >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

    }
}

class Ques10{
    public void start(int num) {
        Scanner sc = new Scanner(System.in);
        int attempts = 1;

        System.out.print("Enter your guess: ");
        int guess = sc.nextInt();

        while (guess != num) {
            if (guess > num) {
                System.out.println("Guess Lower");
            } else {
                System.out.println("Guess Higher");
            }
            attempts++;
            System.out.print("Enter your guess: ");
                guess = sc.nextInt();
        }

        if (attempts == 1) {
            System.out.println("Congratulations! You won on the 1st try.");
        } else {
            System.out.println("Congratulations! You guessed it in " + attempts + " attempts.");
        }
    }
}

class Ques11{
    public void give(int a){
        int ans=1;
        while(a>0){
            ans*=a;
            a-=1;
        }
        System.out.println("Factorial is: "+ans);
    }
}

class Ques12{
    public void add(int a,int b){
        System.out.println(a+b);
    }
    public void add(double a,double b){
        System.out.println(a+b);
    }
    public void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
}

class Ques13{
    public int giveFibbo(int a){
        if(a==0 || a==1)return a;
        return giveFibbo(a-1)+giveFibbo(a-2);
    }
}

class Ques14{
    public void show(int[] nums){
        int max=0,sum=0,avg=0;
        for(int num:nums){
            if (num>max) max=num;
            sum+=num;
        }
        System.out.println("Greatest element: "+ max);
        System.out.println("Average of nums: "+ (sum/ nums.length));
    }
}

class Ques15{
    public void reverse(String s){
        StringBuilder sb=new StringBuilder(s);
        System.out.println(sb.reverse());
    }
}

class Ques16{
    public boolean check(String s){
        String ss=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int i=0,j=ss.length()-1;
        while (i<j){
            if (ss.charAt(i)!=ss.charAt(j)){
                return false;
            }
            i+=1;
            j-=1;
        }
        return true;
    }
}

class Ques18{
    public static class Animal{
        public void makeSound(){
            System.out.println("Animal sound ");
        }
    }
    public static class Dog extends Animal{
        @Override
        public void makeSound() {
            System.out.println("Woof-Woof");
        }
    }
}

class Ques19{
    interface Playable{
        void play();
    }
}

class Ques19_guitar implements Ques19.Playable{
    @Override
    public void play(){
        System.out.println("Violin playing here");
    }
}

class Ques19_Piano implements Ques19.Playable{
    @Override
    public void play(){
        System.out.println("Piano playing here");
    }
}




public class week1_assign {
    public static void main(String[] args) {
        // Hello world
//        Ques1 q1 =new Ques1();
//        q1.print();

        // Basic Calculator
//        Ques2 q2=new Ques2();
//        q2.calculate(5,0,'/');

        // Even-Odd checker
//        Ques3 q3=new Ques3();
//        q3.check(0);

        //Leap year checker
//        Ques4 q4=new Ques4();
//        q4.check(2000);

        //Multiplication table
//        Ques5 q5=new Ques5();
//        q5.table(7);

        //Data types
//        Ques6 q6=new Ques6();
//        q6.show();

        // Type Casting
//        Ques7 q7=new Ques7();
//        q7.castToDouble(7);
//        q7.castToInt(8.99);

        // Operators precedence xx

        // Grade Calculator
//        Ques9 q9=new Ques9();
//        q9.grade(78);

        // Number guessing game
//        Ques10 q10=new Ques10();
//        q10.start((int)(Math.random()*100+1));

        //Factorial display
//        Ques11 q11=new Ques11();
        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter input number:");
//        int a=sc.nextInt();
//        if (a>0){
//            q11.give(a);
//        }else System.out.println("Enter positive integer");

        // Method Overloading
//        Ques12 q12=new Ques12();
//        q12.add(4,5);
//        q12.add(4.07,5.81);
//        q12.add(4,2,6);

        // Recursive Fibonacci
//        Ques13 q13=new Ques13();
//        System.out.println(q13.giveFibbo(7));

        // Array operations - sum and average
//        Ques14 q14=new Ques14();
//        System.out.println("Enter number of elements in array:");
//        int n=sc.nextInt();
//        int[] nums=new int[n];
//        for(int i=0;i<n;i++){
//            nums[i]=sc.nextInt();
//        }
//        q14.show(nums);

        // Reverse String (Used Stringbuilder)
//        Ques15 q15=new Ques15();
//        q15.reverse("Akshansh");

        // Palindrome checker
//        Ques16 q16=new Ques16();
//        System.out.println("Enter String for palindrome checking");
//        String s=sc.nextLine();
//        System.out.println(q16.check(s));

        // Classes and Object creation
        // Doing for all previous questions

        // Inheritance example
//        Ques18 q18=new Ques18();
//        Ques18.Animal any= new Ques18.Animal();
//        any.makeSound();
//
//        Ques18.Dog d=new Ques18.Dog();
//        d.makeSound();

        // Implement interface
//        Ques19_guitar g1=new Ques19_guitar();
//        g1.play();
//        Ques19_Piano p1=new Ques19_Piano();
//        p1.play();

        // Try Catching ArithmeticExpression already done in calculator

        // Done

        // Q-24 ArrayList example
//        ArrayList<String> al=new ArrayList<>();
//        while(true){
//            String name=sc.nextLine();
//            if (name.equals("break"))break;
//            al.add(name);
//        }
//        System.out.println(al);



    }
}
