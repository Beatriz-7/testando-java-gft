package desafios;

import java.util.Scanner;

/* Número Reverso:
Faça um programa que leia um valor inteiro (este número deverá conter 4 dígitos).
A saída deverá ser o reverso de um número inteiro informado.
Exemplo: Digamos que a entrada foi 3257. A resposta será 7523.

Regras:
a) A entrada deverá estar entre 1000 e 9999;
b) Se o usuário digitar 3 dígitos ou menos, o Programa avisa que tem que conter 4 digitos e continuar a
programação até a resposta final.

- é preciso transformar o "numeroInformado" em uma string, para que o número possa ser colocado do avesso
*/
public class NumeroReverso {

    public static void numeroReverso() { // método "numeroReverso" - irá executar a entrada, fazer verificação. Static permite chamar.
        Scanner scan = new Scanner(System.in); //scanner importa um número, recebe as entradas
        do {
          System.out.println("Informe um valor positivo e inteiro, que deverá conter 4 dígitos: "); //sout = imprimir
          int numeroInformado = scan.nextInt(); // recebe o valor e salva dentro da variável "numeroInformado"
          String numeroInformadoString = String.valueOf(numeroInformado); // transforma o número recebido em uma string
            if (numeroInformado>= 1000 && numeroInformado<=9999) {
              StringBuilder stringBuilder = new StringBuilder(numeroInformadoString); // classe que possui o método "reverse", que colocará a string ao reverso
              System.out.println(stringBuilder.reverse());
              break; // para o laço de repetição
          } else if(numeroInformadoString.length() < 4) { // tamanho menor que 4
                System.out.println("O valor informado deverá conter 4 dígitos!");
            }
        } while(true);

    }

}
