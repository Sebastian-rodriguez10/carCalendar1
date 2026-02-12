import java.time.LocalDateTime;

public class Evento {
    private int id;
    private String nombre;
    private String descripcion;
    private LocalDateTime inicio;
    private LocalDateTime fin;

    public Evento (){

    }

    public Evento (int id, String nombre, String descripcion, LocalDateTime inicio, LocalDateTime fin){
        this.nombre = nombre;
        this.id = id;
        this.descripcion = descripcion;
        this.inicio = inicio;
        this.fin = fin;
    }

    public String getNombre() {
        return nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public LocalDateTime getFin() {
        return fin;
    }
    public int getId() {
        return id;
    }
    public LocalDateTime getInicio() {
        return inicio;
    }

    public void mostrar (){
        System.out.println(fin);
    }


    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setFin(LocalDateTime fin) {
        if (fin == LocalDateTime.now()) {
            System.out.println("danabanna");
        }else{
            System.out.println("no dana banana noooo");
        }
        this.fin = fin;

    }
    public void setId(int id) {
        this.id = id;
    }
    public void setInicio(LocalDateTime inicio) {
        this.inicio = inicio;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
