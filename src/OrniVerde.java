
import java.util.Scanner;

public class OrniVerde extends Castor implements Pato{
    
    Scanner scan = new Scanner(System.in);
    
    public OrniVerde(double cola, double velocidad) {
        super(cola, velocidad);
    }

    @Override
    public void tocarOrgano() {
        System.out.println("Do-Re-Mi");
        scan.nextLine();
        System.out.println("Fa-Sol-La-Si");
    }
    
    public void tocarGuitorgan() {
        super.tocarGuitarra();
        this.tocarOrgano();
        System.out.println("cuac cuaac…!");
    }
    
}
