package clases;

import java.util.ArrayList;

/**
 *
 * @authores Cristhian Apolo, Nelson Aranda y Fernando León
 */
public class Programador extends Empleado {

    private String Nombre;
    private double Salario_Mesual;
    private final ArrayList<Lenguaje_Programacion> len;

    public Programador(String Nombre, double Salario_Mesual, Nomina nomin) {
        super(nomin);
        this.Nombre = Nombre;
        this.Salario_Mesual = Salario_Mesual;
        ArrayList<Lenguaje_Programacion> leng = new ArrayList<>();
        this.len = leng;
    }

    public void agregar_Lenguaje(Lenguaje_Programacion le) {
        this.len.add(le);
    }

    public String get_Lenguaje() {
        String composici = "";
        for (Lenguaje_Programacion le : len) {
            composici += le.toString();
        }

        return composici;
    }

    private double Bono() {
        String compara;
        double aumento, bono = this.Salario_Mesual;
        for (Lenguaje_Programacion le : len) {
            compara = le.toString();
            // se agrega un 20% al salario basico
            if ("Java".equals(compara)) {
                aumento = (this.Salario_Mesual * 20) / 100;
                bono += aumento;
            }
        }
        return bono;
    }

    public String getNombre() {
        return Nombre;
    }

    public void Registar_Nombre(String n) {
        this.Nombre = n;
    }

    public double getSalario_Mensual() {

        return Bono();
    }

    public void RegistrarSalario_Mesual(double sa) {
        this.Salario_Mesual = sa;
    }

    @Override
    public String toString() {
        return String.format("\n%s \nNombre: %s Salario Base: %.2f \nLenguajes de "
                + "Programacion: %s", super.toString(), getNombre(), getSalario_Mensual(), get_Lenguaje());
    }

}
