/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1;

import java.util.Scanner;

public class boletos {
    //variables
    private int numeroBoleto;
    private String nombreCliente;
    private String destino;
    private int tipoBoleto;
    private String fecha;
    private float precio;
    private double impuesto;
    private double descuento;
    private double subtotal;
    private double total;
    
    //Constructires
    public boletos(){
        this.numeroBoleto = 0;
        this.nombreCliente = "";
        this.destino = "";
        this.tipoBoleto = 0;
        this.fecha = "";
        this.precio = 0.0f;
    }
    
    public boletos(int numeroBoleto, String nombreCliente, String destino, int tipoBoleto, String fecha, float precio){
        this.numeroBoleto = numeroBoleto;
        this.nombreCliente = nombreCliente;
        this.destino = destino;
        this.tipoBoleto = tipoBoleto;
        this.fecha = fecha;
        this.precio = precio;
    }
    
    public boletos(boletos boleto){
        this.numeroBoleto = boleto.numeroBoleto;
        this.nombreCliente = boleto.nombreCliente;
        this.destino = boleto.destino;
        this.tipoBoleto = boleto.tipoBoleto;
        this.fecha = boleto.fecha;
        this.precio = boleto.precio;
    }
    
    

    //Encapsulamiento
    public int getNumeroBoleto() {
        return numeroBoleto;
    }

    /**
     * @param numeroBoleto the numeroBoleto to set
     */
    public void setNumeroBoleto(int numeroBoleto) {
        this.numeroBoleto = numeroBoleto;
    }

    /**
     * @return the nombreCliente
     */
    public String getNombreCliente() {
        return nombreCliente;
    }

    /**
     * @param nombreCliente the nombreCliente to set
     */
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    /**
     * @return the destino
     */
    public String getDestino() {
        return destino;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }

    /**
     * @return the tipoViaje
     */
    public int getTipoBoleto() {
        return tipoBoleto;
    }

    /**
     * @param tipoViaje the tipoViaje to set
     */
    public void setTipoBoleto(int tipoBoleto) {
        this.tipoBoleto = tipoBoleto;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the precio
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    //Funciones
    public void obtenerDatos(){
        Scanner captura = new Scanner(System.in);
        
        System.out.print("Numero de Boleto: ");
        numeroBoleto = captura.nextInt(); captura.nextLine();
        
        System.out.print("Nombre del cliente: ");
        nombreCliente = captura.nextLine();
        
        System.out.print("Destino: ");
        destino = captura.nextLine();
        
        System.out.print("Tipo de Boleto: 1.Sencillo 2. Doble ");
        tipoBoleto = captura.nextInt(); captura.nextLine();
        
        System.out.print("Fecha: ");
        fecha = captura.nextLine();
        
        System.out.print("Precio: ");
        precio = captura.nextFloat(); captura.nextLine();
    }
    
    public void obtenerSubtotal(){
        if(this.tipoBoleto==1) subtotal = this.precio;
        if(this.tipoBoleto==2) subtotal = this.precio*1.8f;
    }
    
    public void obtenerDescuento(int edad){
        if (edad > 60){
            descuento = subtotal/2; //Entre 2 porque es el 50% de descuento
        }
    }
    
    public void obtenerImpuesto(){
        impuesto = subtotal * .16; //Obtener especificamente el monto de impuesto
        subtotal = subtotal + impuesto; //agreagarle el impuesto al subotal 
    }
    
    public void obtenerTotal(){
        total = subtotal - descuento;
    }
    
    public void imprimir(){
        System.out.println("------------------RECIBO-----------------------------------");
        System.out.println("Numero de Boleto: " +numeroBoleto);
        System.out.println("Nombre del cliente: "+nombreCliente);  
        System.out.println("Destino: "+destino);
        if(this.tipoBoleto==1) System.out.println("Tipo Boleto: Sencillo");
        if(this.tipoBoleto==2) System.out.println("Tipo Boleto: Doble");   
        System.out.println("Fecha: " +fecha);        
        System.out.println("Precio: "+precio);
        System.out.println("Subtotal: "+(subtotal-impuesto));
        System.out.println("Impuesto: "+impuesto);
        System.out.println("Descuento: "+descuento);
        System.out.println("TOTAL: "+total);
    }
    
    
    
}
