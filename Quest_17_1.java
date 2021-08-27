import java.util.Scanner;

public class Quest_17_1{
    public static void main(String[] args){

        Scanner l = new Scanner(System.in);
        Quest_17_0 n1 = new Quest_17_0();
        String r;

        do{
            System.out.printf("\n\nQual numero quer converter: ");
            n1.setNumero(l.nextInt());
            l.nextLine();

            n1.result();

            System.out.printf("\n\nQueres converter mais numeros (S/N): ");
            r = l.nextLine();


        }while("S".equals(r) || "s".equals(r));
        l.close();
    }
}
