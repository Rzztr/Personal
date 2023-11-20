package com.mycompany.selectivas;
import java.util.Scanner;
public class Conversiones {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        
        double Centimetros = 0;
        double Pulgadas = 0;
        double Libras = 0;
        double Kilos = 0;
        int Eleccion = 0;
        
        System.out.println("Elje el tipo de conversiones que deseas realizar");
        System.out.println("1.- Centrimetros a pulgadas");
        System.out.println("2.- Pulgadas a centimetros");
        System.out.println("3.- Libras a Kilos");
        System.out.println("4.- Kilos a Libras");
       
        Eleccion = Entrada.nextInt(); 
        
        switch (Eleccion){
            case 1:
                System.out.println("Introduce los centimetros");
                Centimetros = Entrada.nextDouble();
                System.out.println((Centimetros/2.54) + "in");
                break;
            
            case 2:
                System.out.println("Introduce las Pulgadas");
                Pulgadas = Entrada.nextDouble();
                System.out.println((Pulgadas*2.54)+"cm");
                break;
            
            case 3:
                System.out.println("Introduce las libras");
                Libras = Entrada.nextDouble();
                System.out.println((Libras*2.204)+"Kg");
                break;
            
            case 4:
                System.out.println("Introduce los kilogramos");
                Kilos = Entrada.nextDouble();
                System.out.println((Kilos/Libras)+"Lb");
                break;
            
            default:
                System.out.println("Introduce una opcion valida...");
        }
        
        
        
    }
    
}
