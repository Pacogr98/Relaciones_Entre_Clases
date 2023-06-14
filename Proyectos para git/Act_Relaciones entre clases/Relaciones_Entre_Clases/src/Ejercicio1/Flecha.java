
package Ejercicio1;

public class Flecha {
    
    private int centimetros;
    private String material;
    
    //Constructor por defecto
    public Flecha(){
        this.centimetros = 56;
        this.material = "piedra";
    }
    
    //Sobrecarga
    public Flecha(int centimetros, int material){
        //No lo pide el enunciado pero vamos a limitar los centímetros entre 30-60
        if(centimetros < 30){
            this.centimetros = 30;
        }else if(centimetros > 60){
            this.centimetros = 60;
        }else{
            this.centimetros = centimetros;
        }

        switch(material){
            case 1:
                this.material = "hierro";
                break;
            case 2:
                this.material = "piedra";
                break;
            default:
                this.material = "hueso"; //si no se introduce ni 1 ni 2 por defecto la crearemos de hueso
        }
        
        //¡¡¡TRUQUITO COMO VEIS CAMBIAR PUNTA USA EL MISMO SWITCH Y SI... LLAMAMOS AL MÉTODO ???? LO DEJO COMENTADO POR SI AÚN NO LO VEIS DE ESTA FORMA, COMO VEIS AHORRAMOS CÓDIGO REDUNDANTE.
        /*cambiarPunta(material);*/
    }
    
    //MÉTODOS
    public void cambiarPunta(int material){
        switch(material){
            case 1:
                this.material = "hierro";
                break;
            case 2:
                this.material = "piedra";
                break;
            default:
                this.material = "hueso"; //si no se introduce ni 1 ni 2 por defecto la crearemos de hueso
        }
    }
    
    public String toString(){
        return "Flecha de "+this.centimetros+" ctms con punta de "+this.material+"\n";
    }
}
