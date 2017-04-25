package clases;

/**
 *
 * @authores Cristhian Apolo, Nelson Aranda y Fernando León
 */
public class Lenguaje_Programacion {

    public String lenguaje;

    public Lenguaje_Programacion(String len) {
        this.lenguaje = len;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    @Override
    public String toString() {

        return String.format("%s", getLenguaje());
    }
}
