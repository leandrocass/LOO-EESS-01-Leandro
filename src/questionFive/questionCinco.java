

package questionFive;

import java.util.Scanner;

public class questionCinco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        float time, Depem;
        double salario, disc = 0;
        nome = sc.nextLine();
        time = sc.nextFloat();
        Depem = sc.nextFloat();
        sc.close();
        salario = time * 3.00;
        salario += (Depem * 100);
        disc = (13.5 * salario) / 100;
        salario = salario - disc;
        System.out.println("Nome: " + nome);
        System.out.printf("Salário Líquido: %.2f", salario);
    }
}