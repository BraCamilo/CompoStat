package Main;

import clases.Usuario;
import clases.clculadoraIMC;
import clases.CalculadoraGrasaCorporal;

public class main {
    static void main(String[] args){

        /*Se crea objeto*/
        Usuario user1 = new Usuario(1010246356, "Brayan", 0, 26, 70, 1.74, 32.5, 60.0);
        System.out.println(user1.info());

        /*Se calula indice de masa corporal IMC del objeto*/
        double imc = clculadoraIMC.calularIMC(user1);
        String clasificacion = clculadoraIMC.clasificarIMC(imc);
        System.out.println(clasificacion);

        /*Se calcula grasa corporal igc del obejto*/
        double igc = CalculadoraGrasaCorporal.calcularGrasa(imc, user1.getUserAge(), user1.getUserSex());
        System.out.println("El indice de grasa coporal de " + user1.getUserName() + " es de: " + igc);

    }
}
