/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p1_cristopher_sibrian;

import java.util.Scanner;

/**
 *
 * @author BLINTEC
 */
public class Lab3P1_Cristopher_Sibrian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lab = new Scanner(System.in);
        char resp;
        int menu, r, n, CR;
        do{
            System.out.println("Bienvenido al juego del lab3");
            System.out.println("Que juego desea jugar?");
            System.out.println("1. Reloj de arena");
            System.out.println("2. Calculadora");
            System.out.println("3. Sandwich");
            System.out.println("4. Salir");
            menu = lab.nextInt();
            switch(menu){
                case 1: 
                    System.out.println("Ingrese el tamaño que desea el reloj");
                    break;
                case 2: 
                    System.out.println("Ingrese el valor de r: ");
                    r = lab.nextInt();
                    System.out.println("Ingrese el valor de n: ");
                    n = lab.nextInt();
                    
                    CR = (r / ((n-r) * r) );
                    System.out.println(CR);
                    break;
            }
            System.out.println("Desea jugar otro juego? ");
            resp = lab.next().charAt(0);
        }while(resp == 's');
        
    }
        
   }
    

