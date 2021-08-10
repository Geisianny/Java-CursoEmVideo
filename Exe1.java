/*Hora do Sistema */
import java.util.Date; /*Biblioteca Date */

public class Exe1{

    public static void main(String [] args){
        
        Date relogio = new Date();  /*relogio -> objeto */

        System.out.println("A hora do sistema é : "); 
        System.out.println(relogio.toString());  /*dia / mes/ hora/ minutos/ segundo/ ano */
    }
}