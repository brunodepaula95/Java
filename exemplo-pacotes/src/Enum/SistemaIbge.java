package Enum;

public class SistemaIbge {
    public static void main(String[] args) {
      for(EstadoBrasileiro e: EstadoBrasileiro.values()){//o E é o nome da variavel e o : é como se fosse o simbolo de =, values é o metodo que retorna o array de elementos
        System.out.println(e.getSigla() + " - " + e.getNome());
      }
    }
}
