import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Acao {

    static ArrayList dados = new ArrayList<Aluno>();

    public void cadastrar(){
        Aluno a = new Aluno();
        a.setNome(JOptionPane.showInputDialog(null, "Informe seu nome"));
        a.setNota1(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a primeira nota")));
        a.setNota2(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a segunda nota")));
        a.setNota3(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a terceira nota")));

        dados.add(a);

        JOptionPane.showMessageDialog(null, "Cadastro efetuado");

    }
    
    public void selecionar(){
        String texto = "Lista de alunos \n";
        for(int indice = 0; indice < dados.size(); indice++){
            Aluno a = new Aluno();
            a = (Aluno) dados.get(indice);

            texto += "\nNome: " + a.getNome();
            texto += " \nPrimeira nota: " + a.getNota1();
            texto += " \nSegunda nota: " + a.getNota2();
            texto += " \nTerceira nota: " + a.getNota3();

        }

        JOptionPane.showMessageDialog(null, texto);
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


    private int verificaExclusao(String nome) {
        int posicao = -1;

        for(int i=0; i<dados.size(); i++){
            Aluno a = new Aluno();
            a = (Aluno) dados.get(i);
        

            if(a.getNome().equals(nome)){
                posicao = i;
                break;
            }
        
        
        }
        
        return posicao;
    
    
    }
    

}
    

