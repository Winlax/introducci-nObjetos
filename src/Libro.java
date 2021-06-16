package src;

import java.util.Scanner;

public class Libro {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Libro a = new Libro();
        String nombre = "Divina Comedia";

        a.setNombreLibro(nombre);
        
        a.Prestamo(nombre);
        a.Devolucion(nombre);
        a.infoLibro(nombre);

    }

    private String nombreLibro;

    public Libro() {
    }

    public Libro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public void Prestamo(String nombre) {
        System.out.println("Usted a prestado el libro " + nombre);
    }

    public void Devolucion(String nombre) {
        System.out.println("Usted a devuelto el libro " + nombre);
    }

    public void infoLibro(String nombre) {
        System.out.println(nombre + ": trata sobre una persona llamada Dante que busca...");
    }
}
