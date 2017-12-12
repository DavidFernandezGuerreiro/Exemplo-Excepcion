
package exemploexcepcion;

import javax.swing.JOptionPane;

/**
 *
 * @author dfernandezguerreiro
 */
public class PropagarExcepcion {
    private int numerador;
    private int denominador;

    public PropagarExcepcion() {
    }
    
    public void dividirPropagaExcepcion() throws ArithmeticException{
        numerador=Integer.parseInt(JOptionPane.showInputDialog("teclea numerador : "));
        denominador=Integer.parseInt(JOptionPane.showInputDialog("teclea numerador : "));
            
        if(denominador==0)
            throw new ArithmeticException("***** non dividas entre 0 *****");
        System.out.println("resultado = "+numerador/denominador);
    }
}
