
package exemploexcepcion;

import javax.swing.JOptionPane;

/**
 *
 * @author dfernandezguerreiro
 */
public class CapturaExcepcion {
    private int numerador;
    private int denominador;

    public CapturaExcepcion() {
    }
    
    public void dividirCaptura(){
        numerador=Integer.parseInt(JOptionPane.showInputDialog("teclea numerador : "));
        denominador=Integer.parseInt(JOptionPane.showInputDialog("teclea numerador : "));
        
        try{
            int resultado=numerador/denominador;
            System.out.println(numerador+"/"+denominador+" = "+resultado);
        }catch(ArithmeticException e){
            System.out.println("Non se pode dividir entre 0");
            //System.out.println(e.getMessage()); -> Mensajes de java
            //System.out.println(e.toString()); -> MEnsajes de java
            //e.printStackTrace(); -> Mensajes de java
        }
    }
}
