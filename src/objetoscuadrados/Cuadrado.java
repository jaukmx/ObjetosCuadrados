/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetoscuadrados;

import java.util.Scanner;


public class Cuadrado {
    //atributos
    private float lado;
    
    
    
    //Metodos

     public Cuadrado(float lado) {
        this.lado = lado;
       
    }

   

    public float getArea() {
        return (float) Math.pow(this.lado, 2);
    }
    
    public float getPerimetro() {
        return (float) this.lado*4;
    }
    
}

