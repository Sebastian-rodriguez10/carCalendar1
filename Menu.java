
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Evento evento = new Evento();
        Scanner scanner = new Scanner(System.in);
        LocalDateTime hora = LocalDateTime.now();
        evento.setFin(hora);
        

    }
}
