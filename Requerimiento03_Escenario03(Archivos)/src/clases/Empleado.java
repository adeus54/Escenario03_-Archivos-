package clases;

/**
 *
 * @authores Cristhian Apolo, Nelson Aranda y Fernando León 
 */
public class Empleado {

    private Nomina nomin;

    public Empleado(Nomina nomin) {
        this.nomin = nomin;
    }

    public String getNumero_nomina() {

        return nomin.getStrNum_Nomina();
    }

    public double Incremeto_Sueldo(double s) {
        double incremento = s;
        incremento = ((incremento * 20) / 100);
        return incremento;
    }

    @Override
    public String toString() {

        return String.format("Numero de Nomina: %s", getNumero_nomina());
    }
}
