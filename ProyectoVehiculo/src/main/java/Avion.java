public class Avion extends Vehiculo implements Paqueteria{
    private int capacidadPersonas;
    private double velocidad;
    private double distancia;
    private int tipoEnvio;

    public Avion(int capacidadPersonas, double velocidad, double distancia, int tipoEnvio, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.capacidadPersonas = capacidadPersonas;
        this.velocidad = velocidad;
        this.distancia = distancia;
        this.tipoEnvio = tipoEnvio;
    }

    
    @Override
    public void mostratDatos() {
        System.out.println("avion"+"\ncapacidad de pasajeros: "+capacidadPersonas+"\n matricula: "+matricula+" \nMarca: "+marca+"\nmodelo: "+modelo+"\nTipo de envio: "+tipoEnvio);

    }

    public int getCapacidadPersonas() {
        return capacidadPersonas;
    }

    public void setCapacidadPersonas(int capacidadPersonas) {
        this.capacidadPersonas = capacidadPersonas;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
    
    @Override
    public void calcularTiempo() {
        System.out.println("La distancia por recorrer es: "+distancia);
        System.out.println("El tiempo aproximado de llegada sera en: "+(distancia/velocidad)+" Horas");
    }

    @Override
    public void enviar() {
        System.out.println("El paquete se ha enviado");
    }

    @Override
    public void totalEnvio() {
         System.out.println("El total del envio seria: "+(distancia*150)+" Pesos");
        System.out.println(capacidadPersonas+" personas mas el paquete de envio");
    }

    @Override
    public void tipoEnvio() {
        switch(tipoEnvio){
            case 3:
                System.out.println("Se enviara de inmediato por una cuota mayor...."); 
                
            
            case 2:
                System.out.println("Se enviara en unos momentos, se agregara una cuota media....");
                break;
            
            case 1: 
                System.out.println("se esta preparando el envio, no hay cuota de por medio");
                break;
        }
    }
}
