public class PlanoOperadora {
  public static void main(String[] args) {
      String plano = "M";

      switch (plano) {
        case "T":{
          System.out.println("5Gb Youtube");
        }

        case "M":{
          System.out.println("Whats e Instagram grátis");
        }

        case "B":{
          System.out.println("100 minutos de ligação");
        }
      }
  }
}
// Nesse cenário o switch case entra como uma forma de redução de código, enquanto no if else necessitaria de mais condições, nesse formato isso se enquadraria em um unico plano de celular, se o cliente escolher o mais barato ele possui somente 5GB se ele escolher o medio ele ganha whats e instagram. Colocando assim os switch sem o break ele vai executando as debaixo.