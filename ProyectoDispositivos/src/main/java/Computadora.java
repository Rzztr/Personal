public class Computadora extends DispositivoElectronico implements Bluethooth,Mouse,Teclado{

    public Computadora(String marca, String modelo, double precio) {
        super(marca, modelo, precio);
    }
    @Override
    public void buscarDispositivo() {
        System.out.println("Buscando dispositivo Bluethooth para conectarse...");
    }

    @Override
    public void conectar() {
        System.out.println("Conexion con exito!");
    }

    @Override
    public void desconectar() {
        System.out.println("Se ha desconectado el dispositivo");
    }
    @Override
    public void seleccionar(){
        System.out.println("Clic izquierdo sobre la computadora");
    }
    
    @Override
    public void ejecutar(){
        System.out.println("Clic derecho sobre la computadora");
    }
    @Override
    public void encender(){
        System.out.println("La computadora se esta encendiendo...");
    }
    @Override
    public void apagar(){
        System.out.println("la computadora se esta apagando...");
    }
    
    @Override
    public void comprar(){
        if (precio>=20000) {
            System.out.println("Tiene el 10% de descuento");
            precio=precio*0.9;
        }else{
            System.out.println("El precio final es de: "+precio);
        }
        
    }

    @Override
    public void escribir() {
    }

    @Override
    public void cambiarIdioma() {
    }
}
