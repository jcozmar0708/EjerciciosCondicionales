import java.util.Scanner;

public class Condicional3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1,n2;
        System.out.println("Escribe 2 números");
        n1 = sc.nextDouble();
        n2 = sc.nextDouble();
        if (n2 == 0) System.out.println("Error");
        else System.out.println(n1/n2);
    }
}
