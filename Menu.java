import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Procesos procesos = new Procesos();

        boolean deseaContinuar = true;

        while(deseaContinuar) {
            System.out.println("Seleccione la opcioon que desee");
            System.out.println("1 para agregar un evento");
            System.out.println("2 para ver eventos");
            System.out.println("3 para buscar evento");
            System.out.println("4 Para modificar evento");
            System.out.println("5 para eliminar evento");
            System.out.println("6 para salir ");
            
            int opcionPrincupal = sc.nextInt();

            switch (opcionPrincupal) {
                case 1:
                    procesos.setEventos();
                    break;
                case 2:
                    procesos.imprimirEventos();
                    break;
                case 3:
                    System.out.println("Dijite el id del evento que quiere buscar");
                    int idEv = sc.nextInt();
                    procesos.buscarEvento(idEv);;
                    break;
                case 4:
                    System.out.println("Dijite el id del evento que quiere modificar");
                    int idEvModi = sc.nextInt();
                    procesos.actualizarEvento(idEvModi);
                    break;
                case 5:
                    System.out.println("Dijite el id del evento que quiere modificar");
                    int idEli = sc.nextInt();
                    procesos.eliminarEvento(idEli);;
                    break;
                case 6:
                    deseaContinuar = false;
                    break;
            
                default:
                    System.out.println("no existe una opcion con el dato ingresado");
                    break;
            }
        }
        

    }
}
