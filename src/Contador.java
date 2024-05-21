import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        try{
            System.out.println("Digite o primeiro parâmetro:");
            int parametroUm = terminal.nextInt();

            System.out.println("Digite o segundo parâmetro:");
            int parametroDois = terminal.nextInt();
            contar(parametroUm, parametroDois);
        }catch (InputMismatchException e) {
            System.out.println("Os parâmetros devem ser números inteiros.");
        }
        catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        }
    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
        else {
            int contagem = parametroDois - parametroUm;
            System.out.println("----");
            for (int i = 0; i <= contagem; i++) {
                System.out.println(parametroUm);
                parametroUm++;
            }
        }
    }
}