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

    public static void main(String[] args) {
        boolean V = true, v = true;
        Scanner teclado = new Scanner(System.in);
        String a, Traducido1, entrada;
        float l = 0;
        int o;

        while (V) {
            System.out.println("=====================================================================================\n                     Traductor Morse-Texto \n ¿Que desea hacer? , seleccione un opcion con el numero que aparece"
                    + " \n \n caculadora cuadrado y cubo \n Ingrese el numero para su preferencia"
                    + "\n 1.-Cuadrado \n 2.-Cubo");
            System.out.println("-->");

            a = teclado.nextLine();
            v = true;
            switch (a) {
                case "1":
                     System.out.println("Ingrese la medida del lado: ");
                        l = teclado.nextFloat();
                    while (v) {
                       
                        // cuadra.getLado(l);
                        System.out.println("Que desea: \n 1.-area  \n 2.-perimetro \n 3.-Cancelar");
                        o = teclado.nextInt();
                        Cuadrado cua = new Cuadrado(l);

                        if (o == 1) {
                            System.out.println("\n El area es: "+cua.getArea()+"\n");
                        } else if (o == 2) {
                             System.out.println("\n El perimetro es: "+cua.getPerimetro()+"\n");
                        }else if (o==3){
                            v=false;
                        }

                        do {
                            entrada = teclado.nextLine();
                            System.out.println(entrada);
                        } while (!entrada.equals(""));
                    }
                    break;
                case "2":
                   while (v) {
                        System.out.println("Ingrese la medida del lado: ");
                        l = teclado.nextFloat();
                        // cuadra.getLado(l);
                        System.out.println("Que desea: \n 1.-area  \n 2.-perimetro \n 3.-Cancelar");
                        o = teclado.nextInt();
                        Cubo cubito = new Cubo(l  );
                        

                        if (o == 1) {
                            System.out.println("\n El volumen es: "+cubito.getVolumen()+"\n");
                        } else if (o == 2) {
                             System.out.println("\n El perimetro es: "+cubito.getPerimetro()+"\n");
                        }else if (o==3){
                            v=false;
                        }

                        do {
                            entrada = teclado.nextLine();
                            System.out.println(entrada);
                        } while (!entrada.equals(""));
                    }

                    break;
                case "3":
                    V = false;

            }
            System.out.println("   ");
        }

    }

}
