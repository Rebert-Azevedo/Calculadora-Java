import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num1, num2, operador;
        double resultado;

        System.out.println("**Calculadora Simples**");
        System.out.println("-------------------");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.println("-------------------");
        System.out.print("Escolha a operação (1-4): ");
        operador = entrada.nextInt();

        System.out.print("Digite o primeiro número: ");
        num1 = entrada.nextInt();
        System.out.print("Digite o segundo número: ");
        num2 = entrada.nextInt();

        switch (operador) {
            case 1:
                resultado = num1 + num2;
                System.out.println("Soma: " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("Subtração: " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("Multiplicação: " + resultado);
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Divisão por zero!");
                } else {
                    resultado = num1 / num2;
                    System.out.println("Divisão: " + resultado);
                }
                break;
            default:
                System.out.println("Operação inválida!");
        }

        System.out.println("-------------------");
        System.out.println("Obrigado por usar a calculadora!");
    }
}
