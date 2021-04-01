public class Pessoa {
    
    public String nome;
    public int idade;
    public double peso, altura;


    private String situacaoIdade(){
        return idade >= 18 ? "Maior de idade" : "Menor de idade";
    }

    private double calculoIMC(){
        return peso / (altura * altura);
    }

    private String situacaoIMC(){
        String situacao;

        if(calculoIMC() < 17){
            situacao = "abaixo do peso";
        }else if(calculoIMC() < 25){
            situacao = "Normal";
        }else{
            situacao = "Acima do peso";
        }

        return situacao;
    }

    public void mensagem(){
        System.out.println(situacaoIdade());
        System.out.println(calculoIMC());
        System.out.println(situacaoIMC());
    }



}
