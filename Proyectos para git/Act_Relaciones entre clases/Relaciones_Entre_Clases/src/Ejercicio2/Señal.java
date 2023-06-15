package Ejercicio2;

package Ejercicio2;

import java.util.Random;

public class Señal {
    
    private String nombre, tipo;
    private double nivel, energia;
    private double daño;
    
    public Señal(String nombre, String tipo){
        
        this.nombre = nombre;
        this.nivel = 1;
        this.energia = (new Random().nextInt(11) + 5) * (this.nivel / 5);
        
        switch(tipo.toLowerCase()) {
            case "quinética":
                this.tipo = tipo.toLowerCase();
                this.daño = 0;
                break;
            case "fuego":
                this.tipo = tipo.toLowerCase();
                this.daño = (new Random().nextInt(51) + 50) * (nivel / 10);
                break;
            case "viento":
                this.tipo = tipo.toLowerCase();
                this.daño = (new Random().nextInt(26) + 25) * (nivel / 10);
                break;
            default:
                this.tipo = "hipnótica"; // Por defecto dejaremos hipnótica
                this.daño = 0;
                break;
        }
           
    }
    
    //MÉTODO PRIVADO
    private int dameRandom(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
    
    //MÉTODO
    public String toString() {
        return "Señal: " + this.nombre + "\nTipo: " + this.tipo + "\nNivel: " + Math.round(this.nivel) + "\nDaño: " + Math.round(this.daño) + " puntos\nConsume " + Math.round(this.energia) + " puntos\n";
    }

    public double getDaño() {
        return daño;
    }

    public String getNombre() {
        return nombre;
    }

    public double getEnergia() {
        return energia;
    }
    
}