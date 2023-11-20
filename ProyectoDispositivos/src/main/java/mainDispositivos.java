import java.util.Scanner;

public class mainDispositivos {
    public static void main(String[] args) {
        //objeto Scanner
        Scanner Entrada = new Scanner(System.in);
        
        //objetos de las clases
        Celular celu1 = new Celular(true, "alta", "huawei", "P40", 23000);
        Computadora compu1 = new Computadora("HP", "Gamer", 30000);
        Pantalla pant1 = new Pantalla("LG", "4K", 25000);
        
        int eleccionDispositivo;
        int eleccionMenu;
        boolean loop=true;
        
        //Bucle while para que se repita la peticion
        while(loop==true){
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println("Elije un producto para comprarlo o para probarlo: ");
            System.out.println("1.-Celular \n2.-Pantalla (incluye control remoto) \n3.-computadora(incluye mouse y teclado) \nteclea 99 Para salir del menu...");
            eleccionDispositivo = Entrada.nextInt();
        
            try{
                switch(eleccionDispositivo){    
            case 1 -> {
                System.out.println("---------------------------------------------------------------------------------------");
                System.out.println("Elejiste el celular, Que quieres hacer con el? \n1) Probar \n2) Comprar producto");
                eleccionMenu = Entrada.nextInt();
                if (eleccionMenu==1) {
                    celu1.encender();
                    celu1.contestar();
                    celu1.configurar();
                    celu1.llamar();
                    celu1.llamadaActiva();
                    celu1.abriendoCamara();
                    celu1.tomarFoto();
                    celu1.agregarfilto();
                    celu1.apagar();
                    
                    
                }else if(eleccionMenu==2){
                    celu1.comprar();
                }   }
            
                case 2 -> {
                    System.out.println("---------------------------------------------------------------------------------------");
                    System.out.println("Elejiste Pantalla, Que quieres hacer con el? \n1) Probar \n2) Comprar producto");
                    eleccionMenu= Entrada.nextInt();
                    if (eleccionMenu==1) {
                        pant1.encender();
                        pant1.cambiarCanal();
                        pant1.bajaVolumen();
                        pant1.subirVolumen();
                        pant1.apagar();
                    }else if(eleccionMenu==2){
                        pant1.comprar();
                    }   }
            case 3 -> {
                System.out.println("---------------------------------------------------------------------------------------");
                System.out.println("Elejiste la Conputadora, Que quieres hacer con el? \n1) Probar \n2) Comprar producto");
                eleccionMenu= Entrada.nextInt(); 
                if (eleccionMenu==1) {
                    compu1.encender();
                    compu1.ejecutar();
                    compu1.buscarDispositivo();
                    compu1.conectar();
                    compu1.desconectar();
                    compu1.seleccionar();
                    compu1.apagar();
                    
                }else if(eleccionMenu==2){
                    compu1.comprar();
                }   }
            case 99 -> {
                System.out.println("---------------------------------------------------------------------------------------");
                System.out.println("Adios, vuelva pronto!, besitos!");
                loop=false;
            }
            
            
            //default por si hay una opcion erronea de numero 
            default -> {
                System.out.println("---------------------------------------------------------------------------------------");
                System.out.println("ELija un numero valido... ");
                System.out.println("---------------------------------------------------------------------------------------");
                    }
                }
            }
            catch (NumberFormatException e) {
                System.out.println("Error: Debes ingresar un número entero válido.");
                eleccionMenu = 0; 
            }
       }
    }
} 
