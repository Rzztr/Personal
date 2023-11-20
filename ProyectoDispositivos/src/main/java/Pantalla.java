public class Pantalla extends DispositivoElectronico implements ControlRemoto{
    
    int pulgadas;
    String tipo;

    public Pantalla(String marca, String modelo, double precio) {
        super(marca, modelo, precio);
    }

    
    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void cambiarCanal() {
        System.out.println("Cambiando de canal");
    }

    @Override
    public void subirVolumen() {
        System.out.println("Incrementando volumen");
    }

    @Override
    public void bajaVolumen() {
        System.out.println("Bajando el volumen");
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo la television....");
    }

    @Override
    public void apagar() {
        System.out.println("La television se ha apagado");
    }

    @Override
    public void comprar() {
        if (precio>=20000) {
            System.out.println("Tiene el 10% de descuento");
            System.out.println("EL precio sin descuento era de: "+precio);
            precio=precio*0.9;
            System.out.println("El precio final es de: "+precio);
            System.out.println("------------------------------------------------------------------");

        }else{
            System.out.println("El precio final es de: "+precio);
        }
    }
    
    public void tamaño(){
        if (pulgadas<32) {
            System.out.println("Se nevesita un soporte mediano o pequeño reforzado");
        }else if(pulgadas>32){
            System.out.println("Se necesita un soporte mayor al promedio");
        }
    }
    
}
