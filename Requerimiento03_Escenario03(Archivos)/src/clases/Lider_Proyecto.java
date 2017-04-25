package clases;

/**
 *
 * @authores Cristhian Apolo, Nelson Aranda y Fernando León 
 */
public final class Lider_Proyecto extends Empleado {

    private final Programador progra;
    private final Equipo equipo;

    public Lider_Proyecto(Programador pr, Nomina nomin, Equipo e) {
        super(nomin);
        //Para el empleo de Lider se requiere un Programador
        Programador p = new Programador(pr.getNombre(), pr.getSalario_Mensual(), nomin);
        this.progra = p;
        setLenguaje(pr.get_Lenguaje());
        // Un lider dirige un grupo de programadores
        this.equipo = e;
    }
    //variable para sacar los lenguajes de programador
    String a;

    public void setLenguaje(String le) {
        this.a = le;
    }

    public String getLenguaje() {
        return a;
    }

    public double Calculo_Salario() {
        double salario;
        int cantidad;
        // obtener la cantidad de mienbros del equipo
        cantidad = equipo.getListProgramadores().size();
        //se anade el 10% al sueldo basico
        salario = ((progra.getSalario_Mensual() * 10) / 100) * cantidad;
        salario = salario + progra.getSalario_Mensual();
        return salario;
    }

    public Programador getProgramador() {
        return progra;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    @Override
    public String toString() {
        return String.format("Lider: %s%s Salario Por Cargo: %.2f \n%s\n",
                getProgramador(), getLenguaje(), Calculo_Salario(),getEquipo());
    }
}
