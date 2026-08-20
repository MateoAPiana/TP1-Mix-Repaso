public class Castor {
    protected double cola;
    protected double velocidad;

    public Castor(double cola, double velocidad) {
        this.cola = cola;
        this.velocidad = velocidad;
    }
    
    public void tocarGuitarra(){
        System.out.println("Tocando la guitarra");
                    System.out.println("Tocando la guitarra");

    }
    
    public void nadar(){
        System.out.println("Nada a " + this.velocidad);
    }
}
