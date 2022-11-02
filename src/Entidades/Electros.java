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
public class Electros {

    Scanner leer = new Scanner(System.in);
    protected Double precio;
    protected Integer peso;
    protected String color;
    protected char consumo;

    public Electros() {
    }

    public Electros(Double precio, Integer peso, String color, Character consumo) {
        this.precio = precio;
        this.peso = peso;
        this.color = color;
        this.consumo = consumo;
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

    public Character getConsumo() {
        return consumo;
    }

    public void setConsumo(Character consumo) {
        this.consumo = consumo;
    }

    public void comprobarConsumoEner(char letra) {
    letra = Character.toUpperCase(letra); 
    
    if(letra < 65 || letra > 70){
        this.consumo = 'F'; 
       
        }else{
        this.consumo= Character.toUpperCase(letra); 
    }

    }

    public void ComprobarColor(String color) {
        switch (this.color) {
            case "negro":
                System.out.println("Nice color ");
                break;
            case "rojo":
                System.out.println("Nice color");
                break;
            case "azul":
                System.out.println("\"Nice color\"");
                break;
            case "gris":
                System.out.println("\"Nice color\"");
                break;
            case "blanco":
                System.out.println("\"Nice color\"");
                break;
            default:
                this.color.equals("\"Nice color/white\""); 
        }
        //      Metodo crearElectrodomestico(): le pide la información al usuario y llena el
        //electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
        //precio se le da un valor base de $1000. 
    }

    public void crearElectro() {
        System.out.println("Precio del electrodomestico: ");
       double p = leer.nextDouble();
        if (p < 1000) {
            System.out.println("Fallo en el precio");
        } else {
            this.precio = p;
        }

        System.out.println("Color:  ");
        this.color = leer.next();
        ComprobarColor(color);

        System.out.println("Consumo energetico: ");
        this.consumo = leer.next().charAt(0);
        
        comprobarConsumoEner(consumo);

        System.out.println("Peso del producto: ");
        this.peso = leer.nextInt();

    }

    public void precioFinal() {
       switch(this.consumo){
           case'A':
               this.precio +=1000; 
               break;
           case 'B': 
               this.precio +=800; 
               break;
           case 'C': 
               this.precio += 600; 
               break;
           case 'D': 
               this.precio += 500; 
               break;
           case 'E': 
               this.precio += 300; 
               break;
           case 'F': 
               this.precio +=100; 
           
//           case 'E': 
//               this.precio += 300; 
//               break;
//               case 'f': 
//               this.precio += 100; 
//               break;
       }
         
        
        
        if(this.peso> 1  && this.peso <=19 ){
            this.precio +=100; 
        }else if(this.peso > 20 && this.peso<=49){
            this.precio +=500; 
            
        }else if(this.peso>50 && this.peso<=79){
            this.precio+=800; 
        }else{
            this.precio +=1000; 
        }
            
       
    }

    @Override
    public String toString() {
        return "Electros{" + "leer=" + leer + ", precio=" + precio + ", peso=" + peso + ", color=" + color + ", consumo=" + consumo + '}';
    }
    
    
    
      

}
