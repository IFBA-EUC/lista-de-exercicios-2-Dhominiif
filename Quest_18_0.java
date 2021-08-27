public class Quest_18_0{

    private String u[]= {" ZERO ", " UM ", " DOIS ", " TRES ", " QUATRO ", " CINCO ", "SEIS", " SETE ", " OITO ", " NOVE "};
    private String d[]= {" ZERO ", " DEZ ", " VINTE ", " TRINTA ", " QUARENTA ", " CINQUENTA ", " SESSENTA ", "SETENTA ", " OITENTA ", " NOVENTA "};
    private String c[]= {" ZERO ", " CEM ", " DUZENTOS ", " TREZENTOS ", " QUATROCENTOS ",  " QUINHENTOS ", " SEICENTOS ", " SETECENTOS ", " OITOCENTOS ", " NOVECENTOS "};

    private int c1, c2, c3, c4, c5, c6, c7, c8, c9, f = 0; long n;
    
    public Quest_18_0(long n){
        if(n > 999999999){
            f = 1;
        }else{
            this.n = n;

            //Chamando metodo caso o numero digitado tiver 9 ou - digitos
            this.setMilhao();
        }
    }
    
    public void setMilhao(){

            //Descobrindo os valores
            this.c1 = (int) this.n/100000000;
            this.n = this.n-(this.c1*100000000);
            this.c2 = (int) this.n/10000000;
            this.n = this.n-(this.c2*10000000);
            this.c3 = (int) this.n/1000000;
            this.n = this.n-(this.c3*1000000);

            //Chamando metodo
            this.setMilhar();

    }
        
    public void setMilhar(){

        //Descobrindo cada valor
        this.c4 = (int) this.n/100000;
        this.n = this.n-(this.c4*100000);
        this.c5 = (int) this.n/10000;
        this.n = this.n-(this.c5*10000);
        this.c6 =  (int) this.n/1000;
        this.n = this.n-(this.c6*1000);

        //Chamando metodo
        this.setCentena();

    }
        
    public void setCentena(){

        //Descobrindo cada valor
        this.c7 =  (int) this.n/100;
        this.n = this.n-(this.c7*100);
        this.c8 = (int) this.n/10;
        this.n = this.n-(this.c8*10);
        this.c9 = (int) this.n;

        //não precisa chamar metodo
    }

    public void result(){
        if(f == 1){
            System.out.println(" ");
            System.out.println("-------------------------ERROR-------------------------");
            System.out.println(" ");
            System.out.println("EU CONVERTO NUMEROS COM NOVE OU MENOS DIGITOS");
            System.out.println(" ");
            System.out.println("-------------------------------------------------------");
            System.out.println(" ");
        }else{
            System.out.println(" ");
            System.out.println("-------------------NUMERO CONVERTIDO-------------------");
            System.out.println(" ");

            //Traduzindo milhao
            if(this.c1 != 0 || this.c2 != 0 || this.c3 != 0){
                if(this.c1 != 0){
                    System.out.printf(this.c[this.c1]);
                }
                if(this.c2 != 0){
                    System.out.printf(this.d[this.c2]);
                }
                if(this.c3 != 0){
                    System.out.printf(this.u[this.c3]);
                }

                System.out.printf(" milhao ");
            }

            //Traduzindo millhar
            if(this.c4 != 0 || this.c5 != 0 || this.c6 != 0){
                if(this.c4 != 0){
                    System.out.printf(this.c[this.c4]);
                }
                if(this.c5 != 0){
                    System.out.printf(this.d[this.c5]);
                }
                if(this.c6 != 0){
                    System.out.printf(this.u[this.c6]);
                }

                System.out.printf(" mil ");
            }

            //Traduzindo centena para trás
            if(this.c7 != 0 || this.c8 != 0 || this.c9 != 0){
                if(this.c7 != 0){
                    System.out.printf(this.c[this.c7]);
                }
                if(this.c8 != 0){
                    System.out.printf(this.d[this.c8]);
                }
                if(this.c9 != 0){
                    System.out.printf(this.u[this.c9]);
                }
            }

            System.out.println(" ");
            System.out.println("-------------------------------------------------------");
            System.out.println(" ");
        }
    }
}