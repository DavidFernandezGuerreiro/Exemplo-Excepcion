
package exemploexcepcion;

import javax.swing.JOptionPane;

/**
 *
 * @author dfernandezguerreiro
 */
public class VariosCatch {
    private int numerador;
    private int denominador;

    public VariosCatch() {
    }
    
    public void dividirCapturaVariosCatch(){
        try{
            numerador=Integer.parseInt(JOptionPane.showInputDialog("teclea numerador : "));
            denominador=Integer.parseInt(JOptionPane.showInputDialog("teclea numerador : "));
        

            int resultado=numerador/denominador;
            System.out.println(numerador+"/"+denominador+" = "+resultado);
        }catch(ArithmeticException e){
            System.out.println("Erro1, non se pode dividir entre 0");
        }catch(NumberFormatException e2){
            System.out.println("Erro2"+e2.toString());
        }
    }
}
