import java.util.Scanner;

public class CalculadoraDeMedias {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String[] alunos = {"Camila", "Lucas", "Bruna", "Pedro"};

    double media = calculaMediaDaTurma(alunos, scan); //aqui chama outro metodo que é o calcula media da turma, onde passa o array de alunos e o fluxo do tecldo scan
    System.out.printf("Média da turma %.1f", media);
  }

  public static double calculaMediaDaTurma(String[] alunos, Scanner scanner){

    double soma = 0; //variavel temporaria soma 
    for(String aluno : alunos) {//estrutura for each
      System.out.printf("Nota do aluno %s", aluno);
      double nota = scanner.nextDouble();
      soma += nota;
    }
    return soma / alunos.length;
  }
}
