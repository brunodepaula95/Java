public class FormatadorExemplo {
  public static void main(String[] args) {
    try {
      String cepFormatado = formatarCep("2376506");
      System.out.println(cepFormatado);
    } catch (CepInvalidoException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
      System.out.println("Cep incorreto");
    }
  }

  static String formatarCep(String cep) throws CepInvalidoException{
      if(cep.length() != 8)
      throw new CepInvalidoException();

      return "23.765-064";
  }
}
