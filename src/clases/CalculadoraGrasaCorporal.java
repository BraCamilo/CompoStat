package clases;

public class CalculadoraGrasaCorporal {
    //La responsabilidad de esta clase es calcula el porcentaje de grasa corporal

    //metodos

    public static double calcularGrasa(Usuario usuario){
        double imc = 0;
        return (1.20 * imc) + (0.23 * usuario.getUserAge()) - (10.8 * usuario.getUserSex());
    }

    /*Quedas pendiente de hacer 2 metodos que 1 permita cojer la edad y el sexo (corregir entrada de sexo) y otro que calcule*/
}
