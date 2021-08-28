public class Quest20_Contato {

    String nome; int numero;

    public void setContato(int n, String no){
        this.numero = n;
        this.nome = no;
    }

    public void status(){
        System.out.println(" ");
        System.out.println(this.nome);
        System.out.println(this.numero);
        System.out.println(" ");
    }
}
