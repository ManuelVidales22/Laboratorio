package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.Login;
import Vista.Datos;
import Controlador.MenuPrincipal_Control;
import Vista.MenuPrincipal;
import Modelo.Modelo_logica;

public class Login_Controlador implements ActionListener{

    public Login lg;
    public Modelo_logica model;
    Modelo_logica modelo = new Modelo_logica();
    
    public Login_Controlador (Login lg){
       this.lg = lg;
       this.lg.jbEntrar.addActionListener(this);
       this.lg.jbRegistrase.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == lg.jbEntrar){
            if(modelo.logeo(lg.jtIdentificacion.getText(),lg.jpContraseña.getText()).equals(true)){
                MenuPrincipal mp = new MenuPrincipal();
                MenuPrincipal_Control menulogin = new MenuPrincipal_Control(mp);
                lg.setVisible(false);
            }
        }
        if(e.getSource() == lg.jbRegistrase){
            Datos dt = new Datos(); 
            Datos_Controlador objDatos = new Datos_Controlador(dt);

            lg.setVisible(false);
        }
    }
    
}
