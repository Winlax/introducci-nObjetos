import java.util.Scanner;

public class Rectangulo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese ancho del rectangulo:");
        int ancho = teclado.nextInt();
        System.out.println("Ingrese el largo del rectangulo:");
        int largo = teclado.nextInt();
        Rectangulo a = new Rectangulo(ancho, largo);

        if (ancho != largo) {
            System.out.println("El area del rectangulo es: "+ a.Area(a.getAncho(), a.getLargo())+"m^2");
            System.out.println("El perimetro del rectangulo es: "+ a.Perimetro(a.getAncho(), a.getLargo())+"m");
        } else {
            System.out.println("El ancho y el largo del rectangulo tienen que ser diferentes...");
        }
    }

    private int ancho;
    private int largo;

    public Rectangulo(int ancho, int largo) {
        this.ancho = ancho;
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int Area(int ancho, int largo) {
        int area = ancho * largo;
        return area;
    }

    public int Perimetro(int ancho, int largo) {
        int perimetro = 2 * ancho + 2 * largo;
        return perimetro;
    }

}