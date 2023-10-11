import java.util.Scanner;

public class Condicional6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double suma = 0;
        System.out.println("Cuantos minutos ha estado en llamada");
        int minutos = sc.nextInt();
        if (minutos > 10) {
            int resto_minutos = minutos - 10;
            suma = 1 + 0.8 + 0.7 + 0.5*resto_minutos;
        } else if (minutos > 8) {
            suma = 1 + 0.8 + 0.7;
        } else if (minutos > 5) {
            suma = 1 + 0.8;
        } else suma = 1;
        System.out.println(suma);
    }
}
