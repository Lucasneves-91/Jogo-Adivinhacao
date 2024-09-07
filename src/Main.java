//Crie um programa que simula um jogo de adivinhação,
// que deve gerar um número aleatório entre 0 e 100 e
// pedir para que o usuário tente adivinhar o número, em até 5 tentativas.
// A cada tentativa, o programa deve informar se o número digitado pelo usuário é maior ou menor
//do que o número gerado.
//
//Dicas:
//
//Para gerar um número aleatório em Java: new Random().nextInt(100);
//Utilize o Scanner para obter os dados do usuário;
//Utilize uma variável para contar as tentativas;
//Utilize um loop para controlar as tentativas;
//Utilize a instrução break; para interromper o loop.

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numeroAleatorio = new Random().nextInt(100);
        int tentativa = 0;
        int chute = 0;
        Scanner leitura = new Scanner(System.in);



        while (tentativa <=4) {
            System.out.println("Adivinhe um número de 0 a 100.");
            tentativa ++;
            chute = leitura.nextInt();

            }

        }
    }


