
import java.text.DecimalFormat;
import java.util.Scanner;


public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
        {
            DecimalFormat df2 = new DecimalFormat(".#");
            double total = 0;
            double a = sc.nextDouble()*2;
            double b = sc.nextDouble()*3;
            double c = sc.nextDouble()*4;
            double d = sc.nextDouble();
            total = a+b+c+d;
            total/=10;
             System.out.println("Media: "+df2.format(total));       
             
             if(total>=7)
                 System.out.println("Aluno aprovado.");
             else if(total<5)
                 System.out.println("Aluno reprovado.");
             else
             {
                 System.out.println("Aluno em exame.");
                 double n = sc.nextDouble();
                 total+=n;
                 total/=2;
                 System.out.printf("Nota do exame: %.1f",n);
                 System.out.println("");
                 if(total>5)
                     System.out.println("Aluno aprovado.");
                 else
                     System.out.println("Aluno reprovado.");
                 System.out.println("Media final: "+df2.format(total));
                 //System.out.println("");
             }
        }
    }
}
