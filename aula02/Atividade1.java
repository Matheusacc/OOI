import java.util.Random;
import java.util.Scanner;

public class Atividade1 {

    public int minimo = 1;
    public int maximo = 2500;

    public void imprimePar() {
        for (int i = this.minimo; i <= this.maximo; i++) {
            if (i % 2 == 0) {
                System.out.println("O numero " + i + " é PAR!");
            }
        }

    }

    public void imprimeImp() {
        for (int i = this.minimo; i <= this.maximo; i++) {
            if (i % 2 != 0) {
                System.out.println("O numero " + i + " é IMPAR!");
            }
        }

    }

    public void imprimePrimo() {
        for (int i = this.minimo; i <= this.maximo; i++) {

            int numDivisores = 0;

            for (int j = this.minimo; j <= i; j++) {
                if (i % j == 0) {
                    numDivisores = numDivisores + 1;
                }

            }
            if (numDivisores == 2) {
                System.out.println("O numero " + i + " é PRIMO!");
            }
        }

    }

    public static void main(String[] args) {

        Atividade1 atividade = new Atividade1();
        atividade.imprimePar();
        System.out.println("==================================================");
        atividade.imprimeImp();
        System.out.println("==================================================");
        atividade.imprimePrimo();
        System.out.println("==================================================");

    }

}
