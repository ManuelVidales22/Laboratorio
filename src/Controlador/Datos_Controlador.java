
package Controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import Vista.Datos;
import Vista.MenuPrincipal;
import Modelo.Modelo_logica;
import Controlador.MenuPrincipal_Control;

import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Datos_Controlador implements ActionListener{
    public Datos dt;
    public Modelo_logica model;
    Modelo_logica modelo = new Modelo_logica();
    public Datos_Controlador (Datos dt){
       this.dt = dt;
       this.dt.jbGuardar.addActionListener(this);
       this.dt.jbVolver.addActionListener(this);
       this.dt.jbLimpiar.addActionListener(this);
        
    }
    public void limpieza(){
        // Establecer el texto vacío para cada campo de texto y el área de texto
        dt.jtNumIde.setText("");
        dt.jtApe.setText("");
        dt.jtNom.setText("");
        dt.jtCiuRe.setText("");
        dt.jtDire.setText("");
        dt.jtCorreo.setText("");
        dt.jtContraseña.setText("");
        dt.jtNomplan.setText("");
        dt.jTObser.setText("");
        
    
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == dt.jbGuardar){
            String tipo = dt.jcIdent.getSelectedItem().toString();
            String numIde = dt.jtNumIde.getText();
            String ape = dt.jtApe.getText();
            String nom = dt.jtNom.getText();
            String genero = dt.jcGenero.getSelectedItem().toString();
            String fechaN = dt.jsFechaNac.getValue().toString();
            String ciuRe = dt.jtCiuRe.getText();
            String dire = dt.jtDire.getText();
            String correo = dt.jtCorreo.getText();
            String password = dt.jtContraseña.getText();
            String observacion = dt.jTObser.getText();

            String codPlan = dt.jcCombo.getSelectedItem().toString();
            String nomPlan = dt.jtNomplan.getText();
            String jornada = dt.jJornada.getSelectedItem().toString();
            String fechaI = dt.jsFecha.getValue().toString();

            modelo.guardar(tipo, numIde, nom, ape, genero, fechaN, ciuRe, dire, correo, observacion, password, codPlan, nomPlan, jornada, fechaI);
            int opcion = JOptionPane.showConfirmDialog(null, "¿Desea ingresar otro estudiante?", "Confirmación", JOptionPane.YES_NO_OPTION);
        
        if (opcion == JOptionPane.YES_OPTION) {
            // Código para ingresar otro estudiante
            limpieza();
        } else {
            MenuPrincipal mp = new MenuPrincipal();
            MenuPrincipal_Control menulogin = new MenuPrincipal_Control(mp);
            dt.setVisible(false);
            
        }
            
            
        }

        if(e.getSource() == dt.jbLimpiar){
            dt.jtNumIde.setText("");
            dt.jtApe.setText("");
            dt.jtNom.setText("");
            dt.jtCiuRe.setText("");
            dt.jtDire.setText("");
            dt.jtCorreo.setText("");
            dt.jtContraseña.setText("");
            dt.jtNomplan.setText(""); 
    
            JOptionPane.showMessageDialog(null, "Se han limpiado los datos", "Información", JOptionPane.INFORMATION_MESSAGE);
        }

        if(e.getSource() == dt.jbVolver){
            MenuPrincipal mp = new MenuPrincipal();
            MenuPrincipal_Control menulogin = new MenuPrincipal_Control(mp);
            dt.setVisible(false);
        }
        
    }
    
}
