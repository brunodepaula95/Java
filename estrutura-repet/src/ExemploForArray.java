public class ExemploForArray {
  public static void main(String[] args) {
    String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

    for(String aluno : alunos){
      System.out.println("Nome do aluno é: " + aluno);//for each é uma melhor forma de trabalhar com for e arrays, dessa forma acima, cada vez que ele rodar em alunos, ele adiciona mais um na variavel aluno;
    }
  }
}
