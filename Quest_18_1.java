import java.util.Scanner;

public class Quest_18_1 {
    
    public static void main(String[] args){
    
        Scanner l = new Scanner(System.in);
        Long num; String r;

        do{

            System.out.printf("Numero a ser convertido: ");
            num = l.nextLong();
            l.nextLine();
            Quest_18_0 n1 = new Quest_18_0(num);

            n1.result();

            System.out.printf("\n\nConverte mais um num (S/N): ");
            r = l.nextLine();
            System.out.println(" ");
            System.out.println(" ");

            
        
        }while("s".equals(r) || "S".equals(r));

        l.close();

    }
}
