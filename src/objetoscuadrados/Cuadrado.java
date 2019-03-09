
package objetoscuadrados;



public class Cuadrado {
    //atributos
    private float lado;
    
    
    
    //Metodos

     public Cuadrado(float lado) {
        this.lado = lado;
       
    }

    public float getLado() {
        return lado;
    }

   
     
    public float getArea() {
        return (float) Math.pow(this.lado, 2);
       
    }
    
    public float getPerimetro() {
        return (float) this.lado*4;
    }
    
}

