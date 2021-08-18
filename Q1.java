import java.lang.Math;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args){
        //ax^2 + bx + c = 0

        Scanner l = new Scanner(System.in);

        double delta, x1, x2, a, b, c;

        System.out.printf("Coeficiente a = ");
        a = l.nextDouble();
        System.out.printf("Coeficiente b = ");
        b = l.nextDouble();
        System.out.printf("Coeficiente c = ");
        c = l.nextDouble();

        delta = Math.pow(b, 2)-4*a*c;
        if(delta >= 0){
            x1 = (-b + Math.sqrt(delta))/2*a;
            x2 = (-b - Math.sqrt(delta))/2*a;
            System.out.println("Primeira raiz= "+x1);
            System.out.println("Segunda raiz= "+x2);
        }else{
            System.out.println("Não existe raiz para essa equação!");
        }

     }
}
