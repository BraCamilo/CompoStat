package clases;

public class calculadoraTasaMetabolicaBasal {

    public static double calcular(Usuario u) {
        if (u.getUserSex() == 0) {
            return (10 * u.getUserWeight())
                    + (6.25 * u.getUserHeight() * 100)
                    - (5 * u.getUserAge())
                    - 161;
        } else {
            return (10 * u.getUserWeight())
                    + (6.25 * u.getUserHeight() * 100)
                    - (5 * u.getUserAge())
                    + 5;
        }
    }
}
