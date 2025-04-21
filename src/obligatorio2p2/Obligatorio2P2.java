// Theo Brum 315141 y Juan Pablo Patri 266824
package obligatorio2p2;

import Dominio.Sistema;
import Interfaz.*;

public class Obligatorio2P2 {

    public static void main(String[] args) {
       
        Sistema sistema = new Sistema();
        
        PantallaInicio inicio = new PantallaInicio (sistema);
        inicio.setVisible(true);
        inicio.setLocationRelativeTo(null);
    }
    
}
