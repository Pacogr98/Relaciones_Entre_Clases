
package Ejercicio2;


public class Pruebas {

    public static void main(String[] args) {
        
        Señal fireSeñal = new Señal("Igni","fuego");
        System.out.println(fireSeñal.toString());
        
        Señal windSeñal = new Señal("Windy","viento");
        System.out.println(windSeñal.toString());
        
        
        Brujo brujoFuego = new Brujo("Koppa","Malaga",fireSeñal);
        Brujo brujoViento = new Brujo("Risky","Madrid",windSeñal);
        
        System.out.println(brujoFuego.toString());
        System.out.println(brujoViento.toString());
        
        System.out.println(brujoFuego.conjurarSeñal(brujoViento));
        System.out.println(brujoViento.conjurarSeñal(brujoFuego));
        
        System.out.println(brujoFuego.toString());
        System.out.println(brujoViento.toString());
    }

}
