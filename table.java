import java.util.Scanner;
public class table{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int n = input.nextInt();
        for (int i = 1; i <= 10; i ++)
        System.out.println(n + " * " + i + " = " + n * i);
    }
}