public class Quest21_pessoa{


    private String nomeP; private long CPF; private int CodigoDoLivro;

    public Quest21_pessoa(String nome, long CPF, int Cod){

        this.nomeP = nome;
        this.CPF = CPF;
        CodigoDoLivro = Cod;

    }
    public String getNomeP(){
        return this.nomeP;
    }
    public long getCPF(){
        return this.CPF;
    }
    public int getCod(){
        return this.CodigoDoLivro;
    }

    public void StatusP(){
        System.out.println(" ");
        System.out.println("Nome do ser pensante: "+this.getNomeP());
        System.out.println("CPF do energúmeno: "+this.getCPF());
        System.out.println(" ");
    }
}