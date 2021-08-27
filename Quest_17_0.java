public class Quest_17_0 {
    
    private String unida[] = {" ", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    private String dezen[] = {" ", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    private String centen[] = {" ", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    int num, reconhecimento, f=0, test; 
    private String unidade[] = new String[1], dezena[] = new String[1], centena[] = new String[1];

    public void setNumero(int n){

        //Para quando o laço for reiniciado
        this.unidade[0] = null;
        this.dezena[0] = null;
        this.centena[0] = null;

        if(n <= 999 && n > 0){
            this.num = n;
            this.reconhecimento = this.num;
            this.setCentena();
        }else if(n > 999){
            f = 1;
            this.reconhecimento = n;
        }else{
            f = 2;
        }

    }

    public void setCentena(){
        if(this.num/100 != 0){

            this.test = this.num/100;
            this.centena[0] = centen[this.test];
            this.num = this.num - (100*this.test);
            this.setDezena();

        }else{
            this.setDezena();
        }
    }
    public void setDezena(){
        if(this.num/10 != 0){

            this.test = this.num/10;
            this.dezena[0] = dezen[this.test];
            this.num = this.num - (10*this.test);
            this.setUnidade();

        }else{
            this.setUnidade();
        }
    }
    public void setUnidade(){
            this.unidade[0] = unida[this.num];
    }

    public void result(){
        System.out.println(" ");
        System.out.println(" ");
        if(f == 0 ){            
            System.out.printf("-----------CONVERCAO DO NUMERO %d-----------", this.reconhecimento);
            System.out.println(" ");
            System.out.println(" ");
            if(this.centena[0] != null){
                System.out.printf(this.centena[0]);
            }
            if(this.dezena[0] != null){
                System.out.printf(this.dezena[0]);
            }
            if(this.unidade[0] != null){
                System.out.printf(this.unidade[0]);
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
