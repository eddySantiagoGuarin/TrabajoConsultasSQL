public abstract class Empleados {
    private String nombre;
    private int salarioBase;

    public Empleados(String nombre, int salarioBase){
        this.nombre=nombre;
        this.salarioBase=salarioBase;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(int salarioBase) {
        this.salarioBase = salarioBase;
    }

    public abstract int calcularSalaio();

    @java.lang.Override
    public java.lang.String toString() {
        return "Empleados{" +
                "nombre='" + nombre + '\'' +
                ", salarioBase=" + salarioBase ;
    }
}
