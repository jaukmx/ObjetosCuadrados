/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetoscuadrados;

import java.util.Scanner;

/**
 *
 * @author arturo
 */


public class Menu {
    public  static void main (String[] args){
        boolean V=true;
        Scanner teclado = new Scanner(System.in);
        String a, Traducido1, entrada;
        float l=0;
        int o;
     
        while(V){
           System.out.println("=====================================================================================\n                     Traductor Morse-Texto \n ¿Que desea hacer? , seleccione un opcion con el numero que aparece"
                    + " \n \n caculadora cuadrado y cubo \n Ingrese el numero para su preferencia"
                   + "\n 1.-Cuadrado \n 2.-Cubo");
            System.out.println("-->");
    
            a = teclado.nextLine();
            switch (a) {
                case "1":
                    System.out.println("Ingrese la medida del lado: ");
                  l  = teclado.nextInt();
                   // cuadra.getLado(l);
                  System.out.println("Que desea: \n 1.-area  \n 2.-perimetro \n 3.-Cancelar");
                  o  = teclado.nextInt();
                  Cuadrado cua = new Cuadrado(l);
                    if(o==1){
                        cua.getArea();
                    }else if (o==2){
                        cua.getPerimetro();
                    }
                  

                    do {
                        entrada = teclado.nextLine();
                        System.out.println(entrada);
                    } while (!entrada.equals(""));

                    break;
                case "2":
                    System.out.println("Ingrese la medida del lado: ");
                      l  = teclado.nextInt();
//                    

                    do {
                        entrada = teclado.nextLine();
                        System.out.println(entrada);
                    } while (!entrada.equals(""));
                    
                    break;
                case "3":
                    V = false;

            }
            System.out.println("   "); 
        }
        
    } 
    
}
