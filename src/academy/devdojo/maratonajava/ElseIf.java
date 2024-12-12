package academy.devdojo.maratonajava;

public class ElseIf {
    public static void main(String[] args) {
        int idade = 15;
        boolean comprarBebida = idade >= 18;

        if ( comprarBebida != false) {
            System.out.println("Autorizado a comprar bebida alcólica");
        } else {
            System.out.println("Não autorizado a comprar bebida");
        }
    }
}
