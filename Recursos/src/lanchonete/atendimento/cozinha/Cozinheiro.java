package lanchonete.atendimento.cozinha;

import lanchonete.atendimento.Atendente;

public class Cozinheiro {
    public void adicionarLancheNoBalcao(){
        System.out.println("Adicionando lanche no balcão");
    }

    public void adiconarSucoNoBalcao(){
        System.out.println("Adicionando suco no balcão");
    }

    public void adicionarComboNoBalcao(){
      adicionarLancheNoBalcao();
      adiconarSucoNoBalcao();
    }

    private void prepararLanche(){
      System.out.println("Preparando o lanche");
    }

    public void prepararVitamina(){
      System.out.println("Preparando Suco");
    }

    public void prepararCombo(){
      prepararLanche();
      prepararVitamina();
    }

    public void selecionarIngredientesLanche(){
      System.out.println("Selecionado o pao, salada e hamburguer");
    }

    private void selecionarIngredientesVitmanina(){
      System.out.println("Selecionado fruta e leite");
    }

    private void lavarIngredientes(){
      System.out.println("Lavando ingredientes");
    }

    private void baterVitaminaLiquidificador(){
      System.out.println("batendo vitamina");
    }

    public void fritarIngredientesLanche(){
      System.out.println("fritando a carne");
    }

    public void pedirParaTrocarGas(Almoxarife meuAmigo ){
      meuAmigo.trocarGas();
    }

    public void pedirIngredientes (Almoxarife almoxarife ){
      almoxarife.entregarIngredientes();
    }
}
