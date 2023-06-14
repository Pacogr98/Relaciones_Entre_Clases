package Ejercicio1;

import java.util.Random;

public class Arco {

    private double longitud; //en cm
    private int peso; //en gramos
    private String material;
    private Flecha carcaj[];

    public Arco(int material, int capacidadCarcaj) {

        switch (material) {
            case 1:
                this.material = "madera";
                this.peso = 300;
                this.longitud = 900;
                break;
            case 2:
                this.material = "metal";
                this.peso = 530;
                this.longitud = 750;
                break;
            default:
                this.material = "fibra"; //si no se introduce ni 1 ni 2 por defecto se creará un arco de fibra
                this.peso = 100;
                this.longitud = 1100;
        }

        //NO LO DICE EL ENUNCIADO PERO LIMITAREMOS LA CAPACIDAD DEL CARCAJ ENTRE 10-20
        if (capacidadCarcaj < 10) {
            this.carcaj = new Flecha[10];
        } else if (capacidadCarcaj > 20) {
            this.carcaj = new Flecha[20];
        } else {
            this.carcaj = new Flecha[capacidadCarcaj];
        }

        //Rellenamos el carcaj como dice el enunciado - AQUÍ SI PONGO ENPRÁCTICA LO DICHO EN LA CLASE FLECHA
        recargar();
    }

    //me voy a crear un método propio para uso personal, cuando hagais esto debeis ponerlo en PRIVADO, ya que solo se va a usar dentro de la clase
    private int dameRandom(int min, int max) {
        Random random = new Random(); //Os pedirá importar la clase random
        return random.nextInt(max - min + 1) + min;
    }

    //METODOS DEL ENUNCIADO
    public String disparar() {
        String mensaje = "No quedan más flechas... Recarga!\n";

        for (int i = 0; i < this.carcaj.length; i++) {
            if (this.carcaj[i] != null) {
                mensaje = "Se ha disparado una " + this.carcaj[i].toString();
                this.carcaj[i] = null;
                i = this.carcaj.length;
            }
        }
        return mensaje;
    }

    public void recargar() {
        for (int i = 0; i < this.carcaj.length; i++) {
            this.carcaj[i] = new Flecha(dameRandom(40, 60), dameRandom(1, 3));
        }
    }

    public String toString() {
        int cantidadFlechas = 0;

        for (int i = 0; i < this.carcaj.length; i++) {
            if (this.carcaj[i] != null) {
                cantidadFlechas++;
            }
        }

        return "---ESTADÍSTICAS DEL ARCO---\nMaterial: " + this.material + "\nLongitud: " + this.longitud + " cm\nPeso: " + this.peso + " g\nCapacidad del carcaj para " + this.carcaj.length + " flechas" + "\nNº Flechas disponibles: " + cantidadFlechas+"\n";
    }
}
