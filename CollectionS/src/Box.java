//um tipo genérico é uma classe genérica ou uma interface que é parametrizada em relaçao a tipos
//Exemplo

/*public class Box{
      private Object object;//essa class tem um atributo chamado Object do tipo Object
//metodos acessores o set que recebe o Object pra alterar o Object da classe 
      public void set(Object object) {this.object = object; }//aqui no this, está sendo feito a alteração do objcte que ta recebendo de set e atribuindo ao object que ta recebendo do box
      public Object get() {return object; }//get para retornar o valor que ta na variavel Object
}*/

//Versão generica da classe Box
/*public class Box<T>{//o tipo que for passado no atributo ja sera inferido automaticamente no private abaixo
  //T representa type
      private T t;

      public void set(T t) {this.t = t; }
      public T get() {return t;}
}*/

//Os nomes de parametros de tipo mais usados são:
/*E - Elemento
 * k - chave
 * N - NUMERO
 *  T - TIPO
 * V -VALOR
 * S, U, V 2ª,3º,4ºTIPOS
 */

 //Object é a classe mais de todas as claasses em java
 // a interface list é uma coleçao ordenada  que permite a inclusao de elementos duplicados as classes de implementação mais comuns são arraylist e linkedlist