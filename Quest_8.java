import java.util.Scanner;

public class Quest_8 {

    public static void main(String[] args){
            
        int n, i, fib1 = 0, fib2 = 0, soma; 
        Scanner l = new Scanner(System.in);

        System.out.printf("Quantos numeros voce deseja: ");
        n = l.nextInt();
        l.close();

        if(n > 0){
            while(fib1 < 1){
                soma = fib1;
                fib2 = soma;
                System.out.printf(" "+soma+" ");
                fib1++;
            }
            if(fib1 == 1 ){

                if(n > 1){
                    for (i = 1; i <= n; i++){  

                        soma = fib1 + fib2;                    
                        fib1 = fib2;                           
                        fib2 = soma;
                                
                        System.out.printf(" "+soma+" ");
                                    
                    }  
                }     
            }
        }else{
            System.out.printf("\n\nESSA QUANTIDADE NAO E POSSIVEL!!\n\n");
        }
    }
}