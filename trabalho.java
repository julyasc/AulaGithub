package trabalho;



import java.util.Random;
import java.util.Scanner;



public class MenuDeOpcoes {



 public static void main(String[] args) {



  Scanner teclado = new Scanner(System.in);



  int opcao = 1;



  int[] vetor = new int[10];



  while (opcao != 0) {



   System.out.println();



   System.out.println("MENU DE OPÇÕES");



   System.out.println("1º opção: Coleta dados do vetor");



   System.out.println("2º opção: gera valores randômicos para o vetor");



   System.out.println("3º opção: imprime dados do vetor");



   System.out.println("4º opção: Imprime vetor invertido");



   System.out.println("5º opção: Soma valores do vetor");



   System.out.println("6º opção: Soma personalizada de valores do vetor");



   System.out.println("7º opção: A média dos valores do vetor");



   System.out.println("8º opção: O maior valor dentro do vetor");



   System.out.println("9º opção: Menor valor dentro do vetor");



   System.out.println("Digite 0 para sair.");



   System.out.print("Digite a opção desejada: ");



   opcao = teclado.nextInt();



   if (opcao == 1) {



    vetor = coletaVetor(vetor);



   } else if (opcao == 2) {



    System.out.print("Qual o valor máximo para os valores do vetor? ");



    int max = teclado.nextInt();



    vetor = geraVetorRandomico(vetor, max);



    System.out.print("Valores randômicos gerados: " + vetor[0]);



    for (int i = 1; i < vetor.length; i++) {



     System.out.print(", " + vetor[i]);



    }



   } else if (opcao == 3) {



    imprimeVetor(vetor);



   } else if (opcao == 4) {



    imprimeVetorInvertido(vetor);



   } else if (opcao == 5) {



    System.out.println("Soma de todos os valores do vetor: " + somaTodos(vetor));



   } else if (opcao == 6) {



    System.out.print("Índice de início (inclusive): ");



    int inicio = teclado.nextInt();



    System.out.print("Índice de término (inclusive): ");



    int termino = teclado.nextInt();



    testeIndices(vetor, inicio, termino);



   } else if (opcao == 7) {



    media(vetor);



   } else if (opcao == 8) {



    System.out.println("O maior valor do vetor é: " + maiorValor(vetor));



   } else if (opcao == 9) {



    System.out.println("O menor valor do vetor é: " + menorValor(vetor));



   } else if (opcao >= 10) {



    System.out.println("Opção inválida");



   }



  }



  System.out.println("Fim do algoritmo");



 }



 public static int[] coletaVetor(int[] vetor) {



  Scanner teclado = new Scanner(System.in);



  for (int i = 0; i < vetor.length; i++) {



   System.out.print("Informe o " + (i + 1) + "º valor do vetor: ");



   vetor[i] = teclado.nextInt();



  }



  return vetor;



 }



 public static int[] geraVetorRandomico(int[] vetor, int max) {



  Random ale = new Random();



  for (int i = 0; i < vetor.length; i++) {



   vetor[i] = ale.nextInt(max + 1);



  }



  return vetor;



 }



 public static void imprimeVetor(int[] vetor) {



  System.out.print("Dados do vetor: " + vetor[0]);



  for (int i = 1; i < vetor.length; i++) {



   System.out.print(", " + vetor[i]);



  }



 }



 public static void imprimeVetorInvertido(int[] vetor) {



  System.out.print("Dados do vetor: " + vetor[vetor.length - 1]);



  for (int i = (vetor.length - 2); i >= 0; i--) {



   System.out.print(", " + vetor[i]);



  }



 }



 public static int somaTodos(int[] vetor) {



  int soma = 0;



  for (int i = 0; i < vetor.length; i++) {



   soma += vetor[i];



  }



  return soma;



 }



 public static void testeIndices(int[] vetor, int inicio, int termino) {



  if (inicio > termino || inicio > (vetor.length - 1) || termino > (vetor.length - 1)) {



   System.out.println("Verifique restrições do algoritmo!");



  } else {



   System.out.println("Soma personalizada: " + somaPersonalizada(vetor, inicio, termino)); 



  }



 }



