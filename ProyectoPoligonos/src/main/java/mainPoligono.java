public class mainPoligono {
    public static void main(String[] args) {
        
        //objetos 
        Rectangulo rect1 = new Rectangulo(2, 3);
        Triangulo trian1 = new Triangulo(1, 1, 1, 6);
        Trapecio trape1 = new Trapecio(1, 2, 3, 4, 5);
        
        
        //Metodos objeto 1
        rect1.setNumLados(4);
        rect1.perimetro();
        System.out.println(rect1.toString());
        
        //Metodos objeto 2
        trian1.setNumLados(3);
        trian1.perimetro();
        trian1.area();
        System.out.println(trian1.toString());
        
        //Metodos del objeto 3
        
        trape1.perimetro();
        trape1.area();
        System.out.println(trape1.toString());
    }
}
