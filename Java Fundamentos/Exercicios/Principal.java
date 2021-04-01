import javax.swing.JOptionPane;

public class Principal{
    public static void main(String[] args) {
        String texto = "1) Cadastrar\n";
        texto += "2) Selecionar\n";
        texto += "3) Excluir\n";

        Acao a = new Acao();

        int opcao = 0;

        do{
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null, texto));

            switch(opcao){
                case 1: a.cadastrar(); break;
                case 2: a.selecionar(); break;
                case 3: a.excluir(); break;
                case 4: JOptionPane.showInputDialog(null, "Obrigado por utilizar o sistema"); break;
            }
        }while(opcao != 4);

    }
}