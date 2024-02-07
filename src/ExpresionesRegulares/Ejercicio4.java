package ExpresionesRegulares;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio4 {

    public static void main(String[] args) throws IOException {
        Ejercicio4 e = new Ejercicio4();
        e.lectura();
    }
    public void lectura() throws IOException {
        BufferedReader entrada = new BufferedReader(new FileReader("src/fichero.html"));
        while(entrada.ready()){
            String linea = entrada.readLine();
            if (validar(linea)){
                System.out.println("La linea comprobada es: " + linea + " y es correcta.");
            }else{
                System.out.println("Linea no leida");
            }
        }
    }

    public boolean validar(String html){
        String regex = "<a\\s+href=\"(https://|http://)[a-zA-Z0-9.-]+\"></a>";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(html);
        return matcher.matches();
    }
}
