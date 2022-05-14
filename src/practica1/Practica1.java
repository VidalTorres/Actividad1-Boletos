
package practica1;

import java.util.Scanner;


public class Practica1 {
    
    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);
        
        //objeto de la clase boletos
        Boleto boleto = new Boleto();
        
        //obtencion de datos
        boleto.obtenerDatos();
        System.out.print("Edad: ");
        int edad = captura.nextInt(); captura.nextLine();
        
        //funciones
        boleto.obtenerSubtotal();
        boleto.obtenerImpuesto();
        boleto.obtenerDescuento(edad);
        boleto.obtenerTotal();
        
        boleto.imprimir();
    }
    
}
