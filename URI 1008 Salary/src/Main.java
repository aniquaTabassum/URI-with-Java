
import java.util.Scanner;


public class Main {
     public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
        {
            int number = sc.nextInt();
            int hours = sc.nextInt();
            Double amount = sc.nextDouble();
            System.out.println("NUMBER = "+number);
            
            System.out.printf("SALARY = U$ %.2f",(hours*amount));
            System.out.println("");
        }
    }
}
