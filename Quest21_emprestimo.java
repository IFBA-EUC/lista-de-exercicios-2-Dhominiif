public class Quest21_emprestimo {
    public static void main(String[] args){
        Quest21_livro l1 = new Quest21_livro(" Misery ", " Stephen King ", " Uma boa ", 1231);
        Quest21_livro l2 = new Quest21_livro(" A Máscara da Morte Escarlate ", " Edgar Alan Poe ", " Uma muito boa ", 3213);

        Quest21_pessoa p1 = new Quest21_pessoa("Maria", 1223123, 1231);
        Quest21_pessoa p2 = new Quest21_pessoa("Eduarda", 1223123, 3213);
        Quest21_pessoa p3 = new Quest21_pessoa("Breno", 1223123, 3213);
        Quest21_pessoa p4 = new Quest21_pessoa("Leticia, né?", 1223123, 3213);

        System.out.println("-------------------------");
        System.out.println(" ");
        if(p1.getCod() != 0){
            System.out.println("-------------------------");
            System.out.println("DADOS DO LIVRO: ");
            l1.Status();
            System.out.println(" ");
            System.out.println("DADOS DO SER: ");
            p2.StatusP();
            System.out.println(" ");
            System.out.println(" ");
        }else{
            System.out.println(" ");
            System.out.println("-------------------------");
            System.out.println("LIVRO DO CODIGO "+l1.getCodigo()+" indisponivel");
            System.out.println("Sinto muito, "+p1.getNomeP());
            System.out.println(" ");
        }
        if(p2.getCod() != p1.getCod()){
            System.out.println("-------------------------");
            System.out.println("DADOS DO LIVRO: ");
            l2.Status();
            System.out.println(" ");
            System.out.println("DADOS DO SER: ");
            p2.StatusP();
            System.out.println(" ");
            System.out.println(" ");
        }else{
            System.out.println(" ");
            System.out.println("-------------------------");
            System.out.println("LIVRO DO CODIGO "+l2.getCodigo()+" indisponivel");
            System.out.println("Sinto muito, "+p2.getNomeP());
            System.out.println(" ");
        }
        if(p3.getCod() != p2.getCod()){
            System.out.println("-------------------------");
            System.out.println("DADOS DO LIVRO: ");
            l2.Status();
            System.out.println(" ");
            System.out.println("DADOS DO SER: ");
            p3.StatusP();
            System.out.println(" ");
            System.out.println(" ");
        }else{
            System.out.println(" ");
            System.out.println("-------------------------");
            System.out.println("LIVRO DO CODIGO "+l2.getCodigo()+" indisponivel");
            System.out.println("Sinto muito, "+p3.getNomeP());
            System.out.println(" ");
        }
        if(p4.getCod() != p4.getCod()){
            System.out.println("-------------------------");
            System.out.println("DADOS DO LIVRO: ");
            l1.Status();
            System.out.println(" ");
            System.out.println("DADOS DO SER: ");
            p4.StatusP();
            System.out.println(" ");
            System.out.println(" ");
        }else{
            System.out.println(" ");
            System.out.println("-------------------------");
            System.out.println("LIVRO DO CODIGO "+l1.getCodigo()+" indisponivel");
            System.out.println("Sinto muito, "+p4.getNomeP());
            System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println("-------------------------");
    }
}