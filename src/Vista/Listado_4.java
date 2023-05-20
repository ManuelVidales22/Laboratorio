
package Vista;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Listado_4 extends JFrame {
     
    public JLabel jlTitu, jlTitulo;
    public JComboBox<String> jcTipIdentifi;
    public JTextField jtNumeroID;
    public JTextArea jtArea1, jtArea2;
    public JButton jbConsultar, jbVolver;
    
    
    public Listado_4(){
        setTitle("Tipo de identificacion y numero de identificacion.");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        crearGUI();
        //setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setVisible(true);
        
        
    }
    
    public void crearGUI(){
        jlTitulo =  new JLabel("Tipo de documento");
        jlTitulo.setBounds(30, 30, 160, 60); 
        //jlTitulo.setOpaque(true);// esto sirve para poner el fondo blanco del texto 
        jlTitulo.setForeground(Color.BLACK);
        jlTitulo.setFont(new Font("Arial", Font.BOLD|Font.BOLD,16)); 
        jlTitulo.setHorizontalAlignment(JLabel.CENTER);  
     
        add(jlTitulo);
        
        jlTitu =  new JLabel("Numero de ID");
        jlTitu.setBounds(290, 30, 130, 60); 
        //jlTitulo.setOpaque(true);// esto sirve para poner el fondo blanco del texto 
        jlTitu.setForeground(Color.BLACK);
        jlTitu.setFont(new Font("Arial", Font.BOLD|Font.BOLD,16)); 
        jlTitu.setHorizontalAlignment(JLabel.CENTER);  
     
        add(jlTitu);
        
        jcTipIdentifi =   new JComboBox<>();
        jcTipIdentifi.addItem("C.C"); 
        jcTipIdentifi.addItem("T.I"); 
        jcTipIdentifi.setBounds(30, 90, 190, 30);  
        setResizable(false);
        
        add(jcTipIdentifi);
        
        jtNumeroID = new JTextField();
        jtNumeroID.setBounds(280, 90, 190, 30);
        add(jtNumeroID);
        
        jtArea1 = new JTextArea();
       jtArea1.setLineWrap(true);
       jtArea1.setWrapStyleWord(true);
       JScrollPane js = new JScrollPane(jtArea1);        
       js.setBounds(30, 130, 190, 240);
       add(js);
       
       jtArea2 = new JTextArea();
       jtArea2.setLineWrap(true);
       jtArea2.setWrapStyleWord(true);
       JScrollPane js1 = new JScrollPane(jtArea2);        
       js1.setBounds(280, 130, 190, 240);
       add(js1);
       
       
       jbConsultar =  new JButton("Consultar");
       jbConsultar.setBounds(130, 380, 100, 30);
       add(jbConsultar);
       
       
       jbVolver =  new JButton("Volver");
       jbVolver.setBounds(270, 380, 100, 30);
       add(jbVolver);
        
    }
    
    
    /*
    public static void main(String[] args) {
        Listado_4 obj = new Listado_4();
    }
    */
}
