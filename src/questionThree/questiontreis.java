package questionThree;

import java.util.Scanner;

public class questiontreis {
    public static void main(String[] args) {
        float dolar, seuDolar, dolarTransgenico;
        Scanner snr = new Scanner(System.in);
        dolar = snr.nextFloat();
        seuDolar = snr.nextFloat();
        dolarTransgenico = dolar * seuDolar;
        System.out.println(dolarTransgenico);
    }
}