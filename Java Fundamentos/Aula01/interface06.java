import javax.swing.JOptionPane;

public class interface06 {
    public static void main(String[] args) {
        //JOptionPane.showMessageDialog(null, "Ola mundo");
        //JOptionPane.showMessageDialog(null, "Ola novamente", "Roi", JOptionPane.WARNING_MESSAGE);

        //String nome = JOptionPane.showInputDialog(null, "ROi");
        //try{
        //    int idade = Integer.parseInt(JOptionPane.showMessageDialog(null, "Qual seu nome?"));
        //    double altura = Double.parseDouble(JOptionPane.showMessageDialog(null, "Informe sua altura?"));
        //}catch(Exception erro){
        //    JOptionPane.showMessageDialog(null, "Falha" + erro.getMessage());
        //}
        int opcao = JOptionPane.showConfirmDialog(null, "Está curtindo a praia?", null, JOptionPane.YES_NO_OPTION);
        JOptionPane.showMessageDialog(null, opcao == 0 ? "Boa!" : "Fodase");

    }
}
