import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Procesos {
   
    private ArrayList<Evento> registro;
    private Scanner sc;
    private int id;
    
    public Procesos() {
        this.registro = new ArrayList<>();
        this.sc = new Scanner(System.in);
        this.id = 0;
    }

    public void setEventos() {
        id++;
        Evento evento = new Evento();
        evento.setId(id);
        System.out.print("Usuario, por favor, ingrese el nombre del evento: ");
        String nombre = sc.nextLine();
        evento.setNombre(nombre);
        System.out.println();
        System.out.print("Ahora, ingrese la descripción del evento: ");
        String descripcion = sc.nextLine();
        evento.setDescripcion(descripcion);
        System.out.println();
        System.out.print("Ingrese los datos de inicio del evento: ");
        System.out.print("- Año (en números): ");
        int año = sc.nextInt();
        System.out.print("- Mes (en números): ");
        int mes = sc.nextInt();
        System.out.print("- Día del mes (en números): ");
        int dia = sc.nextInt();
        System.out.print("- Hora (en números): ");
        int horas = sc.nextInt();
        System.out.print("- minutos (en números): ");
        int minutos = sc.nextInt();
        LocalDateTime inicio = LocalDateTime.of(año, mes, dia, horas, minutos);
        evento.setInicio(inicio);
        System.out.println();
        System.out.print("Ingrese los datos de fin del evento: ");
        System.out.print("- Año (en números): ");
        int añoF = sc.nextInt();
        System.out.print("- Mes (en números): ");
        int mesF = sc.nextInt();
        System.out.print("- Día del mes (en números): ");
        int diaF = sc.nextInt();
        System.out.print("- Hora (en números): ");
        int horasF = sc.nextInt();
        System.out.print("- Minutos (en números): ");
        int minutosF = sc.nextInt();
        LocalDateTime fin = LocalDateTime.of(añoF, mesF, diaF, horasF, minutosF);
        evento.setFin(fin);
        registro.add(evento);
    }

    public void getEventos() {
        
    }

    public void buscarProducto(int id) {
        int acumulador = 0;
        boolean valor = false;
        do {
            if (registro.get(acumulador).getId() == id) {
                System.out.println("\nDATOS DEL PRODUCTO:");
                System.out.println("-El ID del producto: " + registro.get(acumulador).getId() + ".");
                System.out.println("-Nombre del producto: " + registro.get(acumulador).getNombre() + ".");
                System.out.println("-Precio: $" + registro.get(acumulador).getPrecio() + " COP.");
                System.out.println("-Cantidad en Stock: " + registro.get(acumulador).getCantidadEnStock() + ".");
                System.out.println("-Característica: " + registro.get(acumulador).caracteristica() + ".");
                valor = true;
            } else if (acumulador == registro.size()) {
                System.out.println("\nNO SE ENCONTRÓ UN PRODUCTO QUE TUVIERÁ EL NÚMERO DEL ID DIGITADO.");
                valor = true;
            } else {
                acumulador++;
            }
        } while (!valor);
    }

    public void actualizarProducto(int id) {
        int acumulador = 0;
        boolean valor = false;
        do {
            if (registro.get(acumulador).getId() == id) {
                System.out.println("\nDATOS ACTUALES DEL PRODUCTO:");
                System.out.println("-El ID del producto: " + registro.get(acumulador).getId() + ".");
                System.out.println("-Nombre del producto: " + registro.get(acumulador).getNombre() + ".");
                System.out.println("-Precio: $" + registro.get(acumulador).getPrecio() + " COP.");
                System.out.println("\nUsuario, por favor, ingrese los nuevos datos referentes al producto actual: ");
                System.out.print("-Nuevo nombre: ");
                String nombre = sc.nextLine();
                registro.get(acumulador).setNombre(nombre);
                System.out.print("-Precio nuevo: $");
                double precio = sc.nextDouble();
                while (precio <= 0) {
                    System.out.println("\nVALOR DE PRECIO INVALIDO.");
                    System.out.print("Por favor, ingrese en números, un precio mayor a $0 COP: ");
                    precio = sc.nextDouble();
                }
                registro.get(acumulador).setPrecio(precio);
                System.out.println("-Actualización de cantidad en Stock (por favor ingresar números): ");
                int cantidad = sc.nextInt();
                while (cantidad <= 0) {
                    System.out.println("\nDATO INVALIDO.");
                    System.out.print("Por favor, ingrese en un número mayor a 0 la cantidad del prodcuto en el stock: ");
                    cantidad = sc.nextInt();
                }
                registro.get(acumulador).setCantidadEnStock(cantidad);
                System.out.println("\nSE HA REALIZADO EL CAMBIO EFECTIVAMENTE.");
                valor = true;
            } else if (acumulador == registro.size()) {
                System.out.println("\nNO SE ENCONTRÓ UN PRODUCTO QUE TUVIERÁ EL NÚMERO DEL ID DIGITADO.");
                valor = true;
            } else {
                acumulador++;
            }
        } while (!valor);    
    }

    public void eliminarProducto(int id) {
        int acumulador = 0;
        boolean valor = false;
        do {
            if (registro.get(acumulador).getId() == id) {
                System.out.println("\nDATOS DEL PRODUCTO QUE SE QUIERE ELIMINAR:");
                System.out.println("-El ID del producto: " + registro.get(acumulador).getId() + ".");
                System.out.println("-Nombre del producto: " + registro.get(acumulador).getNombre() + ".");
                System.out.print("\nUsuario, ¿está seguro de que quiere eleiminar este producto? (Escriba 'si' o 'no': ");
                String decision = sc.nextLine();
                while (!decision.equalsIgnoreCase("si") || !decision.equalsIgnoreCase("no")) {
                    System.out.println("\nHA INGRESADO UNA OPCIÓN INVALIDA.");
                    System.out.print("Por favor, escriba 'si' para continuar con el proceso de eliminar, o 'no' para cancelarlo: ");
                    decision = sc.nextLine();
                }
                if (decision.equalsIgnoreCase("si")) {
                    registro.remove(acumulador);
                    System.out.println("\nSE HA ELIMINADO EL PRODCUTO EFECTIVAMENTE.");
                    valor = true;
                } else if (decision.equalsIgnoreCase("no")) {
                    System.out.println("\nSE HA CANCELADO LA ELIMINACIÍON.");
                    valor = true;
                }                
            } else if (acumulador == registro.size()) {
                System.out.println("\nNO SE ENCONTRÓ UN PRODUCTO CON EL ID INGRESADO.");
                valor = true;
            } else {
                acumulador++;
            }
        } while (!valor);    
    }
}

