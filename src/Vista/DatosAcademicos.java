
package Vista;

import java.awt.Color;
import java.awt.Font;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;



public class DatosAcademicos extends JFrame{
    
    JComboBox<String> jcCombo, jJornada;
    JTextField jtNomplan;
    JLabel jlFecha, jlNomp, jlTitulo;
    ////////////////////////////////
     JSpinner jsNumeros, jsTexto, jsFecha;
     JButton jbGuardar, jbVolver;
    SpinnerDateModel sdm;
    
    public DatosAcademicos(){
     super("Datos Academicos");
     
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        crearGUI();
        //setDefaultCloseOperation(DO_NOTHING_ON_CLOSE); 
        setVisible(true);
        
   }
    public void crearGUI(){
        jlTitulo = new JLabel("<html>Datos Academicos<br></center>");
        jlTitulo.setBounds(50, 10, 300, 60); // este metodo sirve hubbicar en la pantalla 
        jlTitulo.setForeground(Color.BLACK);// estesirve para cambiar el color de la letra
        jlTitulo.setFont(new Font("Arial", Font.BOLD|Font.BOLD,20)); // sirve para cambiar el tipo de letra
        jlTitulo.setHorizontalAlignment(JLabel.CENTER);  // Sirve para centrar el texto 
        
        add(jlTitulo);
        
        // Codigo del plan
        jcCombo = new JComboBox<>();
        jcCombo.addItem("Codigo del Plan");
        jcCombo.addItem("2724"); // Tecnologia desarrollo de soft
        jcCombo.addItem("2725"); // Tec en electronica inductrial
        jcCombo.addItem("3841"); // Contaduria 
        jcCombo.addItem("3845"); // Adminstracion de empresas
        jcCombo.addItem("3857"); // Comercio exterior
        jcCombo.addItem("3553"); // Comunicasion solical
        jcCombo.setBounds(30, 60, 330, 30); 
        setResizable(false);
        add(jcCombo);
        
        
       jlNomp = new JLabel("Nombre del plan: ");
       jlNomp.setBounds(30, 120, 120, 30);
       add(jlNomp);
       
       jtNomplan =  new JTextField();
       jtNomplan.setBounds(130, 120, 230, 30);
       add(jtNomplan);
        
       
       jlFecha = new JLabel("Fecha de ingreso: ");
       jlFecha.setBounds(30, 230, 120, 30);
       add(jlFecha);
       
       /////////// JSpinner 22:43
        Calendar cal = Calendar.getInstance();
        Date initDate = cal.getTime();
        cal.add(Calendar.YEAR, -100);
        Date finDate = cal.getTime();
        cal.add(Calendar.YEAR, 200);
        
        Date actual = cal.getTime();
        sdm = new SpinnerDateModel(initDate, finDate, actual, Calendar.YEAR);
        jsFecha = new JSpinner(sdm);
        jsFecha.setBounds(150, 230, 210, 30);
        add(jsFecha);
       
       ///////////
    
        // Jornada 
        jJornada = new JComboBox<>();
        jJornada.addItem("Jornada");
        jJornada.addItem("Diurna"); 
        jJornada.addItem("Nocturna"); 
        jJornada.setBounds(30, 180, 330, 30);
        setResizable(false);
        add(jJornada);
        
        
        jbVolver =  new JButton("Volver");
        jbVolver.setBounds(60,300, 120, 30);
        //jbGuardar.addActionListener(mpc);
        add(jbVolver);
        
        
        jbGuardar =  new JButton("Guardar");
        jbGuardar.setBounds(210,300, 120, 30);
        //jbGuardar.addActionListener(mpc);
        add(jbGuardar);
        
    }
    
    public static void main(String[] args) {
        DatosAcademicos obj = new DatosAcademicos();
    }
    
    
}
