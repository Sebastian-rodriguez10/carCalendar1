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
        if (descripcion == "") {
            System.out.println("La descripcion es obligatoria");
        }
        this.descripcion = descripcion;
    }
    public void setFin(LocalDateTime fin) {
        if (fin == null) {
            System.out.println("No puede ser un valor nulo");
        }
        if (inicio != null && fin.isBefore(inicio)) {
            System.out.println("La fecha final no puede ser antes de la fecha inicial");
        }
        this.fin = fin;

    }
    public void setId(int id) {
        if (id <= 0) {
            System.out.println("el id debe ser mayor a 0");
        }
        this.id = id;
    }
    public void setInicio(LocalDateTime inicio) {
        if (inicio == null) {
            System.out.println("debe poner fecha de inicio");
        }
        this.inicio = inicio;
    }
    public void setNombre(String nombre) {
        if (nombre == "") {
            System.out.println("El nombre es obligatorio");
        }
        this.nombre = nombre;
    }
}
