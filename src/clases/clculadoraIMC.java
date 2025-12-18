package clases;
import clases.Usuario;

public class clculadoraIMC {
    //THE RESPONSABILITY OF THIS CLASS IS CALCULATE THE IMC

    //METODOS

    public static double calularIMC(Usuario usuario){
        return usuario.getUserWeight() / (usuario.getUserHeight() * usuario.getUserHeight());
    }

    public static String clasificarIMC(double imc){
        if (imc < 18.5) return "\nEL usuario está en bajo peso";
        if (imc < 25) return "\nEL usuario está en peso normal";
        if (imc < 30) return "\nEL usuario está en sobrepeso";
        return "\nEL usuario está con obesidad";
    }
}
