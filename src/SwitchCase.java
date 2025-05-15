
public class SwitchCase {
    public static void main(String[] args) {
        /**
         * Switch case é uma estrutura de controle de fluxo,
         * também considerada uma estrutura de decisão.
         * Ela permite tomar decisões com base no valor de uma expressão,
         * ou seja, compara o valor de uma variável com diferentes casos (valores)
         * e executa o bloco de código correspondente.
         */

        int posicao = 1;

        switch (posicao){
            case 1:
                System.out.println("Medalha de ouro");
                break;
            case 2:
                System.out.println( "Medalha de prata");
                break;
            case 3:
                System.out.println( "Medalha de bronze");
                break;
            default:
                System.out.println( "Sem medalha");
                break;

        }

        System.out.println("--------------------------------------");
        int diaDaSemana = 3;
        String nomeDoDia;

        switch (diaDaSemana) {
            case 1:
                nomeDoDia = "Domingo";
                break;
            case 2:
                nomeDoDia = "Segunda-feira";
                break;
            case 3:
                nomeDoDia = "Terça-feira";
                break;
            // Outros casos...
            default:
                nomeDoDia = "Dia inválido";
        }

        System.out.println("Hoje é " + nomeDoDia);
        System.out.println("--------------------------------------");

        int num1 , num2;
        double  res = 0;
        num1 = 10; num2 = 5;

        String operacao = "*";

        switch (operacao){
            case "+":
               res = num1 + num2;
                break;
            case "-":
                res = num1 - num2;
                break;
            case "*":
                res = num1 * num2;
                break;
            case "/":
                res = num1 / num2;
                break;
            default:
                System.out.println("operação inválida");
        }
        System.out.println("Operação: " + operacao);
        System.out.println("Resultado: " + res);
        System.out.println("--------------------------------------");

        int numero1 = 3;

        switch (numero1){
            case 1:
                System.out.println("Final de Semana");
                break;
            case 2:
                System.out.println("dia útil");
                break;
            case 3:
                System.out.println("dia útil");
                break;
            case 4:
                System.out.println("dia útil");
                break;
            case 5:
                System.out.println("dia útil");
                break;
            case 6:
                System.out.println("dia útil");
                break;
            case 7:
                System.out.println("Final de Semana");
                break;
            default:
                System.out.println("Inválido");
        }
    }

}