package model;

public class Usuarios {
    private Long id;
    private String nombre;
    private Long edad;

    /* Constructor para crear un usuario */
    public Usuarios(String nombre, Long edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /* Constructor para traer un usuario */
    public Usuarios(Long id, String nombre, Long edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Long getEdad() {
        return edad;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(Long edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Usuario=" +
                " id: " + id +
                ", nombre:'" + nombre + '\'' +
                ", edad: " + edad +"\n";
    }
}
