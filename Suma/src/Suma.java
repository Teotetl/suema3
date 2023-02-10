import java.util.Scanner;
public class Suma {
    public static void main(String[] args) {
        Scanner hola=new Scanner(System.in);
        int suma, n1,n2;
        System.out.println("Da el primer número");
        n1=hola.nextInt();
        System.out.println("Da el segundo número");
        n2=hola.nextInt();
        suma= n1+n2;
        System.out.println("La suma es" + suma);
    }

}
