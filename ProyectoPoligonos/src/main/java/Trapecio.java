public class Trapecio extends Poligono{
    
    private double lado1; 
    private double lado2;
    private double lado3;
    private double lado4;
    private double altura;

    public Trapecio(double lado1, double lado2, double lado3, double lado4, double altura) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.lado4 = lado4;
        this.altura = altura;
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

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public double getLado4() {
        return lado4;
    }

    public void setLado4(double lado4) {
        this.lado4 = lado4;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getNumLados() {
        return numLados;
    }

    public void setNumLados(int numLados) {
        this.numLados = numLados;
    }
    
    
    @Override
    public void area() {
        System.out.println("El area del trapecio es de: "+((lado1+lado3)*altura)/2);
    }

    @Override
    public void perimetro() {
        System.out.println("El perimetro del trapecio es: "+(lado1+lado2+lado3+lado4));
    }

    @Override
    public String toString() {
        return "lado1: " + lado1 + "\nlado2: " + lado2 + "\nlado3: " + lado3 + "\nlado4: " + lado4 + "\naltura: " + altura;
    }
    
    
}
