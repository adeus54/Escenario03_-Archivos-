package principal;

import clases.*;
import java.io.IOException;

/**
 *
 * @authores Cristhian Apolo, Nelson Aranda y Fernando León
 */
public class Ejecutor {

    public static void main(String[] args) throws IOException {
        Manejo_de_Registro n = new Manejo_de_Registro();
        n.AbrirArchivo();

        Nomina nomina1 = new Nomina("239-HH-129");
        Nomina nomina2 = new Nomina("009-PH-459");
        Nomina nomina3 = new Nomina("404-AA-291");
        //
        Lenguaje_Programacion lenguaje1 = new Lenguaje_Programacion("Java");
        Lenguaje_Programacion lenguaje2 = new Lenguaje_Programacion("C++");
        Lenguaje_Programacion lenguaje3 = new Lenguaje_Programacion("Python");
        Lenguaje_Programacion lenguaje4 = new Lenguaje_Programacion("Ruby");

        Programador programador1 = new Programador("Lucas Petrovit", 1320, nomina1);
        Programador programador2 = new Programador("Robert Patrick", 1020, nomina2);
        Programador programador3 = new Programador("Daniel Hugh", 980, nomina3);
        programador1.agregar_Lenguaje(lenguaje1);
        programador2.agregar_Lenguaje(lenguaje3);
        programador3.agregar_Lenguaje(lenguaje2);
        //
        Equipo eq1 = new Equipo();
        Lider_Proyecto lider = new Lider_Proyecto(programador2, nomina1, eq1);

        eq1.Agregar_Programador(programador1);
        eq1.Agregar_Programador(programador3);
        System.out.println("\t\t\t\t\t****ESCENARIO 3****");
        System.out.println("\t\t\t\t\tMaquila de Software\n");
        System.out.println(lider.toString());
        n.Agregar_Registros(lider.toString());
        

    }
}
