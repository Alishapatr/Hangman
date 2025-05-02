

import java.util.Scanner;
class Example{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number a:");
        int a= sc.nextInt();
        System.out.print("Enter number b:");
        int b = sc.nextInt();
        int res;
        try{
            res = a/b;
            System.out.println(res);

        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        finally{
            System.out.println("rest of the code");
        }
    }
}