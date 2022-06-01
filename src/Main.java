import desafios.Macaco;
import desafios.NumeroReverso;
import desafios.funcionarios.Consultor;
import desafios.funcionarios.Vendedor;
import desafios.jogo.JogoCraps;

public class Main {

    public static void main(String[] args) {
        NumeroReverso.numeroReverso();

        Macaco macaco1 = new Macaco();
        Macaco macaco2 = new Macaco();

        macaco1.comer("banana");
        macaco1.comer("banana");
        macaco1.comer("banana");

        macaco2.comer("pêra");
        macaco2.comer("maçã");
        macaco2.comer("uva");
        System.out.println("------");
        macaco1.digerir();
        macaco1.digerir();
        macaco1.digerir();
        macaco2.digerir();
        macaco2.digerir();
        macaco2.digerir();
        macaco2.digerir();

        Vendedor vendedor = new Vendedor("Ana Beatriz", 8457754281L,10d, 7);
        System.out.println(vendedor.calcularSalario());

        Consultor consultor = new Consultor("Joana", 845746854, 7000d, 7);
        System.out.println(consultor.calcularSalario());

        JogoCraps.jogar();
    }
}
