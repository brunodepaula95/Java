package software;

import software.apps.FacebookMessenger;
import software.apps.MSNMessenger;
import software.apps.ServicoMensagemInstantanea;
import software.apps.TelegramMessenger;

public class ComputadorPedrinho {
    public static void main(String[] args) {
      ServicoMensagemInstantanea smi = null;

      //Nao sabe qual app mas deve enviar e receber msg

      String appEscolhido = "tlg";

      if(appEscolhido.equals("msn"))
        smi = new MSNMessenger();

      else if(appEscolhido.equals("fbm"))
        smi = new FacebookMessenger();

      else if(appEscolhido.equals("tlg"))
        smi = new TelegramMessenger();

      
      smi.enviarMensagem();
      smi.receberMensagem();
      
    }
}
