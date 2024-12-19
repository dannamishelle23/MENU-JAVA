package MenuEjecucion;

public class RegistroClientes {
    int[] cedulas = new int[3];             //Se rellenan en el bucle for
    String[] nombres = new String[3];               //Se rellenan en el bucle for
    int totalClientes = 0;                           //Contador de clientes registrados

    //Metodo para agregar clintes
    public void agregarCliente(int cedula, String nombre) {
        if (totalClientes < 3) {
            this.cedulas[totalClientes] = cedula;
            this.nombres[totalClientes] = nombre;
            totalClientes++;                            //El contador va incrementando
            System.out.println("Cliente agregado con éxito.");
        } else {
            System.out.println("No se puede agregar más clientes, se alcanzó el límite de registros!");
        }
    }

    public void mostrarCliente() {
        if (totalClientes == 0) {
            System.out.println("No hay más clientes...");
        } else {
            for (int i= 0; i < totalClientes; i++) {
                System.out.println("Cédula: " + cedulas[i] + ", Nombre: " + nombres[i]);
            }
        }
    }
}
