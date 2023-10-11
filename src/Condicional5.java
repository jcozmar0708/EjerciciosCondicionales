import java.util.Scanner;

public class Condicional5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n_alumnos;
        System.out.println("¿Cuantos alumnos van al viaje?");
        n_alumnos = sc.nextDouble();
        if (n_alumnos >= 100) System.out.println("Cada alumno paga 65€");
        else if (n_alumnos >= 50) System.out.println("Cada alumno paga 70€");
        else if (n_alumnos >= 30) System.out.println("Cada alumno paga 95€");
        else System.out.printf("Cada alumno paga %.2f€", 4000/n_alumnos);
    }
}
