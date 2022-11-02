/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author novel
 */
public class Tele extends Electros {

    private Integer resolcion; 
    private Boolean tdt; 
    
    Scanner leer = new Scanner(System.in); 
    public Tele() {
    }

    public Tele(Integer resolcion, Boolean tdt) {
        this.resolcion = resolcion;
        this.tdt = tdt;
    }

    public Tele(Integer resolcion, Boolean tdt, Double precio, Integer peso, String color, Character consumo) {
        super(precio, peso, color, consumo);
        this.resolcion = resolcion;
        this.tdt = tdt;
    }

    public Integer getResolcion() {
        return resolcion;
    }

    public void setResolcion(Integer resolcion) {
        this.resolcion = resolcion;
    }

    public Boolean getTdt() {
        return tdt;
    }

    public void setTdt(Boolean tdt) {
        this.tdt = tdt;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public Character getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }
    
    public void crearTele(){
        super.crearElectro();
        System.out.println("Ingrese la pulgadas del televisor");
        this.resolcion = leer.nextInt(); 
        System.out.println("El televisor tiene sintonizador (TDT)? True / False");
        this.tdt = leer.nextBoolean(); 
        
    }
//    Si el televisor tiene una resolución mayor de 40 pulgadas, se
//incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
//$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
//también deben afectar al precio.
     @Override
    public void  precioFinal(){
        super.precioFinal();
     
        if(this.getResolcion() > 40){
             this.precio = this.precio * 1.3; 
            System.out.println("Precio final es sin TDT : " + this.getPrecio());
        }if ( tdt == true ){
            this.precio += 500;
           System.out.println("Precio final con TDT incluido " + this.getPrecio()); 
           
                   
            
        }else{
           System.out.println("No se aumentara el precio; Precio Final es: " + this.getPrecio()); 
        }
      
        
        
    }

    @Override
    public String toString() {
        return "Tele{" + "resolcion=" + resolcion + ", tdt=" + tdt + ", leer=" + leer + '}';
    }

            
    
}


