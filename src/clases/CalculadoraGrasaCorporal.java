package clases;

public class CalculadoraGrasaCorporal {
    //La responsabilidad de esta clase es calcula el porcentaje de grasa corporal

    //metodos
    public static double calcularGrasa(double imc, int userAge, int userSex){
        return (1.20 * imc) + (0.23 * userAge) - (10.8 * userSex);
    }
    /*Fórmula: %Grasa = (1.20 × IMC) + (0.23 × Edad) − (10.8 × Sexo) − 5.4
    Nota: Sexo = 1 para hombres, 0 para mujeres*/


}
