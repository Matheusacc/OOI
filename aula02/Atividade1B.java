
import java.util.*;

public class Atividade1B {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int maiorn;
        int menorn;
        int soma = 0;
        int count = 0;
        int varLido;
        Vector<Integer> numDigitados = new Vector<Integer>();

        while (count < 100) {
            System.out.println("Digite um número: ");
            varLido = scan.nextInt();
            count++;

            if (varLido == -1) {
                break;
            }
            numDigitados.add(varLido);
        }

        for (int elementoVetor : numDigitados) {
            soma = soma + elementoVetor;
        }

        maiorn = Collections.max(numDigitados);
        menorn = Collections.min(numDigitados);
        System.out.println("O maior valor digitado pelo usuario foi : " + maiorn);
        System.out.println("===================================================");

        System.out.println("O menor valor digitado pelo usuario foi : " + menorn);
        System.out.println("===================================================");

        System.out.println("A soma dos valores digitado pelo usuario foi : " + soma);
        System.out.println("===================================================");

        for (int elementoVetor : numDigitados) {
            System.out.println(
                    "O numero " + elementoVetor + " subtraido de " + maiorn + " é : " + (elementoVetor - maiorn));
            System.out.println("===================================================");
        }

        for (int elementoVetor : numDigitados) {
            System.out
                    .println("O numero " + elementoVetor + " somado de " + menorn + " é : " + (elementoVetor + menorn));
            System.out.println("===================================================");
        }

    }

}