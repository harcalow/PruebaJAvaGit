import java.math.*;
public class Main {
    public static void main(String[] args) {
        Operaciones p=new Operaciones();
        double x=5,y=6;
        System.out.println("suma "+p.suma(x,y));
        System.out.println("resta "+p.resta(x,y));
        System.out.println("multiplicacicon "+p.multiplicacion(x,y));
        System.out.println("Division "+p.division(x,y));
        System.out.println("logaritmo "+p.logaritmo(x));
        System.out.println("Raiz "+p.raiz(x));
    }
}
