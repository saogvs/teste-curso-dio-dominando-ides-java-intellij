package br.com.will.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b;

        System.out.println("digite o primeiro valor: ");
        a = scan.nextInt();
        System.out.println("digite o primeiro valor: ");
        b = scan.nextInt();

        int somar = somar(a, b);
        int subtrair= subtrai(a, b);
        int multiplicar = multiplicar(a, b);
        int dividir = dividir(a, b);

        System.out.println("somar: " + somar);
        System.out.println("sub: " + subtrair);
        System.out.println("mult: " + multiplicar);
        System.out.println("div: " + dividir);
    }

    public static int somar(int a, int b) {
        return a + b;
    }
    public static int subtrai(int a, int b) {
        return a - b;
    }
    public static int multiplicar(int a, int b) {
        return a * b;
    }
    public static int dividir(int a, int b) {
        return a / b;
    }

}
