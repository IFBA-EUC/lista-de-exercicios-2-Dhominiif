public class Quest_5{

    public static void main(String[] args){
        
        int cont = 1;
        String u[] = {"So para pular o vetor 0", "UM", "DOIS", "TRES", "QUATRO", "CINCO", "SEIS", "SETE", "OITO", "NOVE", "DEZ"};
       
        while(cont <= 10){

            int num = 1;

            System.out.println(" ");
            System.out.println("Tabela de multiplicação do numero "+u[cont]);
            System.out.println(" ");

            while(num <= 10){

                System.out.println(cont + " x " + num + " = " + (num*cont));
                num++;

            }
            
            cont++;
            System.out.println(" ");

        }

    }
}