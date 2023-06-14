
package Ejercicio1;


public class Pruebas {

    public static void main(String[] args) {
        
        /*Flecha flecha0 = new Flecha();
        Flecha flecha1 = new Flecha(22,1);
        System.out.println(flecha0.toString());
        System.out.println(flecha1.toString());*/
        
        Arco arco = new Arco(1,10);
        System.out.println(arco.toString());
        System.out.println(arco.disparar());
        System.out.println(arco.disparar());
        System.out.println(arco.disparar());
        System.out.println(arco.disparar());
        System.out.println(arco.disparar());
        System.out.println(arco.disparar());
        System.out.println(arco.disparar());
        System.out.println(arco.disparar());
        System.out.println(arco.disparar());
        System.out.println(arco.disparar());
        System.out.println(arco.disparar());
        System.out.println(arco.toString());
        arco.recargar();
        System.out.println(arco.toString());
        System.out.println(arco.disparar());
        
        
    }

}
