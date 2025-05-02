import java.util.Scanner;

public class MarkCal {
    public static void main(String[] args) {
        System.out.println("Enter student marks....");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter math marks: ");
        float math=sc.nextFloat();
        System.out.print("Enter phy marks: ");
        float phy = sc.nextFloat();
        System.out.print("Enter chem marks: ");
        float chem= sc.nextFloat();
        System.out.print("Enter bio marks: ");
        float Bio=sc.nextFloat();
        System.out.print("Enter IT marks: ");
        float IT=sc.nextFloat();
        System.out.println("Enter the total marks: ");
        int totalmarks=sc.nextInt();
        float sum = math + phy + chem + Bio + IT;
        System.out.println("Total marks: " +sum);
        float percentage = (sum/totalmarks) *100;
        System.out.print("Total percentage : "+percentage);

        }
    }
