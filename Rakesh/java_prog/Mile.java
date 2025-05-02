import java.util.Scanner;

public class Mile {
    public static void main(String[] args) {

       System.out.println("Kilometer to miles converter");

       Scanner sc = new Scanner(System.in);

       System.out.print("Enter Kilometer = ");

       float KM= sc.nextFloat();


        float mile = 0.621371f;

        System.out.print("the miles is ="+KM*mile);

        }
    }