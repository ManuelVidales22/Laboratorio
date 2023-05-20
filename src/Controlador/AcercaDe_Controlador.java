
package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Vista.AcercaDe;

public class AcercaDe_Controlador implements ActionListener {
    public AcercaDe ac;

    public AcercaDe_Controlador(AcercaDe ac) {
        this.ac = ac;
        this.ac.jbcerrar.addActionListener(this);

    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ac.jbcerrar) {
            JOptionPane.showMessageDialog(ac, "Cerrando ventana Acerca de");
            ac.dispose();
        }

    }

    /*public static void main(String[] args) {
        AcercaDe obj = new AcercaDe();
        AcercaDe_Controlador obj2 = new AcercaDe_Controlador(obj);
    }*/


}
