
package exemploexcepcion;

/**
 *
 * @author dfernandezguerreiro
 */
public class NosaExcepcion extends Exception{
    
    public NosaExcepcion(){
        super(" información da excepción ");
    }
    public NosaExcepcion(String mensaxe){
        super(mensaxe);
    }
    
}
