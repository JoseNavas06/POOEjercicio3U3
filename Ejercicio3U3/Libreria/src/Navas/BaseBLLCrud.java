
package Navas;

import java.io.IOException;


public interface BaseBLLCrud <T> {
    public void crear();
    public void consultar(String id)throws IOException;
    public void actualizar() throws IOException;
    public void eliminar()throws IOException;
    
    
}
