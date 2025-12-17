package Main;

import clases.Usuario;

public class main {
    static void main(String[] args){

        Usuario user1 = new Usuario(1010246356, "Brayan", "M", 26, 80, 1.74, 32.5, 60.0);

        System.out.println(user1.info());
    }
}
