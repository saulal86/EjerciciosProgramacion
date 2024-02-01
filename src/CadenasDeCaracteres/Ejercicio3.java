package CadenasDeCaracteres;

import java.util.Scanner;

public class Ejercicio3 {
    Character[] letras;

    public void cuentaLetras() {
        Scanner scanner = new Scanner(System.in);
        String frase = "";
        System.out.println("Escribe una frase: ");
        frase = scanner.nextLine();
        while (!frase.equals("fin") && !frase.equals("FIN")) {
            System.out.println("Escribe otra frase: ");

            for (int i = 0; i < frase.length(); i++) {
                char c = buscaCaracteres(frase);
                System.out.println(c);
                if (c != ' ') {
                    break;
                }
            }
            scanner = new Scanner(System.in);
            frase = scanner.nextLine();
        }
    }


    public char buscaCaracteres(String frase) {
        int cont = 0;
        char c = ' ';
        for (int i = 0; i < frase.length(); i++) {
            c = frase.charAt(i);
            cont = 0;
            for (int j = 0; j < frase.length(); j++) {
                if (c == frase.charAt(j)) {
                    cont++;
                }
            }
            if (cont <= 1) {
                return c;
            }

        }
        return ' ';
    }

    public static void main(String[] args) {
        Ejercicio3 e = new Ejercicio3();
        e.cuentaLetras();
    }
}

