
package Vista;

import java.awt.Color;
import java.awt.Font;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;

public class Consultar_ID extends JFrame {
    
    public JComboBox<String> jcIdent, jcGenero,jcCombo, jJornada;
    public JLabel  jlTitu,jlTitu1, jlNumIde, jlApe, jlNom, jlFechaN, jlCiuRe,jlDire, jlCorreo, jlContraseña, jlFecha, jlNomp, jlTitulo;
    public JTextField jtNumIde, jtApe, jtNom, jtCiuRe,jtDire, jtCorreo, jtContraseña, jtNomplan;
    public JTextArea jTObser;
    
    public JSpinner jsFechaNac,jsNumeros, jsTexto, jsFecha;
    public JButton  jbVolver, jbConsultar;
    public SpinnerDateModel sdm;
    
    public Consultar_ID(){
        setTitle("Consular_ID");
        setSize(800, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        crearGUI();
        //setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setVisible(true);
        
    }
    
    public void crearGUI(){
        jlTitu =  new JLabel("Datos personales");
        jlTitu.setBounds(50, 10, 300, 60); 
        //jlTitulo.setOpaque(true);// esto sirve para poner el fondo blanco del texto 
        jlTitu.setForeground(Color.BLACK);
        jlTitu.setFont(new Font("Arial", Font.BOLD|Font.BOLD,20)); 
        jlTitu.setHorizontalAlignment(JLabel.CENTER);  
     
        add(jlTitu);
        
        
        jcIdent =  new JComboBox<>();
        jcIdent.addItem("Tipo de identificacion");
        jcIdent.addItem("C.C"); 
        jcIdent.addItem("T.I"); 
        jcIdent.setBounds(30, 60, 330, 30);  
        setResizable(false);
        
        add(jcIdent);
        
        jlNumIde =  new JLabel("Numero de idenificacion: ");
        jlNumIde.setBounds( 30 , 100, 150, 30);
        add(jlNumIde);
        
        
        jtNumIde =  new JTextField();
        jtNumIde.setBounds( 180 , 100, 180, 30);
        add(jtNumIde);
        
        
        jlApe = new JLabel("Apellido:");
        jlApe.setBounds(30, 140, 150, 30);
        add(jlApe);
        
        
        jtApe =  new JTextField();
        jtApe.setBounds(90, 140, 180, 30);
        jtApe.setEnabled(false);
        add(jtApe);
        
        
        
        jlNom = new JLabel("Nombre:");
        jlNom.setBounds(30, 180, 150, 30);
        add(jlNom);
        
        
        jtNom =  new JTextField();
        jtNom.setBounds(90, 180, 180, 30);
        jtNom.setEnabled(false);
        add(jtNom);
        
        
        jcGenero = new JComboBox<>();
        jcGenero.addItem("Genero");
        jcGenero.addItem("M"); 
        jcGenero.addItem("F");
        jcGenero.addItem("Otro");
        jcGenero.setBounds(30, 220, 240, 30);
        jcGenero.setEnabled(false);
        setResizable(false);
        
        add(jcGenero);
        
        
        jlFechaN = new JLabel("Fecha de nacimiento:");
        jlFechaN.setBounds(30, 260, 150, 30);
        add(jlFechaN);
        
        
        
        
        /////////// JSpinner 22:43
        Calendar cal = Calendar.getInstance();
        Date initDate = cal.getTime();
        cal.add(Calendar.YEAR, -100);
        Date finDate = cal.getTime();
        cal.add(Calendar.YEAR, 200);
        
        Date actual = cal.getTime();
        sdm = new SpinnerDateModel(initDate, finDate, actual, Calendar.YEAR);
        jsFechaNac = new JSpinner(sdm);
        jsFechaNac.setBounds(160, 260, 160, 30);
        jsFechaNac.setEnabled(false);
        add(jsFechaNac);
       
       ///////////
        
       jlCiuRe =  new JLabel("Cuidad de recidencia:");
       jlCiuRe.setBounds(30, 300,  150, 30);
       add(jlCiuRe);
       
       
       jtCiuRe = new JTextField();
       jtCiuRe.setBounds(160, 300, 200, 30);
       jtCiuRe.setEnabled(false);
       add(jtCiuRe); 
       
       
       jlDire = new JLabel("Direccion de residencia:");
       jlDire.setBounds(30, 340, 190, 30);
        add(jlDire);
        
        
       jtDire = new JTextField();
       jtDire.setBounds(180, 340, 180, 30);
       jtDire.setEnabled(false);
       add(jtDire);  
       
       jlCorreo = new JLabel("Correo electronico:");
       jlCorreo.setBounds(30, 380, 190, 30);
       add(jlCorreo);
        
       jtCorreo =  new JTextField();
       jtCorreo.setBounds(160, 380, 200, 30);
       jtCorreo.setEnabled(false);
       add(jtCorreo);
        
       
      
       
       jlTitu1 = new JLabel("Observaciones");
       jlTitu1.setBounds(150, 430, 190, 30);
       jlTitu1.setForeground(Color.BLACK);
       
       add(jlTitu1);
       
       jTObser = new JTextArea();
       jTObser.setLineWrap(true);
       jTObser.setWrapStyleWord(true);
       JScrollPane js = new JScrollPane(jTObser);        
       js.setBounds(60, 460, 260, 60);
       jTObser.setEnabled(false);
       add(js);
       
       ///////////////////// DATOS ACADEMICOS ////////////////////
       
       jlTitulo = new JLabel("<html>Datos Academicos<br></center>");
        jlTitulo.setBounds(420, 10, 300, 60); // este metodo sirve hubbicar en la pantalla 
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
        jcCombo.setBounds(400, 60, 330, 30); 
        jcCombo.setEnabled(false);
        setResizable(false);
        add(jcCombo);
        
        
       jlNomp = new JLabel("Nombre del plan: ");
       jlNomp.setBounds(400, 100, 120, 30);
       add(jlNomp);
       
       jtNomplan =  new JTextField();
       jtNomplan.setBounds( 500, 100, 230, 30);
       jtNomplan.setEnabled(false);
       add(jtNomplan);
       
       // Jornada 
        jJornada = new JComboBox<>();
        jJornada.addItem("Jornada");
        jJornada.addItem("Diurna"); 
        jJornada.addItem("Nocturna"); 
        jJornada.setBounds(400, 140, 330, 30);
        jJornada.setEnabled(false);
        setResizable(false);
        add(jJornada);
        
       jlFecha = new JLabel("Fecha de ingreso: ");
       jlFecha.setBounds(400, 180, 120, 30);
       add(jlFecha);
       
        
        Calendar cal1 = Calendar.getInstance();
        Date intDate =  cal1.getTime();
        cal1.add(Calendar.YEAR, -100);
        Date fiDate = cal.getTime();
        cal1.add(Calendar.YEAR, 200);
        
        Date actual1 = cal1.getTime();
        
        sdm = new SpinnerDateModel(initDate, finDate, actual, Calendar.YEAR);
        jsFecha = new JSpinner(sdm);
        jsFecha.setBounds(510, 180, 220, 30);
        jsFecha.setEnabled(false);
        add(jsFecha);
       
        
       
        
       /////////////////////BOTONES//////////////////////////77
       jbConsultar = new JButton("Consultar");
       jbConsultar.setBounds(280, 550, 100, 30);
       add(jbConsultar);
       
       
       jbVolver =  new JButton("Volver");
       jbVolver.setBounds(420, 550, 100, 30);
       add(jbVolver); 
       
       
        
    }
    /*
   public static void main(String[] args) {
        Consultar_ID obj = new Consultar_ID();
    }
    */
}
