
package IntroduccionObjetos;


public class Contador {
    public static void main(String[] args) {
        
       Contador  a = new Contador();
       
       a.setNumeros(10);
       System.out.println("Numero de contador ingresado: "+ a.getNumeros());
       System.out.println("Contador decreciente: "+ a.decrementarContador(a.getNumeros()));
       System.out.println("Contador incrementado: "+ a.incrementarContador(a.getNumeros()));
       
    }
    
    private int numeros;

    public Contador() {
        
    }

    public int getNumeros() {
        return numeros;
    }

    public void setNumeros(int numeros) {
        this.numeros = numeros;
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
