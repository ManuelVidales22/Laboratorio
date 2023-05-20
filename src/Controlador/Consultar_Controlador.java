package Controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import Controlador.MenuPrincipal_Control;
import Vista.Consultar_ID;
import Vista.MenuPrincipal;
import Modelo.Modelo_logica;
public class Consultar_Controlador implements ActionListener{

    public Consultar_ID ci;
    public Modelo_logica model;
    Modelo_logica modelo = new Modelo_logica();
  
    public Consultar_Controlador (Consultar_ID ci){
       this.ci = ci;
       this.ci.jbConsultar.addActionListener(this);
       this.ci.jbVolver.addActionListener(this);
       
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == ci.jbConsultar){
            String numIde = ci.jtNumIde.getText();
            String datos = modelo.consul_x_id(numIde);
            
            modelo.consul_x_id(numIde);
            String[] arregloDatos = datos.split(";");
            
                System.out.println("***Prueba***");
                for (int i=0;i<arregloDatos.length;i++) {
                    System.out.println(arregloDatos[i]);
                }
                ci.jtNom.setText(arregloDatos[2]);
                ci.jtApe.setText(arregloDatos[3]);
                ci.jtCiuRe.setText(arregloDatos[6]);
                ci.jtDire.setText(arregloDatos[7]);
                ci.jtCorreo.setText(arregloDatos[8]);
                ci.jTObser.setText(arregloDatos[9]);
                ci.jtNomplan.setText(arregloDatos[12]);
                

            //JOptionPane.showMessageDialog(null, "Se han encontrado datos con éxito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        }

        if(e.getSource() == ci.jbVolver){
            MenuPrincipal mp = new MenuPrincipal();
            MenuPrincipal_Control menulogin = new MenuPrincipal_Control(mp);
            ci.setVisible(false);
        }


     }
        
}
    

