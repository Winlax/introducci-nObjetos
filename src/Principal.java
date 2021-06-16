package src;

public class Principal {

    public static void main(String[] args) {
        Principal a = new Principal();
    }

    public Principal() {
        Cuadrado cuadrado = new Cuadrado();
        Cuadrado c = cuadrado;
        System.out.println("El area del cuadrado de lado 4 es: " + cuadrado.calcularArea(4));
        c.setLado(5);
        System.out.println("El perimetro del cuadrado de lado 6 es: " + cuadrado.calcularPerimetro(c.getLado()) + "\n");

        Contador contador = new Contador();
        Contador co = contador;
        co.setNumeros(8);
        System.out.println("Numero de contador ingresado: " + contador.getNumeros());
        System.out.println("Contador decreciente: " + contador.decrementarContador(co.getNumeros()));
        System.out.println("Contador incrementado: " + contador.incrementarContador(co.getNumeros()) + "\n");

        Circulo circulo = new Circulo();
        Circulo ci = circulo;
        ci.setRadio(3);
        System.out.println("El area del circulo es " + circulo.calcularArea(circulo.getRadio()));
        System.out.println("El perimetro del circulo es " + circulo.calcularPerimetro(circulo.getRadio()) + "\n");

        Rectangulo rectangulo = new Rectangulo(5, 14);
        Rectangulo re = rectangulo;
        re.setAncho(16);
        re.setLargo(5);
        System.out.println("El area del rectangulo es: " + rectangulo.Area(rectangulo.getAncho(), rectangulo.getLargo()) + "m^2");
        System.out.println("El perimetro del rectangulo es: " + re.Perimetro(re.getAncho(), re.getLargo()) + "m\n");

        Contador2 contador2 = new Contador2(25);
        Contador2 co2 = contador2;
        co2.setContador(30);
        System.out.println("Numero de contador ingresado: " + co2.getContador());
        System.out.println("Contador decreciente: " + co2.decrementarContador(contador2.getContador()));
        System.out.println("Contador incrementado: " + co2.incrementarContador(contador2.getContador()) + "\n");

        Libro libro = new Libro("Dante");
        Libro li = libro;
        li.setNombreLibro("Divina Comedia");
        libro.Prestamo(li.getNombreLibro());
        libro.Devolucion(li.getNombreLibro());
        libro.infoLibro(li.getNombreLibro());

        Fraccion fraccion = new Fraccion(120, 13);
        Fraccion fra = fraccion;
        fra.setNumero1(73);
        fra.setNumero2(6);

        System.out.println("\nLa suma de los numeros es: " + fraccion.Suma(fraccion.getNumero1(), fraccion.getNumero2()));
        System.out.println("La resta de los numeros es: " + fraccion.Resta(fraccion.getNumero1(), fraccion.getNumero2()));
        System.out.println("La multiplicacion de los numeros es: " + fraccion.Multiplicacion(fraccion.getNumero1(), fraccion.getNumero2()));
        System.out.println("La division de los numeros es: " + fraccion.Division(fraccion.getNumero1(), fraccion.getNumero2())+ "\n");

    }

}
