import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoDaTela{

    public static void main(String [] args){

        Toolkit A = Toolkit.getDefaultToolkit();
        Dimension B = A.getScreenSize();

        System.out.print("A sua resolução é de: ");
        System.out.println( B.width + " X " + B.height);
    }
}