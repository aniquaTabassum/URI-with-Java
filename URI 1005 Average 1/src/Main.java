
import java.util.Scanner;


public class Main {
     public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
        {
            double a = sc.nextDouble()*3.5;
            double b = sc.nextDouble()*7.5;
            double PROD = (a)+(b);
            
            System.out.printf("MEDIA = %.5f",PROD/(3.5+7.5));
            System.out.println("");
        }
    }
}
