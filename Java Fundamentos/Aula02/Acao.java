import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Acao {
    
    static ArrayList dados = new ArrayList<Contato>();

    public void cadastrar(){

        Contato c = new Contato();
        c.setNome(JOptionPane.showInputDialog(null, "Informe seu nome"));
        c.setEndereco(JOptionPane.showInputDialog(null, "Informe o endereco"));
        c.setEmail(JOptionPane.showInputDialog(null, "Informe o e-mail"));

        dados.add(c);

        JOptionPane.showMessageDialog(null, "Cadastro efetuado");
    }

    public void selecionar(){
        String texto = "Lista de contato \n";
        for(int indice = 0; indice < dados.size(); indice++){
            Contato c = new Contato();
            c = (Contato) dados.get(indice);

            texto += "\nNome: " + c.getNome();
            texto += " | endereco: " + c.getEndereco();
            texto += " | e-mail: " + c.getEmail();

        }

        JOptionPane.showMessageDialog(null, texto);
    }

    private int verificaExclusao(String nome){
        int posicao = -1;

        for(int i=0; i<dados.size(); i++){
            Contato c = new Contato();
            c = (Contato) dados.get(i);

            if(c.getNome().equals(nome)){
                posicao = i;
                break;
            }
        }

        return posicao;
    }

    public void excluir(){
        String nome = JOptionPane.showInputDialog(null, "Informe um nome para remover");

        int valida = verificaExclusao(nome);

            if(valida == -1){
            JOptionPane.showMessageDialog(null, "Contato nao encontrado");
        }else{
            dados.remove(valida);
            JOptionPane.showMessageDialog(null, "Contato removido!");
        }
    }

}
