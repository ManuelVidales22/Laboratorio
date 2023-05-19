
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


public class DatosPersonales  extends JFrame {
    
    JComboBox<String> jcIdent, jcGenero;
    JLabel  jlTitu,jlTitu1, jlNumIde, jlApe, jlNom, jlFechaN, jlCiuRe,jlDire, jlCorreo;
    JTextField jtNumIde, jtApe, jtNom, jtCiuRe,jtDire, jtCorreo;
    JTextArea jTObser;
    
    public JSpinner jsFechaNac;
    public JButton jbGuardar, jbVolver, jbSiguiente, jbLimpiar;
    public SpinnerDateModel sdm;
    //public MenuPrincipal mp;
    
    public DatosPersonales (){
    super("Datos Personales");
    
        setSize(400, 700);
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
        
       jlTitu1 = new JLabel("Observaciones");
       jlTitu1.setBounds(150, 410, 190, 30);
       jlTitu1.setForeground(Color.BLACK);
       
       add(jlTitu1);
        
       jTObser = new JTextArea();
       jTObser.setLineWrap(true);
       jTObser.setWrapStyleWord(true);
       JScrollPane js = new JScrollPane(jTObser);        
       js.setBounds(60, 440, 260, 80);
       add(js);
       
       jbGuardar = new JButton("Guardar");
       jbGuardar.setBounds(60, 540, 100, 30);
       add(jbGuardar);
       
       
       jbLimpiar =  new JButton("Limpiar");
       jbLimpiar.setBounds(220, 540, 100, 30);
       add(jbLimpiar);
       
       
       jbSiguiente =  new JButton("Siguiente");
       jbSiguiente.setBounds(200, 580, 100, 30);
       add(jbSiguiente);
       
       
       jbVolver =  new JButton("Volver");
       jbVolver.setBounds(80, 580, 100, 30);
       add(jbVolver);
       
        
        
    }
 
     
      public static void main(String[] args) {
          DatosPersonales onj =  new DatosPersonales();
          
      }
    
    
   
}
