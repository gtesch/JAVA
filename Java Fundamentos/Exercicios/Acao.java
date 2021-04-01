import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Acao {
    
    static ArrayList dados = new ArrayList<Produto>();
    
    public void cadastrar(){

        Produto p = new Produto();
        p.setNome(JOptionPane.showInputDialog(null, "Informe seu nome"));
        p.setMarca(JOptionPane.showInputDialog(null, "Informe a marca"));
        p.setValor(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor")));

        dados.add(p);

        JOptionPane.showMessageDialog(null, "Cadastro efetuado");
    }
        
        
        public void selecionar(){
            String texto = "Lista de contato \n";
            for(int indice = 0; indice < dados.size(); indice++){
                Produto p = new Produto();
                p = (Produto) dados.get(indice);
    
                texto += "\nNome: " + p.getNome();
                texto += " Marca: " + p.getMarca();
                texto += " Valor: " + p.getValor();
    
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
            Produto p = new Produto();
            p = (Produto) dados.get(i);

            if(p.getNome().equals(nome)){
                posicao = i;
                break;
            }
        }

        return posicao;
    }
    

}
