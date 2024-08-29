import java.util.Random;

public class ExemploDoWHile {
  public static void main(String[] args) {
    System.out.println("Discando...");
    
    do{//Do while garante que vai rodar pelo menos uma vez
      //executando repetidas vezes até alguem atender
        System.out.println("Telefone tocando");
    } while(tocando());
    System.out.println("Alô!!!");
  }

  private static boolean tocando(){
    boolean atendeu = new Random().nextInt(3)==1;
    System.out.println("Atendeu? " + atendeu);
    return ! atendeu; //negando o ato de continuar tocando, ou seja, negando a expressão booleana
  }
}
