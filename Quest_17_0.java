public class Quest_17_0 {
    
    private String numeRo[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"}; 
    private int nume[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1}; int num, n = 0, n2 = 0, reconhecimento, f=0; 
    String nOS[] = new String[50];

    public void setNumero(int n){
        if(n <= 999 && n > 0){
            this.num = n;
            this.reconhecimento = this.num;
            this.setConversao();
        }else if(n > 999){
            f = 1;
            this.reconhecimento = n;
        }else{
            f = 2;
        }

    }

    public void setConversao(){

        while(this.num > 0){

            if(this.num >= this.nume[n]){
                this.nOS[n2] = this.numeRo[n];
                this.num = this.num - this.nume[n];
                this.n2++;

            }else{
                this.n++;
            }
        }
    }

    public void result(){
        System.out.println(" ");
        System.out.println(" ");
        if(f == 0 ){            
            System.out.printf("-----------CONVERCAO DO NUMERO %d-----------", this.reconhecimento);
            System.out.println(" ");
            System.out.println(" ");

            for(int n3 = 0; n3 < this.n2; n3++){
                System.out.printf(this.nOS[n3]);
            }
            System.out.println(" ");
            System.out.println(" ");
            System.out.printf("-------------------FIM---------------------");
            System.out.println(" ");
            System.out.println(" ");
        }else if(f == 2){
            System.out.printf("------------------ERROR--------------------");
            System.out.println(" ");
            System.out.println(" ");
            System.out.printf("SEM CORRESPONDENTE EM ROMANOS PARA O NUMERO %d", this.reconhecimento);
            System.out.println(" ");
            System.out.println(" ");
            System.out.printf("-------------------FIM---------------------");
            System.out.println(" ");
            System.out.println(" ");
        }else if(f == 1){
            System.out.printf("------------------ERROR--------------------");
            System.out.println(" ");
            System.out.println(" ");
            System.out.printf("O NUMERO %d EXERCEU O LIMITE DE TRES DIGITOS", this.reconhecimento);
            System.out.println(" ");
            System.out.println(" ");
            System.out.printf("-------------------FIM---------------------");
            System.out.println(" ");
            System.out.println(" ");
        }
    }

}
