import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Formulario {
    
    public static void main(String[] args) {
        
        JFrame obj = new JFrame();
        obj.setSize(600, 300);
        obj.setTitle("Meu formulario");
        obj.setLayout(null);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton botao = new JButton("Clique aqui");
        botao.setBounds(10, 10, 200, 70);

        JTextField campo = new JTextField();
        campo.setBounds(10, 10, 350, 70);

        obj.add(campo);
        obj.add(botao);
        
        obj.setVisible(true);


    }
}
