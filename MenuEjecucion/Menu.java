package MenuEjecucion;

import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RegistroClientes registro = new RegistroClientes();

        //Crear el menú
        while (true) {
            System.out.println("\n---------Menú---------");
            System.out.println("1. Registrar Clientes.");
            System.out.println("2. Mostrar Clientes.");
            System.out.println("3. Salir del sistema");
            System.out.println("Escoja una opción: ");
            int opcion = scanner.nextInt();

            if (opcion == 1) {
                //Iterar en el bucle para que el usuario registre a 3 clientes por teclado
                for (int i = 0; i <3; i++) {
                    System.out.print("Ingrese la cedula del cliente " + (i + 1) + ":");
                    int cedula = scanner.nextInt();
                    scanner.nextLine(); //Salto de linea
                    System.out.print("Ingrese el nombre del cliente " + (i + 1) + ":");
                    String nombre = scanner.nextLine();
                    registro.agregarCliente(cedula, nombre);
                }
            } else if (opcion == 2) {
                registro.mostrarCliente();
            }
                else if (opcion == 3) {
                System.out.println("Ha salido del sistema.");
                break;
            } else {
                    System.out.println("Opción invalida. Intente nuevamente!");
            }
        }
        scanner.close();
    }
}