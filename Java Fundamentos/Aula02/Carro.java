public class Carro {

    public String fabricante, modelo;
    public int ano;
    public double valor;
    public boolean tetoSolar;

    public void mensagem(){
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Valor: " + valor);
        System.out.println("Possui teto solar: " + (tetoSolar == true ? "sim" : "Nao"));
    }


}