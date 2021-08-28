public class Quest20_Agenda {

    Quest20_Contato n1 = new Quest20_Contato();

    public Quest20_Agenda(int n, String no){
        n1.setContato(n, no);
    }

    public void status(){
        System.out.println(" ");
        System.out.println("INFORMACOES DOS CONTATOS");
        n1.status();

    }
}
