import java.util.Scanner;

public class Questao1 {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double a, b, c, resposta, x1, x2;

        System.out.println("Digite o valor do coeficeiente a: ");
        a = leitor.nextDouble();
        System.out.println("Digite o valor do coeficeiente b: ");
        b = leitor.nextDouble();
        System.out.println("Digite o valor do coeficeiente c: ");
        c = leitor.nextDouble();

        resposta = Math.pow(b, 2) - (4 * a * c);

        if(resposta < 0){
            System.out.println("RAIZES INEXISTENTES");
        }else{
            x1 = (-b + Math.sqrt(resposta))/(2*a);
            x2 = (-b - Math.sqrt(resposta))/(2*a);
            System.out.println("A segunda raiz é: " + x1 + " e " +x2);
            leitor.close();
        }

    }

}
