public class Rectangulo extends Poligono {
    private double lado1;
    private double lado2;

    public Rectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public int getNumLados() {
        return numLados;
    }

    public void setNumLados(int numLados) {
        this.numLados = numLados;
    }

    @Override
    public void area() {
        System.out.println("el area de la figura es: "+(lado1*lado2));
    }

    @Override
    public void perimetro() {
        System.out.println("El perimetro de la figura es: "+((2*lado1)+(2*lado2)));
    }

    @Override
    public String toString() {
        return  "lado1: " + lado1 + "\nlado2: " + lado2;
    }
    
    
}
