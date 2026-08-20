
import java.util.Scanner;

public class orniAzul extends Castor {
    protected double propulsion;
    Scanner scan = new Scanner(System.in);
    
        public orniAzul(double propulsion, double cola, double velocidad) {
            super(cola, velocidad);
            System.out.println("Ingrese la propulsión");
            this.propulsion = scan.nextDouble();
            scan.nextLine();
        }
    
    @Override
    public void nadar(){
        System.out.println("Nada a " + (this.velocidad + this.propulsion));
    }
}
