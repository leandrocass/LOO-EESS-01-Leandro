package questionTwo;

import java.util.Scanner;
public class questionDois {
    public static void main(String[] args) {
    Scanner snr = new Scanner(System.in);
    String[] daditos, dadosDoteacher;
    daditos = new String[]{ "Nome", "Endereço", "Cidade", "UF:", "CEP", "CPF", "RG", "Telefone", "Data de nascimento", "grau de escolaridade", "cruso que leciona"};
    dadosDoteacher = new String[daditos.length];

        for (int i = 0; i < daditos.length; i++){
        System.out.print(daditos[i]);
        dadosDoteacher[i] = snr.next();
        }
        for (int i = 0; i < daditos.length; i++){
        System.out.println(daditos[i] + " " + dadosDoteacher[i]);
        }
    }
}