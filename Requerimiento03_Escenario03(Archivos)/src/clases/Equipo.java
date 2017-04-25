package clases;

import java.util.ArrayList;

/**
 *
 * @authores Cristhian Apolo, Nelson Aranda y Fernando León
 */
public class Equipo {

    private ArrayList<Programador> pro;

    public Equipo() {
        ArrayList<Programador> pr = new ArrayList<>();
        this.pro = pr;
    }

    public void Agregar_Programador(Programador p) {
        this.pro.add(p);
    }

    public String get_Programadores() {
        String composicion = "";
        int i = 1;
        for (Programador prog : pro) {
            composicion += "\nProgramador " + (i) + prog.toString();
            i += 1;
        }

        return composicion;
    }

    public ArrayList<Programador> getListProgramadores() {
        return pro;
    }

    @Override
    public String toString() {
        return String.format("\nGrupo de Programadores: %s ", get_Programadores());

    }

}
