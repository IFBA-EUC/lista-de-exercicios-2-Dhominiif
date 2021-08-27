import java.util.Scanner;

public class Quest_10{

    public static void main(String[] args){

        Scanner l = new Scanner(System.in);

        double inv, juros, total = 0;
        String r;

        System.out.printf("Quanto quer investir: ");
        inv = l.nextDouble();
        System.out.printf("Quanto que e o juros: ");
        juros = l.nextDouble();
        l.nextLine();

        do{
            for(int i = 1; i <= 12; i++){

                inv = inv+(inv*juros)/100;
                total = total + inv;

            }
            System.out.print("\nSaldo do investimento após 1 ano: "+total);
            System.out.printf("\n\nDeseja processar mais um ano? (S/N) ");
            r = l.nextLine();
            inv = total;

        }while("s".equals(r) || "S".equals(r));
        l.close();

    }

}
