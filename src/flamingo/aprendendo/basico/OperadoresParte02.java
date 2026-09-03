package flamingo.aprendendo.basico;

public class OperadoresParte02 {
    /*
    * <Menor que
    * > maior que
    * <= menor ou igual
    * >= maior ou igual
    *  == igual a
    * != diferente de
     * */
    public static  void main(String[] args) {
        byte idadeMae = 40;
        byte idadePai = 60;
        byte idadeIrmaDaMae = 41;
        System.out.println(idadeMae < idadePai);
        System.out.println(idadeMae > idadePai);
        System.out.println(idadeMae ==idadeIrmaDaMae);
        System.out.println(idadeMae <= idadeIrmaDaMae);
        System.out.println(idadeMae>= idadeIrmaDaMae);
        System.out.println(idadeMae!= idadeIrmaDaMae);
    }
}
