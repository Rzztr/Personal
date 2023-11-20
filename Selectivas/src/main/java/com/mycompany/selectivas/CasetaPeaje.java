package com.mycompany.selectivas;
import java.util.Scanner;
public class CasetaPeaje {
    public static void main(String[] args) {
        
        Scanner Entrada = new Scanner(System.in);
        
        short PeajeParticular = 80;
        int PeajeAutobus = 180;
        short PeajeMotocicleta = 50;
        int TranspotePesado = 150;
        
        int Eleccion = 0;
        
        System.out.println("Elije el tipo de vehiculo a cobrar... ");
        System.out.println("1.- Vehiculo particular");
        System.out.println("2.- Autobus");
        System.out.println("3.- Motocicleta");
        System.out.println("4.- Transporte pesado");
        Eleccion = Entrada.nextInt();
        
        switch (Eleccion){
            case 1:
                System.out.println("Se cobraran: $"+PeajeParticular);
                break;
            case 2:
                System.out.println("Se cobraran: $"+PeajeAutobus);
                break;
            case 3:
                System.out.println("Se cobraran: $"+PeajeMotocicleta);
                break;
            case 4:
                System.out.println("Se cobraran: $"+TranspotePesado);
                break;
            default:
                System.out.println("Introduce un valor valido..."); 
                break;
        }   
    }
    
}
