package clases;
import clases.Usuario;

public class  clculadoraIMC {
    //THE RESPONSABILITY OF THIS CLASS IS CALCULATE THE IMC

    //METODOS

    public static double calularIMC(Usuario usuario){
        return usuario.getUserWeight() / (usuario.getUserHeight() * usuario.getUserHeight());
    }

    public static String clasificarIMC(double imc){
        if (imc < 18.5) return "EL usuario tiene " + Math.round(imc) + " está con bajo peso";
        if (imc < 25) return "EL usuario tiene " + Math.round(imc) + " está con peso normal";
        if (imc < 30) return "\nEL usuario tiene " + Math.round(imc) + " está con sobrepeso";
        return "\nEL usuario tiene " + Math.round(imc) + " está con obesidad";
    }
}
