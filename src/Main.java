import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String nombre;
        double peso = 0, altura = 0;

        try {
            System.out.println("Ingrese su nombre:");
            nombre = read.nextLine();

            System.out.println("Cuanto pesa en kg?");
            peso = read.nextDouble();
            if (peso <= 0) {
                throw new IllegalArgumentException("El peso debe ser un número positivo.");
            }

            System.out.println("Cual es su altura en metros?");
            altura = read.nextDouble();
            if (altura <= 0) {
                throw new IllegalArgumentException("La altura debe ser un número positivo.");
            }

            Paciente paciente = new Paciente(nombre, peso, altura);

            Imc.IMC imc = new Imc.IMC(paciente.getPeso(), paciente.getAltura());

            System.out.println("Usted tiene " + imc.calcular());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}