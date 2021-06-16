import java.util.Scanner;

public class Circulo {

    public static void main(String[] args) {

        Circulo a = new Circulo();
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el radio del circulo: ");
        int radio = teclado.nextInt();
        a.setRadio(radio);
        
        System.out.println("El area del circulo es "+a.calcularArea(a.getRadio()));
        System.out.println("El perimetro del circulo es "+a.calcularPerimetro(a.getRadio()));
    }

    private double radio;

    public Circulo() {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public double calcularArea(double radio) {
        double total = (double)Math.PI*radio*radio;
        return total;
    }
    
    public double calcularPerimetro(double radio) {
        double total = 2*Math.PI*radio;
        return  total;
    }

    
}
