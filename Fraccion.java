package IntroduccionObjetos;

import java.util.Scanner;

public class Fraccion {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese 1er. numero a operar:");
        double num1 = teclado.nextInt();

        System.out.println("Ingrese 2do. numero a operar:");
        double num2 = teclado.nextInt();

        Fraccion a = new Fraccion(num1, num2);

        System.out.println("La suma de los numeros es: " + a.Suma(a.getNumero1(), a.getNumero2()));
        System.out.println("La resta de los numeros es: " + a.Resta(a.getNumero1(), a.getNumero2()));
        System.out.println("La multiplicacion de los numeros es: " + a.Multiplicacion(a.getNumero1(), a.getNumero2()));
        System.out.println("La division de los numeros es: " + a.Division(a.getNumero1(), a.getNumero2()));

    }

    private double numero1;
    private double numero2;

    public Fraccion() {
    }

    public Fraccion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public double Suma(double numero1, double numero2) {
        double suma = numero1 + numero2;
        return suma;
    }

    public double Resta(double numero1, double numero2) {
        double resta = numero1 - numero2;
        return resta;
    }

    public double Multiplicacion(double numero1, double numero2) {
        double multiplicacion = numero1 * numero2;
        return multiplicacion;
    }

    public double Division(double numero1, double numero2) {
        double division = 0;
        if (numero2 != 0) {
            division = numero1 / numero2;
            return division;
        } else {
            System.out.println("No se puede dividir entre 0...");
            division = 0;
        }
        return division;
    }
}
