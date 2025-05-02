import java.util.Scanner;
class Equal_or_not{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first integer: ");
        float num1 = sc.nextInt();
        System.out.println("Enter a second integer: ");
        float num2 = sc.nextInt();

        if(num1 == num2){
            System.out.println("two no is equal");
        }else{
            System.out.println("not equal");

        }

    }
}