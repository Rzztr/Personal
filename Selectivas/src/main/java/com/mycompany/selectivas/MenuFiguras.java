package com.mycompany.selectivas;
import java.util.Scanner;
public class MenuFiguras {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        
        int Eleccion = 0;
        
        System.out.println("Elije una figura para determinar su area: ");
        System.out.println("1.- triangulo");
        System.out.println("2.- Rectangulo");
        System.out.println("3.- cuadrado");
        System.out.println("4.- Circulo");
        
        Eleccion = Entrada.nextInt();
        
        double Altura = 0;
        double Base = 0;
        double Lado = 0;
        double Radio = 0;
        double Pi = 3.1416;
        
        switch (Eleccion){
            case 1:
                System.out.println("Introduce la base: ");
                Base = Entrada.nextDouble();
                System.out.println("Introduce la altura: ");
                Altura = Entrada.nextDouble();
                System.out.println("El area de la figura es: "+(Base*Altura)/2);
                break;
            
            case 2:
                System.out.println("Introduce la base: ");
                Base = Entrada.nextDouble();
                System.out.println("Introduce la altura: ");
                Altura = Entrada.nextDouble();
                System.out.println("El area de la figura es: "+(Base*Altura));
                break;
                
            case 3:
                System.out.println("introduce un lado del cuadrado: ");
                Lado = Entrada.nextDouble();
                System.out.println("El area del cuadrado es: "+Lado*Lado);
                break;
            
            case 4:
                System.out.println("Introduce el radio del circulo: ");
                Radio = Entrada.nextDouble();
                System.out.println("El area del circulo es: "+Pi*(Radio*Radio));
                break;
                
            default:
                System.out.println("Introduce un numero valido... ");
                
            
        }
        
        
        
    }
    
}
