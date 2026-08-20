public class Castor {
    protected double cola;
    protected double velocidad;

    public Castor(double cola, double velocidad) {
        this.cola = cola;
        this.velocidad = velocidad;
    }
    
    public void tocarGuitarra(){
        int random = (int) (Math.random() * 6 + 1);
        System.out.println("toca cuerda " + random);
    }
    
    public void nadar(){
        System.out.println("Nada a " + this.velocidad);
    }
}
