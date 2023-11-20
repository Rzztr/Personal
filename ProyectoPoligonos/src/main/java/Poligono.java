public abstract class Poligono {
    protected int numLados;
    
    
    public abstract void area();
    public abstract void perimetro();
    
    public int getNumLados() {
        return numLados;
    }

    public void setNumLados(int numLados) {
        this.numLados = numLados;
    }

    @Override
    public String toString() {
        return "numero de lados: " + numLados;
    }
    
    
}
