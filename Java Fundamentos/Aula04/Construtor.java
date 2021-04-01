import javax.swing.JOptionPane;

public class Construtor {

    public Construtor(){
        JOptionPane.showMessageDialog(null, "Executando o primeiro construtor");
    }

    public Construtor(String nome){
        JOptionPane.showMessageDialog(null, "Olá " + nome);
    }

    public Construtor(String nome, int idade){
        JOptionPane.showMessageDialog(null, "Ola " + nome + " Voce tem " + idade + " anos.");
    }
}