import java.util.Scanner;

public class Condicional1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un numero");
        int n = sc.nextInt();
        if (n%2 == 0) System.out.println("Es par");
        else System.out.println("Es impar");
    }
}
