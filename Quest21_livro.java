public class Quest21_livro {
    
    private String nome, autor, editora; private int cod_livro;

    public Quest21_livro(String nome, String autor, String editora, int cod_livro){

        this.nome = nome;
        this.autor = autor;
        this.editora = editora;
        this.cod_livro = cod_livro;

    }
    public String getNome(){
        return this.nome;
    }
    public String getEditora(){
        return this.editora;
    }
    public String getAutor(){
        return this.autor;
    }
    public int getCodigo(){
        return this.cod_livro;
    }
    public void Status(){
        System.out.println(" ");
        System.out.println("Nome: "+this.getNome());
        System.out.println("Autor: "+this.getAutor());
        System.out.println("Editora: "+this.getEditora());
        System.out.println("Codigo do livro: "+this.getCodigo());
        System.out.println(" ");
    }
}
