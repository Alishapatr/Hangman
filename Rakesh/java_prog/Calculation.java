import java.util.Scanner;
class MarkCalculation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first integer: ");
        float num1 = sc.nextInt();
        System.out.println("Enter a second integer: ");
        float num2 = sc.nextInt();


        float addition =num1 + num2;
        float Substraction = num1 - num2;
        float multiplication = num1 * num2;
        float division = num1 / num2;
        float modulo = num1 % num2;

        System.out.println("Result\n");
        System.out.println("Add: " +addition);
        System.out.println("Subs: "+Substraction);
        System.out.println("divi: "+division);
        System.out.println("mult: "+multiplication);
        System.out.println("MOdulo: "+modulo);

    }
}