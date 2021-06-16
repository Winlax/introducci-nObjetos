package IntroduccionObjetos;

import java.util.Scanner;


public class Contador2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contador;
        
        System.out.println("Ingrese un contador:");
        contador = teclado.nextInt();
        
        Contador2 a = new Contador2(contador);
        a.setContador(contador);
       System.out.println("Numero de contador ingresado: "+ a.getContador());
       System.out.println("Contador decreciente: "+ a.decrementarContador(a.getContador()));
       System.out.println("Contador incrementado: "+ a.incrementarContador(a.getContador()));
       
    }
    
    private int contador;
    
    public Contador2() {
        
    }

    public Contador2(int contador) {
        this.contador = contador;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    
    public int incrementarContador(int numero) {
        numero += 1;
        return numero;
    }
    
    public int decrementarContador(int numero) {
        numero -= 1;
        return numero;
    }
}
