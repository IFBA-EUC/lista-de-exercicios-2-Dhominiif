import java.util.Scanner;
public class Quest_3 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        double x1, y1, x2, y2, distancia;

        /*  O defeito é que a divisão de inteiros, em java, sempre geram inteiros, logo, a divisão 1/2, que gera o 
            número real 0.5, é arredondado para 0, e todo número elevado a 0 resulta em 1. Para resolvermos basta 
            adicionarmos antes da divisão o "(double)", assim o compilador entenderá que o resultado tem que ser em double,
            e o valor da divisão resultará em 0.5                                                                           */
 
        System.out.println("Entre com as coordenadas x e y dos pontos nesta ordem:");
        x1 = teclado.nextFloat();
        y1 = teclado.nextFloat();
        x2 = teclado.nextFloat();
        y2 = teclado.nextFloat();
        teclado.close();
 
        distancia = Math.pow(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2), (double)1/2);
        System.out.println("A distância é: " + distancia);

    }

}
