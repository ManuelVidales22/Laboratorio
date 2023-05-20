
package Controlador;

import Vista.DatosPersonales;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class DatosPersonales_Control implements ActionListener {

    public DatosPersonales objDatPers;
    
    public DatosPersonales_Control(DatosPersonales  obj){
        objDatPers = obj;
        
    }
    
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(objDatPers.jbGuardar)){
            
        }
        if (e.getSource().equals(objDatPers.jbVolver)){
            evento_volver();
        }
        
    }

    private void evento_volver() {
        objDatPers.setVisible(false);
        objDatPers.dispose();
        //objDatPers.mp.setVisible(true);
        
    }
    
}
