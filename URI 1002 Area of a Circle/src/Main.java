
import java.util.Scanner;


public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
        {
            double radius = sc.nextDouble();
            System.out.printf("A=%.4f",(3.14159*radius*radius));
            System.out.println("");
        }
    }
}
