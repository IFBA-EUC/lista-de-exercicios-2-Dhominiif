import java.util.Scanner;

public class Quest_15_1{
   
    public static void main(String[] args){

        Scanner l= new Scanner(System.in);

        Quest_15_0 le = new Quest_15_0();

        System.out.println("Digite suas notas: ");
        le.setmedia(l.nextDouble(), l.nextDouble(), l.nextDouble());
        le.status();

        l.close();
    }

}
