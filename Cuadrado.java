import java.util.Scanner;

public class Cuadrado {
    public static void main(String[] args) {
        Cuadrado a = new Cuadrado();
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el lado de su cuadrado: ");
        int lado = teclado.nextInt();
        
        a.setLado(lado);
        
        System.out.println("El area del cuadrado es: "+ a.calcularArea(a.getLado()));
        System.out.println("El perimetro del cuadrado es "+ a.calcularPerimetro(a.getLado()));
    }

    private int lado;

    public Cuadrado() {
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    
    public int calcularArea (int lado) {
        int total = lado * lado;
        return total;
    }
    
    public int calcularPerimetro (int lado) {
        int total = 4*lado;
        return total;
    }
    
    
}