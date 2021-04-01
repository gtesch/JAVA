import javax.swing.JOptionPane;

public class Principal {
    
    public static void main(String[] args) {
        
        String  texto = "1) Cadastrar\n";
                texto += "2) Selecionar\n";
                texto += "3) Excluir\n";
                texto += "4) Finalizar";

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
 

        // Acao a = new Acao();
        // a.cadastrar();


        
        // Aluno a = new Aluno();
        // a.setNome("Tesch");
        // System.out.println(a.getNome());
        
        
        // Calculos c = new Calculos();
        // c.multiplicar(5,6);

        
        
        
        // Carro objeto = new Carro();
        // objeto.fabricante = "Hyundai";
        // objeto.modelo = "HB20";
        // objeto.ano = 2020;
        // objeto.tetoSolar = false;
        // objeto.valor = 55000;
        
        // objeto.mensagem();


        // Pessoa p = new Pessoa();
        // p.idade = 25;
        // p.altura = 1.85;
        // p.peso = 80;

        // p.mensagem();

    }

}
