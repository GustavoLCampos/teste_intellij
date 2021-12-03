package Calculadora;

import java.util.Scanner;

public class Calculdora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b;

        System.out.println("digite o valor de a: ");
        a = sc.nextInt();
        System.out.println("digite o valor de b: ");
        b = sc.nextInt();

        int somar = somar(a, b);
        int subtracao = subtracao(a, b);
        int mutiplicar = mutiplicar(a, b);
        int divisao = divisao(a, b);

        System.out.println("somar: " + somar);
        System.out.println("sub: " + subtracao);
        System.out.println("mult:" + mutiplicar);
        System.out.println("div" + divisao);
    }

    public static int somar (int a, int b){
        return a+b;
    }

public static int subtracao (int a, int b){
        return a-b;
    }
    public static int mutiplicar (int a, int b){
        return a*b;
    }

    public static int divisao (int a, int b){
        return a/b;
    }
}
