import java.util.Scanner;

public class Condicional7 {
    static final int AMERICA_NORTE = 24;
    static final int AMERICA_CENTRO = 20;
    static final int AMERICA_SUR = 21;
    static final int EUROPA = 10;
    static final int ASIA = 18;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Dónde quieres mandar el paquete? America Norte (N), America Centro (C), America Sur (S), Europa (E) y Asia (A)");
        char direccion = sc.next().charAt(0);
        System.out.println("¿Cuánto pesa el paquete?");
        double paquete = sc.nextDouble();
        if (paquete < 5) {
            System.out.println("Entrega rechazada");
        } else {
            switch (direccion) {
                case 'N':
                    System.out.printf("La entrega costará %.2f €",AMERICA_NORTE * paquete);
                    break;
                case 'C':
                    System.out.printf("La entrega costará %.2f €",AMERICA_CENTRO * paquete);
                    break;
                case 'S':
                    System.out.printf("La entrega costará %.2f €",AMERICA_SUR * paquete);
                    break;
                case 'E':
                    System.out.printf("La entrega costará %.2f €",EUROPA * paquete);
                    break;
                case 'A':
                    System.out.printf("La entrega costará %.2f €",ASIA * paquete);
                    break;
            }
        }
    }
}
