
import java.util.Scanner;


public class Main {
     public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            
            System.out.printf("DIFERENCA = %d",((a*b)-(c*d)));
            System.out.println("");
        }
    }
}
