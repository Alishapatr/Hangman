import java.util.Scanner;

class Days {
    public static void main(String[] args){

       Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int Day=sc.nextInt();
        switch(Day){

            case 1 -> System.out.println("Monday..");
            case 2 -> System.out.println("Tuesday..");
            case 3 -> System.out.println("Wednesday..");
            case 4 -> System.out.println("Thruesday..");
            case 5 -> System.out.println("Friday..");
            case 6 -> System.out.println("Saturday..");
            case 7 -> System.out.println("Sunday..");
            default -> System.out.println("Invalid..... \nThis number not carry any day so please enter a correct number \n THNAKYOU MY LOVE! ");
        }
    }
}