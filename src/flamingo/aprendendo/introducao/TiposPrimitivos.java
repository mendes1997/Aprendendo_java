package flamingo.aprendendo.introducao;

public class TiposPrimitivos {

    public static void main(String[] args) {
        // byte -128 a 127
        //short : -32.768 a 32.767
        //int : -2 bilhoes a 2 bilhoes
        //long : para numeros inteiros muito grande (usa um L no final do numero)
        //float : precisao simples
        byte idade = 28;
        int municipio = 114000000;
        long contabancaria = 999999999999999999L;
        float salario = 15000.66f;
        double salarioExtra = 25000.50;
        char PrimeiraLetraDoNome = 'R';
        boolean VaiEstudarNasferias = false;
        System.out.println(VaiEstudarNasferias);
        System.out.println("primeira letra do meu nome é" + PrimeiraLetraDoNome);
        System.out.println("PL caiu = " + salarioExtra);
        System.out.println("Meu salario depois de estudar com bigas é " + salario)
    System.out.println("Minha idade é " +idade);
    System.out.println("São Paulo (SP): Mais de " + municipio + "milhões de moradores");
    System.out.println("Minha conta bancaria daqui a 5 anos " + contabancaria);
    }
}
