package exercise3;

import java.util.Scanner;

public class NumberCounter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    int positive = 0;
    int negative = 0;
    double sum = 0;

    System.out.println("Enter number: ");
    int number = input.nextInt();

    while (number !=0) {
     if (number > 0){
       positive++;
     }else {
       negative++;
     }
      sum = sum + number;
     
     number = input.nextInt();
    
    }
       double avarage = sum / (positive + negative);

       System.out.println("Positive numbers: " + positive);
      System.out.println("Negative numbers: " + negative);
      System.out.println("Sum: " + sum);
      System.out.println("Average: " + avarage);
    }

}