public class Camion extends Vehiculo implements Paqueteria{
    private int carga;
    private double velocidad;
    private double distancia;
    private int tipoEnvio;

    public Camion(int carga, double velocidad, double distancia, int tipoEnvio, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.carga = carga;
        this.velocidad = velocidad;
        this.distancia = distancia;
        this.tipoEnvio = tipoEnvio;
    }

    
    public void seleccionCamion(){
        if (carga<1) {
            System.out.println("Se enviara una pick up de menor tamaño");
        }else if(carga>1&&carga<5){
            System.out.println("Se enviara un camion o una camioneta de tamaño promedio");
        }else if(carga>=5){
            System.out.println("Se enviara un trailer");
        }
    }
    
    @Override
    public void mostratDatos() {
        System.out.println("""
                           Camion 
                           capacidad de carga: """+carga+" toneladas"+"\n matricula: "+matricula+" \nMarca: "+marca+"\nmodelo: "+modelo+"\nTipo de envio: "+tipoEnvio);
        
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
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
        System.out.println(carga+" toneladas han sido enviadas");
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
