
package Ejercicio2;

import java.util.Random;

public class Brujo {
    private String nombre;
    private String lugarNacimiento;
    private int edad;
    private double magia;
    private Señal señal;

    public Brujo(String nombre, String lugarNacimiento, Señal señal) {
        this.nombre = nombre;
        this.lugarNacimiento = lugarNacimiento;
        this.edad = generarEdad(18, 55);
        this.magia = generarRandomMagia(90, 180);
        this.señal = señal;
    }

    //MÉTODOS PRIVADO
    private int generarEdad(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    private double generarRandomMagia(double min, double max) {
        Random rand = new Random();
        return rand.nextDouble() * (max - min) + min;
    }

    //MÉTODOS
    public String conjurarSeñal(Brujo otroBrujo) {
        StringBuilder mensaje = new StringBuilder(); //StringBuilder se utiliza para construir cadenas de caracteres de manera eficiente, especialmente cuando necesitas concatenar varias cadenas en un bucle o en múltiples operaciones
        if (magia >= señal.getEnergia()) {
            magia -= señal.getEnergia();
            mensaje.append(nombre).append(" ha lanzado la señal ").append(señal.getNombre()).append("...\n");
            mensaje.append("... ").append(otroBrujo.getNombre()).append(" ha recibido ").append(Math.round(señal.getDaño())).append(" puntos de daño.\n"); 
        } else {
            mensaje.append(nombre).append(" no puede lanzar su señal!!!");
        }
        return mensaje.toString();
    }
    
    public String toString() {
        return "Este brujo es " + nombre + " de " + lugarNacimiento + ". Tiene " + edad + " años y " + Math.round(magia) + " puntos de magia. Utiliza la señal:\n" + señal.toString();
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public double getMagia() {
        return magia;
    }
}

