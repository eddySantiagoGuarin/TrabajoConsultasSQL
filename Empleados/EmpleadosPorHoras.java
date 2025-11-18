public class EmpleadosPorHoras extends Empleados{
    private int valorPoHora;
    private int Horas ;

    public EmpleadosPorHoras(String nombre, int salarioBase,int valorPoHora, int horas) {
        super(nombre, salarioBase);
        this.valorPoHora = valorPoHora;
        this.horas = horas;
    }

   @Override
   public int calcularSAlario(){
       return this.valorPoHora*this.Hor;
   }

   @java.lang.Override
   public java.lang.String toString() {

        "EmpleadoPorHoras{" +
               "bon=" + bono +
               '}';
   }


}
