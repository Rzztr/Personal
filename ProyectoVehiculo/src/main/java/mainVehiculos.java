public class mainVehiculos {
    public static void main(String[] args) {
        
        //objetos
        AutoParticular auto1 = new AutoParticular(4, 90, 200 ,2, "UH4-45-78B", "Chevrolet", "2022");        
        Avion avion1 = new Avion(200, 860, 2000, 3, "ACB34", "Boeing", "Concord");
        Camion camion1 = new Camion(2, 80, 400, 1, "YN90-6G-99", "Volvo", "2023");
        
        //metodos objeto 1
        auto1.mostratDatos();
        auto1.calcularTiempo();
        auto1.tipoEnvio();
        auto1.totalEnvio();
        System.out.println("--------------------------------------------------");
        
        //metodos objeto 2
        avion1.mostratDatos();
        avion1.calcularTiempo();
        avion1.tipoEnvio();
        avion1.totalEnvio();
        
        System.out.println("--------------------------------------------------");
        
        //metodos objeto 3
        camion1.mostratDatos();
        camion1.seleccionCamion();
        camion1.calcularTiempo();
        camion1.tipoEnvio();
        camion1.totalEnvio();
    }
    
}
