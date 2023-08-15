import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char opcao = 's';

        System.out.print("Bem Vindo ao Calculos in Calcs");
        while (opcao == 's' || opcao == 'S') {
            Calculadora objetoCal = new Calculadora();
            Cientifica calculadoraCientifica = new Cientifica();
            Scanner leitor = new Scanner(System.in);

            //Fazer um while;
            System.out.print("O que deseja fazer?");
            System.out.print("\n ADICAO, SUBTRAÇÃO, MULTIPLICAÇÃO, DIVISÃO?");
            System.out.print("\n PARA OPERAÇÕES ESPECIAIS, DIGITE RAIZ OU POTENCIA");
            objetoCal.setOperador(leitor.nextLine());
            calculadoraCientifica.setOperador(leitor.nextLine()); //usar o nome do objeto da classe para herdar e atribuir.

            if(Objects.equals(objetoCal.getOperador(), "adicao")  || (Objects.equals(objetoCal.getOperador(), "subtracao")
                    || (Objects.equals(objetoCal.getOperador(), "multplicacao" )  || (Objects.equals(objetoCal.getOperador(), "divisao"))))){

                System.out.print("Digite o primeiro numerador");
                objetoCal.setNumerador1(leitor.nextDouble());
                System.out.print("Digite o segundo numerador");
                objetoCal.setNumerador2(leitor.nextDouble());
                leitor.nextLine();
                System.out.print("O Resultado é:" + objetoCal.operacoes());
            }
              else {
                  if(Objects.equals(calculadoraCientifica.getOperador(), "raiz")) {//usar o nome do objeto da classe para herdar e atribuir.
                      System.out.print("Digite um número inteiro");
                      calculadoraCientifica.setNumerador1(leitor.nextDouble());//usar o nome do objeto da classe para herdar e atribuir.
                      leitor.nextLine();
                      System.out.print("O Resultado é:" + calculadoraCientifica.raiz());
                  }
            }  if (Objects.equals(calculadoraCientifica.getOperador(), "potencia")){//usar o nome do objeto da classe para herdar e atribuir.
                System.out.print("Digite um número inteiro e positivo");
                calculadoraCientifica.setNumerador1(leitor.nextDouble());
                System.out.print("ele é elevado à?");
                calculadoraCientifica.setPotenciaExpoente(leitor.nextInt());

                leitor.nextLine();

                System.out.print("base: " + calculadoraCientifica.getNumerador1() + "x" + "Expoente :" + calculadoraCientifica.getPotenciaExpoente() +
                        "Resultado:" + calculadoraCientifica.potencia());
            }
        break;
        }
    }
}