 public static int somaPersonalizada(int[] vetor, int inicio, int termino) {



  int somaPersonalizada = 0;



  for (int i = inicio; i <= termino; i++) {

   somaPersonalizada += vetor[i]; 

  }



  return somaPersonalizada;



 }



 public static double media(int[] vetor) {



  int media = somaTodos(vetor) / (vetor.length - 1);



  return media;



 }



 public static int maiorValor(int[] vetor) {



  int maiorValor;



  if (vetor[0] > vetor[1] && vetor[0] > vetor[2] && vetor[0] > vetor[3] && vetor[0] > vetor[4]



    && vetor[0] > vetor[5] && vetor[0] > vetor[6] && vetor[0] > vetor[7] && vetor[0] > vetor[8]



    && vetor[0] > vetor[9]) {



   maiorValor = vetor[0];



  } else if (vetor[1] > vetor[0] && vetor[1] > vetor[2] && vetor[1] > vetor[3] && vetor[1] > vetor[4]



    && vetor[1] > vetor[5] && vetor[1] > vetor[6] && vetor[1] > vetor[7] && vetor[1] > vetor[8]



    && vetor[1] > vetor[9]) {



   maiorValor = vetor[1];



  } else if (vetor[2] > vetor[1] && vetor[2] > vetor[0] && vetor[2] > vetor[3] && vetor[2] > vetor[4]



    && vetor[2] > vetor[5] && vetor[2] > vetor[6] && vetor[2] > vetor[7] && vetor[2] > vetor[8]



    && vetor[2] > vetor[9]) {



   maiorValor = vetor[2];



  } else if (vetor[3] > vetor[1] && vetor[3] > vetor[2] && vetor[3] > vetor[0] && vetor[3] > vetor[4]



    && vetor[3] > vetor[5] && vetor[3] > vetor[6] && vetor[3] > vetor[7] && vetor[3] > vetor[8]



    && vetor[3] > vetor[9]) {



   maiorValor = vetor[3];



  } else if (vetor[4] > vetor[1] && vetor[4] > vetor[2] && vetor[4] > vetor[3] && vetor[4] > vetor[0]



    && vetor[4] > vetor[5] && vetor[4] > vetor[6] && vetor[4] > vetor[7] && vetor[4] > vetor[8]



    && vetor[4] > vetor[9]) {



   maiorValor = vetor[4];



  } else if (vetor[5] > vetor[1] && vetor[5] > vetor[2] && vetor[5] > vetor[3] && vetor[5] > vetor[4]



    && vetor[5] > vetor[0] && vetor[5] > vetor[6] && vetor[5] > vetor[7] && vetor[5] > vetor[8]



    && vetor[5] > vetor[9]) {



   maiorValor = vetor[5];



  } else if (vetor[6] > vetor[1] && vetor[6] > vetor[2] && vetor[6] > vetor[3] && vetor[6] > vetor[4]



    && vetor[6] > vetor[5] && vetor[6] > vetor[0] && vetor[6] > vetor[7] && vetor[6] > vetor[8]



    && vetor[6] > vetor[9]) {



   maiorValor = vetor[6];



  } else if (vetor[7] > vetor[1] && vetor[7] > vetor[2] && vetor[7] > vetor[3] && vetor[7] > vetor[4]



    && vetor[7] > vetor[5] && vetor[7] > vetor[6] && vetor[7] > vetor[0] && vetor[7] > vetor[8]



    && vetor[7] > vetor[9]) {



   maiorValor = vetor[7];



  } else if (vetor[8] > vetor[1] && vetor[8] > vetor[2] && vetor[8] > vetor[3] && vetor[8] > vetor[4]



    && vetor[8] > vetor[5] && vetor[8] > vetor[6] && vetor[8] > vetor[7] && vetor[8] > vetor[0]



    && vetor[8] > vetor[9]) {



   maiorValor = vetor[8];



  } else if (vetor[9] > vetor[1] && vetor[9] > vetor[2] && vetor[9] > vetor[3] && vetor[9] > vetor[4]



    && vetor[9] > vetor[5] && vetor[9] > vetor[6] && vetor[9] > vetor[7] && vetor[9] > vetor[8]



    && vetor[9] > vetor[0]) {



   maiorValor = vetor[9];



  } else {



   maiorValor = 0;



   System.out.println("Não há maior valor");



  }



  return maiorValor;



 }



