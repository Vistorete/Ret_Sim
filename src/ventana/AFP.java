/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

/**
 *
 * @author esteban
 */
public class AFP {
    private String nombre;
    private double renta;

    public AFP(String nombre,double renta){
        this.nombre=nombre;
        this.renta=renta;
    }
    public double getRenta(){
        return this.renta;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String Info(){
        return ("nombre: "+ this.nombre+" rent: "+this.renta);
    }

}
