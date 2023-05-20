
package Vista;

import java.awt.Color;
import java.awt.Font;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;


public class Datos extends JFrame{
    
    public JComboBox<String> jcIdent;
    public JComboBox<String> jcGenero;
    public JComboBox<String> jcCombo;
    public JComboBox<String> jJornada;
    JLabel  jlTitu,jlTitu1, jlNumIde, jlApe, jlNom, jlFechaN, jlCiuRe,jlDire, jlCorreo, jlContraseña, jlFecha, jlNomp, jlTitulo;
    public JTextField jtNumIde;
    public JTextField jtApe;
    public JTextField jtNom;
    public JTextField jtCiuRe;
    public JTextField jtDire;
    public JTextField jtCorreo;
    public JTextField jtContraseña;
    public JTextField jtNomplan;
    public JTextArea jTObser;
    
    public JSpinner jsFechaNac,jsNumeros, jsTexto, jsFecha;
    public JButton jbGuardar, jbVolver, jbColsultar, jbLimpiar;
    public SpinnerDateModel sdm;
    
    
    
    public Datos(){
        setTitle("Datos");
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
        add(jtApe);
        
        
        
        jlNom = new JLabel("Nombre:");
        jlNom.setBounds(30, 180, 150, 30);
        add(jlNom);
        
        
        jtNom =  new JTextField();
        jtNom.setBounds(90, 180, 180, 30);
        add(jtNom);
        
        
        jcGenero = new JComboBox<>();
        jcGenero.addItem("Genero");
        jcGenero.addItem("M"); 
        jcGenero.addItem("F");
        jcGenero.addItem("Otro");
        jcGenero.setBounds(30, 220, 240, 30);  
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
        add(jsFechaNac);
       
       ///////////
        
       jlCiuRe =  new JLabel("Cuidad de recidencia:");
       jlCiuRe.setBounds(30, 300,  150, 30);
       add(jlCiuRe);
       
       
       jtCiuRe = new JTextField();
       jtCiuRe.setBounds(160, 300, 200, 30);
       add(jtCiuRe); 
       
       
       jlDire = new JLabel("Direccion de residencia:");
       jlDire.setBounds(30, 340, 190, 30);
        add(jlDire);
        
        
       jtDire = new JTextField();
       jtDire.setBounds(180, 340, 180, 30);
       add(jtDire);  
       
       jlCorreo = new JLabel("Correo electronico:");
       jlCorreo.setBounds(30, 380, 190, 30);
       add(jlCorreo);
        
       jtCorreo =  new JTextField();
       jtCorreo.setBounds(160, 380, 200, 30);
       add(jtCorreo);
        
       
       jlContraseña = new JLabel("Crear contraseña:");
       jlContraseña.setBounds(30, 420, 190, 30);
       add(jlContraseña);
       
       jtContraseña =  new JTextField();
       jtContraseña.setBounds(160, 420, 200, 30);
       add(jtContraseña);
       
       jlTitu1 = new JLabel("Observaciones");
       jlTitu1.setBounds(150, 450, 190, 30);
       jlTitu1.setForeground(Color.BLACK);
       
       add(jlTitu1);
       
       jTObser = new JTextArea();
       jTObser.setLineWrap(true);
       jTObser.setWrapStyleWord(true);
       JScrollPane js = new JScrollPane(jTObser);        
       js.setBounds(60, 480, 260, 60);
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
        jcCombo.addItem("3845"); // Adminstracion de empresas
        jcCombo.addItem("3857"); // Comercio exterior
        jcCombo.addItem("3553"); // Comunicasion solical
        jcCombo.setBounds(400, 60, 330, 30); 
        setResizable(false);
        add(jcCombo);
        
        
       jlNomp = new JLabel("Nombre del plan: ");
       jlNomp.setBounds(400, 100, 120, 30);
       add(jlNomp);
       
       jtNomplan =  new JTextField();
       jtNomplan.setBounds( 500, 100, 230, 30);
       add(jtNomplan);
       
       // Jornada 
        jJornada = new JComboBox<>();
        jJornada.addItem("Jornada");
        jJornada.addItem("Diurna"); 
        jJornada.addItem("Nocturna"); 
        jJornada.setBounds(400, 140, 330, 30);
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
        add(jsFecha);
       
        
       
        
       /////////////////////BOTONES//////////////////////////77
       jbGuardar = new JButton("Guardar");
       jbGuardar.setBounds(260, 550, 100, 30);
       add(jbGuardar);
       
       
       jbLimpiar =  new JButton("Limpiar");
       jbLimpiar.setBounds(440, 550, 100, 30);
       add(jbLimpiar); 
       
       jbVolver =  new JButton("Volver");
       jbVolver.setBounds(350, 590, 100, 30);
       add(jbVolver);
        
    }
    
    
    
}
