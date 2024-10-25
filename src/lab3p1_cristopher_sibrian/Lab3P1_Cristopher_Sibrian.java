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
        int menu, r, n, game = 1, reloj;
        System.out.println("Bienvenido al juego del lab3");
        do{
            System.out.println("Que juego desea jugar?");
            System.out.println("1. Reloj de arena");
            System.out.println("2. Calculadora");
            System.out.println("3. Sandwich");
            menu = lab.nextInt();
            switch(menu){
                case 1: 
                    System.out.println("Ingrese el tamaño que desea el reloj: ");
                    reloj = lab.nextInt();
                    if (reloj >= 7 && reloj%2!=0){
                        for (int up = 0; up< reloj; up++){
                            for (int ab = 0; ab<reloj; ab++){
                                System.out.print(" ");
                            }
                            for(int ab= 0; ab<(up*2); ab++){
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                    }else {
                        System.out.println("El tamano debe ser impar o mayor a 7");
                    }
                    
                    break;
                case 2: 
                    System.out.println("Ingrese el valor de n: ");
                    n = lab.nextInt();
                    System.out.println("Ingrese el valor de r: ");
                    r = lab.nextInt();
                    if (r<= n){
                        long nfac = 1;    
                        for (int o = 1; o<= n; o++){
                            nfac *= o;}

                        long nrfac = 1;
                        for (int o = 1; o<= (n-r); o++){
                            nrfac *= o;}

                        long rfac = 1;
                        for (int o = 1; o<= r; o++){
                            rfac *= o;}

                        long CR = (int) nfac/(nrfac * rfac);
                        System.out.println("El total de combinaciones es " + CR);
                    }else{
                        System.out.println("Los numeros de R no puesen ser mayores a los de N.");
                    }
                    break;
                case 3:
                    do{
                        System.out.println("Ingrese el tamano del sandwich: ");
                        game = lab.nextInt();
                        if (game >= 7 && game%2!=0){
                            for (int y = 1; y<= game; y++){
                                for (int w = 1; w<= game; w++ ){
                                    if (y== w){
                                        System.out.print(" ");
                                        continue;
                                    }
                                    System.out.print("* ");
                                }
                                System.out.println("");

                            }
                        }else {
                            System.out.println("El numero debe ser mayor a 7 y tambien debe ser impar");
                        }
                    }while (game < 7 || game%2==0);
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
            }
            System.out.println("Desea jugar otro juego? ");
            resp = lab.next().charAt(0);
        }while(resp == 's' ||  resp == 'S');
        System.out.println("Gracias por jugar");
        
    }
        
   }
    

