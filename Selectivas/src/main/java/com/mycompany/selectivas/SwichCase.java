package com.mycompany.selectivas;
import java.util.Scanner;
public class SwichCase {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        
        int Mes= 0;
       
        System.out.println("Ingrese un mes del año: ");
        Mes = Entrada.nextInt();
        
        switch (Mes){
            case 1, 2, 12: System.out.println("Es invierno");
            break;
            
            case 3,4,5: System.out.println("Es primavera");
            break;
            
            case 6,7,8: System.out.println("Es verano");
            break;
            
            case 9,10,11: System.out.println("Es otoño");
            break;
            
            default: System.out.println("Ingresa un numero valido...");
            break;
        }
        
        
    }
    
}
