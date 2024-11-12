import java.util.Scanner;
public class fibonacci{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in)
        System.out.println("Please enter Ist number: ");
        int a = input.nextInt();
        System.out.println("Please enter 2nd number: ");
        int b = input.nextInt();
        int sum = a + b;
        System.out.print(sum);
    }
}