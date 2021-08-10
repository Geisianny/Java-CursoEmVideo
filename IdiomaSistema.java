/*Desafio 1 */
import java.util.Locale; /*Biblioteca do idioma */

public class IdiomaSistema{

    public static void main(String [] args){

        Locale idioma = Locale.getDefault();

        System.out.print("O idioma do Sistema é: ");
        System.out.println(idioma.toString());
    }
}