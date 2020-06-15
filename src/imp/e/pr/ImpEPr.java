
package imp.e.pr;
import java.util.Scanner;
public class ImpEPr {

   
    public static void main(String[] args) {
            Scanner entrada = new Scanner (System.in);
        System.out.println ("Digite um nÃºmero:");
        int n = entrada.nextInt();
        if (n % 2 == 0)
            System.out.println("Par");
        else
            System.out.println("Impar");
        
    }
    
}
