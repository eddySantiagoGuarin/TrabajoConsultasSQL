public class EmpleadoTiempoCopleto extends Empleados{
     private int bono;

    public EmpleadoTiempoCopleto(String nombre, int salarioBase, int bono) {
        super(nombre, salarioBase);
        this.bono = bono;
    }

    @Override
    public int calcularSAlario(){
        return  this.salarioBase+this.bono;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return super.toString()+
                "EmpleadoTiempoCopleto{" +
                "bono=" + bono +
                '}';
    }
}
