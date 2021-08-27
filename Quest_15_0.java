public class Quest_15_0 {
    
    private double media;

    public void setmedia(double n1, double n2, double n3){
        this.media = (n1+n2+n3)/3;
    }
    public void status(){

        System.out.println("---Status do aluno---");
        if(this.media > 6){
            System.out.println("Media = "+this.media);
            System.out.println("Aprovado!");
        }else if(this.media>=4 && this.media <= 6){
            System.out.println("Media = "+this.media);
            System.out.println("Verificação Suplementar!");
        }else{
            System.out.println("Media = "+this.media);
            System.out.println("Reprovado!");           
        }

    }
}
