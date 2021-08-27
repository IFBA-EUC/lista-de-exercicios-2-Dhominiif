public class Quest_18_0{

    private String u[]= {" ZERO ", " UM ", " DOIS ", " TRES ", " QUATRO ", " CINCO ", " SEIS ", " SETE ", " OITO ", " NOVE "};
    private String d[]= {" ZERO ", " DEZ ", " VINTE ", " TRINTA ", " QUARENTA ", " CINQUENTA ", " SESSENTA ", " SETENTA ", " OITENTA ", " NOVENTA "};
    private String c[]= {" ZERO ", " CEM ", " DUZENTOS ", " TREZENTOS ", " QUATROCENTOS ",  " QUINHENTOS ", " SEICENTOS ", " SETECENTOS ", " OITOCENTOS ", " NOVECENTOS "};
    private String unidade[] = new String[3], dezena[] = new String[3], centena[] = new String[3];

    private int c1, c2, c3, c4, c5, c6, c7, c8, c9, f = 0; long n;
    
    public Quest_18_0(long n){
        if(n > 999999999){
            f = 1;
        }else if(n==0){
            f = 2;
        }else{
            this.n = n;

            //Chamando metodo caso o numero digitado tiver 9 ou - digitos
            this.setMilhao();
        }
    }
    
    public void setMilhao(){

        this.unidade[0] = null;
        this.dezena[0] = null;
        this.centena[0] = null;

        //Descobrindo e convertendo cada valor
        this.c1 = (int) this.n/100000000;
        if(this.c1 != 0){
            this.centena[0] = this.c[this.c1];
            this.n = this.n-(this.c1*100000000);
        }
            
        this.c2 = (int) this.n/10000000;
        if(this.c2 != 0){
            this.dezena[0] = this.d[this.c2];
            this.n = this.n-(this.c2*10000000);
        }

        this.c3 = (int) this.n/1000000;
        if(this.c3 != 0){
            this.unidade[0] = this.u[this.c3];
            this.n = this.n-(this.c3*1000000);
        }

        //Chamando metodo
        this.setMilhar();

    }
        
    public void setMilhar(){

        this.unidade[1] = null;
        this.dezena[1] = null;
        this.centena[1] = null;

        //Descobrindo e convertendo cada valor
        this.c4 = (int) this.n/100000;
        if(this.c4 != 0){
            this.centena[1] = this.c[this.c4];
            this.n = this.n-(this.c4*100000);
        }

        this.c5 = (int) this.n/10000;
        if(this.c5 != 0){
            this.dezena[1] = this.d[this.c5];
            this.n = this.n-(this.c5*10000);
        }

        this.c6 =  (int) this.n/1000;
        if(this.c6 != 0){
            this.unidade[1] = this.u[this.c6];
            this.n = this.n-(this.c6*1000);
        }

        //Chamando metodo
        this.setCentena();

    }
        
    public void setCentena(){

        this.unidade[2] = null;
        this.dezena[2] = null;
        this.centena[2] = null;

        //Descobrindo cada valor
        this.c7 =  (int) this.n/100;
        if(this.c7 != 0){
            this.centena[2] = this.c[this.c7];
            this.n = this.n-(this.c7*100);
        }

        this.c8 = (int) this.n/10;
        if(this.c8 != 0){
            this.dezena[2] = this.d[this.c8];
            this.n = this.n-(this.c8*10);
        }

        this.c9 = (int) this.n;
        if(this.c9 != 0){
            this.unidade[2] = this.u[this.c9];
        }

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
        }else if(f == 2){
            System.out.println(" ");
            System.out.println("-------------------NUMERO CONVERTIDO-------------------");
            System.out.println(" ");
            System.out.println("ZERO");
            System.out.println(" ");
            System.out.println("-------------------------------------------------------");
            System.out.println(" ");
        }else{
            System.out.println(" ");
            System.out.println("-------------------NUMERO CONVERTIDO-------------------");
            System.out.println(" ");
            
            if(this.centena[0] != null || this.dezena[0] != null || this.unidade[0] != null){
                if(this.centena[0] != null){
                    System.out.print(this.centena[0]);
                }
                if(this.dezena[0] != null){
                    System.out.print(this.dezena[0]);
                }
                if(this.unidade[0] != null){
                    System.out.print(this.unidade[0]);
                }
                System.out.print("milhao");
            }

            if(this.centena[1] != null || this.dezena[1] != null || this.unidade[1] != null){
                if(this.centena[1] != null){
                    System.out.print(this.centena[1]);
                }
                if(this.dezena[1] != null){
                    System.out.print(this.dezena[1]);
                }
                if(this.unidade[1] != null){
                    System.out.print(this.unidade[1]);
                }
                System.out.print("mil");
            }

            if(this.centena[2] != null || this.dezena[2] != null || this.unidade[2] != null){
                if(this.centena[2] != null){
                    System.out.print(this.centena[2]);
                }
                if(this.dezena[2] != null){
                    System.out.print(this.dezena[2]);
                }
                if(this.unidade[2] != null){
                    System.out.print(this.unidade[2]);
                }
            }
            System.out.println(" ");
            System.out.println("-------------------------------------------------------");
            System.out.println(" ");
        }
    }
}