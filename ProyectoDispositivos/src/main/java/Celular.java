public class Celular extends DispositivoElectronico implements Camara, Microfono {

    public boolean llamada;
    public String gama;

    public Celular(boolean llamada, String gama, String marca, String modelo, double precio) {
        super(marca, modelo, precio);
        this.llamada = llamada;
        this.gama = gama;
    }

    public void llamar() {
        System.out.println("Lammando a contacto....");
    }

    public void contestar() {
        System.out.println("Esta en una llamda...");

    }

    @Override
    public void tomarFoto() {
        System.out.println("Se ha tomado la foto con exito, guardando en la galeria...");

    }

    @Override
    public void encender() {
        System.out.println("Iniciando celular, porfavor espere....");
    }

    @Override
    public void apagar() {
        System.out.println("El dispositivo se esta apagando... adios!");
    }

    public boolean isLlamada() {
        return llamada;
    }

    public void setLlamada(boolean llamada) {
        this.llamada = llamada;
    }

    public void llamadaActiva() {
        if (llamada == true) {
            System.out.println("Lo sentimos, el numero que usted marco, esta ocupado...");
        }
    }

    @Override
    public void comprar() {
        if (precio >= 20000) {
            System.out.println("Tiene el 10% de descuento");
            System.out.println("EL precio sin descuento era de: " + precio);
            precio = precio * 0.9;
            System.out.println("El precio final es de: " + precio);
            System.out.println("------------------------------------------------------------------");
        } else {
            System.out.println("El precio final es de: " + precio);
        }
    }

    @Override
    public void agregarfilto() {
        System.out.println("Cambiando el filtro de la foto...");
    }

    @Override
    public void silenciar() {
        System.out.println("Se silencio el microfono");
    }

    @Override
    public void configurar() {
        System.out.println("Configurando el microfono");
    }

    public void abriendoCamara() {
        System.out.println("Se esta abriendo la camara...");
    }

}
