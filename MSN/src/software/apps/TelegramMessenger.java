package software.apps;

public class TelegramMessenger extends ServicoMensagemInstantanea {
  
  public void enviarMensagem(){
    validarConectadoInternet();
    System.out.println("Enviando mensagem");
  }

  public void receberMensagem(){
    System.out.println("recebendo mensagem");
  }
}
