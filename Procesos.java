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

    public void imprimirEventos() {
        if (registro.size() == 0) {
            System.out.println("\nNO SE PUEDE HACER LA CONSULTA. NOHAY EVENTOS REGISTRADOS");
        } else {
            System.out.println("\nLos eventos que usted, Carlos, ha ingresado son los siguientes: ");
            System.out.println();
            for(int i = 0; i < registro.size(); i++){
                System.out.print("ID del evento: " + registro.get(i).getId());
                System.out.print("Nombre del evento: " + registro.get(i).getNombre());
                System.out.print("Descripción del evento: " + registro.get(i).getDescripcion());
                System.out.print("Inicio del evento: " + registro.get(i).getInicio());
                System.out.print("Nombre del evento: " + registro.get(i).getFin());
                System.out.println();
            }
        }
    }

    public void buscarEvento(int id) {
        int acumulador = 0;
        boolean valor = false;
        do {
            if (acumulador == registro.size()) {
                System.out.println("\nNO SE ENCONTRÓ UN EVENTO QUE TUVIERÁ EL NÚMERO DEL ID DIGITADO.");
                valor = true;
            } else if (registro.get(acumulador).getId() == id) {
                System.out.println("\nDATOS DEL EVENTO:");
                System.out.println("-El ID del evento: " + registro.get(acumulador).getId() + ".");
                System.out.println("-Nombre del evento: " + registro.get(acumulador).getNombre() + ".");
                System.out.println("-Descripción" + registro.get(acumulador).getDescripcion() + " .");
                System.out.println("-Inicio: " + registro.get(acumulador).getInicio() + ".");
                System.out.println("-Fin: " + registro.get(acumulador).getFin() + ".");
                valor = true;
            } else {
                acumulador++;
            }
        } while (!valor);
    }

    public void actualizarEvento(int id) {
        int acumulador = 0;
        boolean valor = false;
        do {
            if (acumulador == registro.size()) {
                System.out.println("\nNO SE ENCONTRÓ UN PRODUCTO QUE TUVIERÁ EL NÚMERO DEL ID DIGITADO.");
                valor = true;
            } else if (registro.get(acumulador).getId() == id) {
                System.out.println("\nDATOS ACTUALES DEL EVENTO:");
                System.out.println("-El ID del evento: " + registro.get(acumulador).getId() + ".");
                System.out.println("-Nombre del evento: " + registro.get(acumulador).getNombre() + ".");
                System.out.println("-Descripción: " + registro.get(acumulador).getDescripcion() + ".");
                System.out.println("-Inicio: " + registro.get(acumulador).getInicio() + ".");
                System.out.println("-Fin: " + registro.get(acumulador).getFin() + ".");
                System.out.println("\nUsuario, por favor, ingrese los nuevos datos referentes al evento actual: ");
                System.out.print("-Nuevo nombre: ");
                String nombre = sc.nextLine();
                registro.get(acumulador).setNombre(nombre);
                System.out.print("-Nueva descripción: ");
                String descripcion = sc.nextLine();
                registro.get(acumulador).setDescripcion(descripcion);
                System.out.println("-Nuevo inicio: ");
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
                registro.get(acumulador).setInicio(inicio);;
                System.out.println();
                System.out.println("Ingrese los datos del nuevo fin del evento: ");
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
                registro.get(acumulador).setFin(fin);
                System.out.println("\nSE HA REALIZADO EL CAMBIO EFECTIVAMENTE.");
                valor = true;
            } else {
                acumulador++;
            }
        } while (!valor);    
    }

    public void eliminarEvento(int id) {
        int acumulador = 0;
        boolean valor = false;
        do {
            if (acumulador == registro.size()) {
                System.out.println("\nNO SE ENCONTRÓ UN EVENTO CON EL ID INGRESADO.");
                valor = true;                 
            } else if (registro.get(acumulador).getId() == id) {
                System.out.println("\nDATOS DEL EVENTO QUE SE QUIERE ELIMINAR:");
                System.out.println("-El ID del evento: " + registro.get(acumulador).getId() + ".");
                System.out.println("-Nombre del evento: " + registro.get(acumulador).getNombre() + ".");
                System.out.print("\nUsuario, ¿está seguro de que quiere eleiminar este producto? (Escriba 'si' o 'no': ");
                String decision = sc.nextLine();
                while (!decision.equalsIgnoreCase("si") || !decision.equalsIgnoreCase("no")) {
                    System.out.println("\nHA INGRESADO UNA OPCIÓN INVALIDA.");
                    System.out.print("Por favor, escriba 'si' para continuar con el proceso de eliminar, o 'no' para cancelarlo: ");
                    decision = sc.nextLine();
                }
                if (decision.equalsIgnoreCase("si")) {
                    registro.remove(acumulador);
                    System.out.println("\nSE HA ELIMINADO EL EVENTO EFECTIVAMENTE.");
                    valor = true;
                } else if (decision.equalsIgnoreCase("no")) {
                    System.out.println("\nSE HA CANCELADO LA ELIMINACIÍON.");
                    valor = true;
                }           
            } else {
                acumulador++;
            }
        } while (!valor);    
    }
}

