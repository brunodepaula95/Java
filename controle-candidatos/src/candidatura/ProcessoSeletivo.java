package candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
  public static void main(String[] args) {
    String [] candidatos = {"Felipe", "Marcia", "Bruno"};
    for(String candidato: candidatos){
      entrandoEmContato(candidato);
    }
  }

  static void entrandoEmContato(String candidato){
    int tentativasRealizadas = 1;
    boolean continuarTentando = true;//recebe true pois ele tem que ter 3 tentativas
    boolean atendeu = false;
    //Nesse exemplo utiliza o Do while, para que ele execute pelo menos 1 vez o codigo para ver se continua tentando a ligação
    do {
      atendeu = atender();
      continuarTentando = !atendeu;
      if(continuarTentando)
          tentativasRealizadas++;

      else
          System.out.println("Contato realizado com sucesso");

    } while(continuarTentando && tentativasRealizadas < 3);

    if(atendeu)
      System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa");
    else
      System.out.println("Não conseguimos contato com " + candidato + ", numero maximo de tentativas " + tentativasRealizadas + " realizadas");  

  }
  //metodo auxiliar do entrandoEmContato para gerar as tentativas de contato
  static boolean atender(){
    return new Random().nextInt(3)==1;//Se o valor aleatorio gerado entre 1 e 3 for 1 ele diz que atendeu, se não, continua tentando
  }

  static void imprimirSelecionados(){
    String [] candidatos = {"Felipe", "Marcia", "Bruno"};

    System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

    for(int indice = 0; indice < candidatos.length; indice++){
      System.out.println("O candidato de nº " + (indice+1) + " é o " + candidatos[indice]);
    }
  }

  static void selecaoCandidatos(){
    String [] candidatos = {"Felipe", "Marcia","Bruno", "José", "Maria", "João"};

    int candidatosSelecionados = 0;
    int candidatosAtual = 0;
    double salarioBase = 2000.0;
    while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
        String candidato = candidatos[candidatosAtual];
        double salarioPretendido = valorPretendido();

        System.out.println("O candidato " + candidato + " Solicitou este valor de salario" + salarioPretendido);
        if (salarioBase >= salarioPretendido) {
            System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
            candidatosSelecionados++;
        }
        candidatosAtual++;
    }
  }

  static double valorPretendido(){
    return ThreadLocalRandom.current().nextDouble(1800, 2200);
  }

  static void analisarCandidato(double salarioPretendido){
    double salarioBase = 2000.0;
    if(salarioBase > salarioPretendido){
      System.out.println("Ligar para o candidato");
    } else if(salarioBase == salarioPretendido)
      System.out.println("Ligar para o candidato com contra proposta");

      else{
        System.out.println("Aguardando o resultado dos demais candidatos");
      }
    }
}
