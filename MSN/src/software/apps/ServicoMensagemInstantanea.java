package software.apps;

public abstract class ServicoMensagemInstantanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    //somente os filhos conhecem esse metodo

    protected void validarConectadoInternet(){
      System.out.println("validando");
    }
}
