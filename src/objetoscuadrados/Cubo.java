
package objetoscuadrados;

public class Cubo extends Cuadrado{
    
    private float volumen;
    private float perimetroC;

    public Cubo( float lado) {
        super(lado);
        this.volumen = volumen;
        this.perimetroC =perimetroC;
        this.volumen=volumen;
    }

    public void volumen(){
        
    }
            

    public float getVolumen() {
        return (float) Math.pow(getLado(),3);
    }
    
    
    public float getPerimetro() {
        return (float) this.getLado()*12;
    }
    
    
    
}
