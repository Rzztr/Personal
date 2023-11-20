package com.mycompany.selectivas;
import java.util.Scanner;
public class Salario_Antiguedad {
    public static void main(String[] args) {
        Scanner Entrada =new Scanner(System.in);
        
        var SalarioEmpleado = 0f;
        int Antiguedad = 0;
        
        System.out.println("¿cual es el salario del empelado?: ");
        SalarioEmpleado = Entrada.nextFloat();
        
        System.out.println("Introduzca el nivel de antiguedad: ");
        Antiguedad = Entrada.nextInt();
        
         var Antiguedad1 = (SalarioEmpleado*0.05);
        var Antiguedad2 = (SalarioEmpleado*0.1);
        var Antiguedad3 = (SalarioEmpleado*0.15);
        var Antiguedad4 = (SalarioEmpleado*0.20);
        
        switch (Antiguedad){
            case 1:
                System.out.println("El aumento al salario es de... "+Antiguedad1);
                System.out.println("El total depositado sera de.. ."+(Antiguedad1+SalarioEmpleado));
                break;
            
            case 2:
                System.out.println("El aumento al salario es de... "+Antiguedad2);
                System.out.println("El total depositado sera de... "+(Antiguedad2+SalarioEmpleado));
                break;
                
            case 3:
                System.out.println("El aumento al salario es de... "+Antiguedad3);
                System.out.println("El total depositado sera de... "+(Antiguedad3+SalarioEmpleado));
                break;
             
            case 4:
                System.out.println("El aumento al salario es de... "+Antiguedad4);
                System.out.println("El total depositado sera de... "+(Antiguedad4+SalarioEmpleado));
                break;
                
            default:
                System.out.println("Introduce un valor valido... ");
                break;
        }
        
    }
    
}