 public static int menorValor(int[] vetor) {



  int menorValor;



  if (vetor[0] < vetor[1] && vetor[0] < vetor[2] && vetor[0] < vetor[3] && vetor[0] < vetor[4]



    && vetor[0] < vetor[5] && vetor[0] < vetor[6] && vetor[0] < vetor[7] && vetor[0] < vetor[8]

    && vetor[0] < vetor[9]) {



   menorValor = vetor[0];



  } else if (vetor[1] < vetor[0] && vetor[1] < vetor[2] && vetor[1] < vetor[3] && vetor[1] < vetor[4]

    && vetor[1] < vetor[5] && vetor[1] < vetor[6] && vetor[1] < vetor[7] && vetor[1] < vetor[8]

    && vetor[1] < vetor[9]) {



   menorValor = vetor[1];



  } else if (vetor[2] < vetor[1] && vetor[2] < vetor[0] && vetor[2] < vetor[3] && vetor[2] < vetor[4]

    && vetor[2] < vetor[5] && vetor[2] < vetor[6] && vetor[2] < vetor[7] && vetor[2] < vetor[8]

    && vetor[2] < vetor[9]) {



   menorValor = vetor[2];



  } else if (vetor[3] < vetor[1] && vetor[3] < vetor[2] && vetor[3] < vetor[0] && vetor[3] < vetor[4]

    && vetor[3] < vetor[5] && vetor[3] < vetor[6] && vetor[3] < vetor[7] && vetor[3] < vetor[8]

    && vetor[3] < vetor[9]) {



   menorValor = vetor[3];



  } else if (vetor[4] < vetor[1] && vetor[4] < vetor[2] && vetor[4] < vetor[3] && vetor[4] < vetor[0]

    && vetor[4] < vetor[5] && vetor[4] < vetor[6] && vetor[4] < vetor[7] && vetor[4] < vetor[8]

    && vetor[4] < vetor[9]) {



   menorValor = vetor[4];



  } else if (vetor[5] < vetor[1] && vetor[5] < vetor[2] && vetor[5] < vetor[3] && vetor[5] < vetor[4]

    && vetor[5] < vetor[0] && vetor[5] < vetor[6] && vetor[5] < vetor[7] && vetor[5] < vetor[8]

    && vetor[5] < vetor[9]) {



   menorValor = vetor[5];



  } else if (vetor[6] < vetor[1] && vetor[6] < vetor[2] && vetor[6] < vetor[3] && vetor[6] < vetor[4]

    && vetor[6] < vetor[5] && vetor[6] < vetor[0] && vetor[6] < vetor[7] && vetor[6] < vetor[8]

    && vetor[6] < vetor[9]) {



   menorValor = vetor[6];



  } else if (vetor[7] < vetor[1] && vetor[7] < vetor[2] && vetor[7] < vetor[3] && vetor[7] < vetor[4]

    && vetor[7] < vetor[5] && vetor[7] < vetor[6] && vetor[7] < vetor[0] && vetor[7] < vetor[8]

    && vetor[7] < vetor[9]) {



   menorValor = vetor[7];



  } else if (vetor[8] < vetor[1] && vetor[8] < vetor[2] && vetor[8] < vetor[3] && vetor[8] < vetor[4]

    && vetor[8] < vetor[5] && vetor[8] < vetor[6] && vetor[8] < vetor[7] && vetor[8] < vetor[0]

    && vetor[8] < vetor[9]) {



   menorValor = vetor[8];



  } else if (vetor[9] < vetor[1] && vetor[9] < vetor[2] && vetor[9] < vetor[3] && vetor[9] < vetor[4]

    && vetor[9] < vetor[5] && vetor[9] < vetor[6] && vetor[9] < vetor[7] && vetor[9] < vetor[8]

    && vetor[9] < vetor[0]) {



   menorValor = vetor[9];



  } else {



   menorValor = 0;



   System.out.println("Não há maior valor");



  }



  return menorValor;



 }

}
