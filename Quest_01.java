import java.lang.Math;
import java.util.Scanner;

public class Quest_01 {

    public static void main(String[] args){

        double delta, x1, x2, a, b, c;
        Scanner l = new Scanner(System.in);

        System.out.println("Qual o coeficiente 'a': ");
        a = l.nextInt();
        System.out.println("Qual o coeficiente 'b': ");
        b = l.nextInt();
        System.out.println("Qual o coeficiente 'c': ");
        c = l.nextInt();
        l.close();

        if(c == 0){ c = 1;}

        delta = (b*b)-4*a*c;

        System.out.println(" ");

        if(delta > 0){

            x1 = (-b + Math.sqrt(delta))/(2*a);
            x2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.printf("Primeira raiz= %f \n", x1);
            System.out.printf("Segunda raiz= %f \n", x2);

        }else if(delta == 0){

            x1 = (-b + Math.sqrt(delta))/(2*a);
            System.out.printf("A unica raiz é = %f \n", x1);

        }else{

            System.out.println("Não existe raiz para essa equação!");
            
        }

        System.out.println(" ");

    }

}
