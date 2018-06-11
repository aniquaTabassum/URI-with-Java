
import java.util.Scanner;


public class Main {
     public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
        {
            double total =0;
            for(int i=0;i<2;i++)
            {
                sc.nextInt();
            int quantity = sc.nextInt();
            Double amount = sc.nextDouble();
            total+=(quantity*amount);
            }
            System.out.printf("VALOR A PAGAR: R$ %.2f",total);
            System.out.println("");
        }
    }
}
