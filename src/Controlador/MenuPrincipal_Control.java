
package Controlador;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.Modelo_logica;
import Vista.AcercaDe;
import Vista.MenuPrincipal;
import Vista.Datos;
import Vista.Consultar_ID;

import Controlador.Consultar_Controlador;
import Controlador.Login_Controlador;
import Controlador.Datos_Controlador;

public class MenuPrincipal_Control implements ActionListener{
    
    public MenuPrincipal mp;
 

    public MenuPrincipal_Control(MenuPrincipal mp){
       
       this.mp = mp;
       this.mp.jbAcercaDE.addActionListener(this);
       this.mp.jbNuevo.addActionListener(this);
       this.mp.jbConsID.addActionListener(this);
       
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == mp.jbNuevo){
            Datos dt = new Datos(); 
            Datos_Controlador objDatos = new Datos_Controlador(dt);
            mp.setVisible(false);
        }

        if(e.getSource() == mp.jbAcercaDE){
            AcercaDe dr = new AcercaDe(); 
            AcercaDe_Controlador obj = new AcercaDe_Controlador(dr);
            mp.setVisible(false);
        }

        if(e.getSource() == mp.jbConsID){
            Consultar_ID ci = new Consultar_ID(); 
            Consultar_Controlador objconsultar = new Consultar_Controlador(ci);
            mp.setVisible(false);
        }
    }
    
}
