
package exemploexcepcion;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dfernandezguerreiro
 */
public class ExemploExcepcion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CapturaExcepcion obx1=new CapturaExcepcion();
        //obx1.dividirCaptura();
        
        //VariosCatch obx2=new VariosCatch();
        //obx2.dividirCapturaVariosCatch();
        //System.out.println(" REMATA O PROGRAMA ");
        
        //ConFinally obx3=new ConFinally();
        //obx3.dividirCapturaVariosCatch();
        
        //PropagarExcepcion obx4=new PropagarExcepcion();
        //try{
            //obx4.dividirPropagaExcepcion(); //Lanza la excepcion desde PropagarExcepcion
        //}catch(ArithmeticException ex){
            //System.out.println(ex.getMessage());
        //}
        
        DividirCaNosaExcepcion obx5=new DividirCaNosaExcepcion();
        try {
            obx5.diCaNosaExcepcion();
        } catch (NosaExcepcion ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
