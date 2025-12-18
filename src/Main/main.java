package Main;

import clases.Usuario;
import clases.clculadoraIMC;

public class main {
    static void main(String[] args){

        /*Se crea objeto*/
        Usuario user1 = new Usuario(1010246356, "Brayan", "M", 26, 70, 1.74, 32.5, 60.0);
        System.out.println(user1.info());

        /*Se calula IMC del objeto*/
        double imc = clculadoraIMC.calularIMC(user1);
        String clasificacion = clculadoraIMC.clasificarIMC(imc);
        System.out.println(clasificacion);

    }
}
