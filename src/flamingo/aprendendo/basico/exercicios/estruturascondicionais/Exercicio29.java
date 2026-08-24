package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio29 {
        public static void main(String[] args) {
            double imc = 22.5;

            if (imc < 18.5) {
                System.out.println("29: Abaixo do peso");
            } else if (imc <= 24.9) {
                System.out.println("29: Peso normal");
            } else if (imc <= 29.9) {
                System.out.println("29: Sobrepeso");
            } else {
                System.out.println("29: Obesidade");
            }
        }
    }

