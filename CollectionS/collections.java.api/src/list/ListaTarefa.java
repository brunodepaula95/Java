package list;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //atributo

    private List<Tarefa> tarefaList;

    public ListaTarefa() {
      this.tarefaList = new ArrayList<>();
    }//gera este construtor para já criar uma lista vazia com o arraylist


    public void adiconarTarefa(String descricao){
      tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){//cria uma lista para representar todas as tarefas que vao ser removidas
      List<Tarefa> tarefasParaRemover = new ArrayList<>();
      for(Tarefa t : tarefaList){
        //Vai passar por dentro de todo tarefaList
        if(t.getDescricao().equalsIgnoreCase(descricao)){
          tarefasParaRemover.add(t);//se a tarefa da descrição do get for igual a passada no remover tafera, pega o tarefas para remover e adiciona a tarefa
        }
      }

      tarefaList.removeAll(tarefasParaRemover);//remove tudo dentro de tarefaspararemover
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();//retorna o numero total de tarefas na lista
    }

    public void obterDescricoesTarefas(){
      System.out.println(tarefaList);
    }


    public static void main(String[] args) {
      ListaTarefa listaTarefa = new ListaTarefa();

      listaTarefa.adiconarTarefa("Tarefa1");
      
      listaTarefa.adiconarTarefa("Tarefa1");
      
      listaTarefa.adiconarTarefa("Tarefa2");

      System.out.println(listaTarefa.obterNumeroTotalTarefas());

      listaTarefa.removerTarefa("Tarefa1");
      System.out.println(listaTarefa.obterNumeroTotalTarefas());

      listaTarefa.obterDescricoesTarefas();
    }
}
