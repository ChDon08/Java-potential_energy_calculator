import java.util.Scanner;

void main(){
    Scanner in = new Scanner(System.in); //istanzia un oggetto lettore di tipo Scanner
    float m;
    do {
        System.out.println("Inserire massa corporea (Kg)");
        m = in.nextFloat();
        if (m<=0)
            System.out.println("impossibile, rifai");
    }while(m<=0);
    System.out.println("inserire accellerazione di gravità (m/s^2)");
    float g = in.nextFloat();
    int selector;
    do {
        System.out.println("si desidera esprimere il Δh in metri (0) o in kilometri (1)");
        selector = in.nextInt();
    }while (selector!=0 && selector!=1);
    System.out.println("inserire Δh");
    float dh = in.nextFloat();
    if (selector==1)
        dh=dh*1000;
    System.out.println(STR."l'energia potenziale è pari a \{m * g * dh} joule");

}