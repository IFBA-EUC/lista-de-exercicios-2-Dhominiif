import java.lang.Math;
import java.util.Scanner;

public class Quest_2_0 {

    public static void main(String[] args){
    
        double d, ax, ay, az, bx, by, bz;
        Scanner l = new Scanner(System.in);

        System.out.println("Qual o valor do primeiro 'x': ");
        ax = l.nextDouble();
        System.out.println("Qual o valor do primeiro 'y': ");
        ay = l.nextDouble();
        System.out.println("Qual o valor do primeiro 'z': ");
        az = l.nextDouble();

        System.out.println("Qual o valor do segundo 'x': ");
        bx = l.nextDouble();
        System.out.println("Qual o valor do segundo 'y': ");
        by = l.nextDouble();
        System.out.println("Qual o valor do segundo 'z': ");
        bz = l.nextDouble();
        l.close();
        

        d = Math.sqrt(Math.pow((bx - ax), 2) + Math.pow((by - ay), 2) + Math.pow((bz-az), 2));

        System.out.printf("A distancia entre os dois pontos num espaço de 3 dimensoes: %.1f", d);
        
    }

}
