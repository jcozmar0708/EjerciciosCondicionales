import java.util.Scanner;

public class Condicional4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe la base");
        double base = sc.nextDouble();
        System.out.println("Escribe el exponente");
        double exponente = sc.nextDouble();
        if (exponente > 0) System.out.println(Math.pow(base,exponente));
        else if (exponente == 0) System.out.println(1);
        else System.out.println(1/Math.pow(base,exponente * -1));
    }
}
