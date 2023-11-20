package com.mycompany.selectivas;
import java.util.Scanner;
public class Figuras {
    public static void main(String[] args) {
        var Entrada = new Scanner(System.in);
        
        int Eleccion = 0;
        
        System.out.println("Elije que figura deseas calcular:");
        System.out.println("1.- Triangulo");
        System.out.println("2.- Rectangulo");
        System.out.println("3.- Cuadrado");
        System.out.println("4.- Circulo");
        
        Eleccion = Entrada.nextInt();
        
        double Altura = 0;
        double Base = 0;
        double Lado = 0;
        double Radio = 0;
        double Pi = 3.1416;
        
        
        switch (Eleccion){
            
            case 1:
                System.out.println("Ingresa la base: ");
                Base = Entrada.nextDouble();
                System.out.println("Ingresa la altura: ");
                Altura = Entrada.nextDouble();
                System.out.println("El area del triangulo es: "+ (Base*Altura)/2);
                break;
            
            case 2: 
                System.out.println("Ingresa la base del rectangulo:");
                Base = Entrada.nextDouble();
                System.out.println("Ingresa la altura del rectangulo:");
                Altura = Entrada.nextDouble();
                System.out.println("El area del rectangulo es de " + (Base*Altura));
                break;
                
            case 3: 
                System.out.println("ingresa el lado del cuadrado");
                Lado=Entrada.nextDouble();
                System.out.println("el area del cuadrado es:"+(Lado*Lado));
                break;
                
            case 4:
                System.out.println("Ingresa radio");
                Radio=Entrada.nextDouble();
                System.out.println("El area del circulo es:"+ Pi*(Radio*Radio)); 
                break;
                
                
                   
                
                
        }
        
        
    }
    
}
