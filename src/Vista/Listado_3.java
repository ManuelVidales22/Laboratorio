
package Vista;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Listado_3 extends JFrame {
    
    public JLabel jlTitu, jlTitulo;
    public JTextField jtNombre, jtCiudad;
    public JTextArea jtArea1, jtArea2;
    public JButton jbVolver, jbConsultar;
    
    
    public Listado_3(){
        setTitle("Listado Nombres y Ciudad.");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        crearGUI();
        //setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setVisible(true);
    }
    
    public void crearGUI(){
        jlTitulo =  new JLabel("Nombre");
        jlTitulo.setBounds(50, 10, 130, 60); 
        //jlTitulo.setOpaque(true);// esto sirve para poner el fondo blanco del texto 
        jlTitulo.setForeground(Color.BLACK);
        jlTitulo.setFont(new Font("Arial", Font.BOLD|Font.BOLD,16)); 
        jlTitulo.setHorizontalAlignment(JLabel.CENTER);  
     
        add(jlTitulo);
        
        jlTitu =  new JLabel("Ciudad");
        jlTitu.setBounds(290, 10, 130, 60); 
        //jlTitulo.setOpaque(true);// esto sirve para poner el fondo blanco del texto 
        jlTitu.setForeground(Color.BLACK);
        jlTitu.setFont(new Font("Arial", Font.BOLD|Font.BOLD,16)); 
        jlTitu.setHorizontalAlignment(JLabel.CENTER);  
     
        add(jlTitu);
        
        jtNombre =  new JTextField();
        jtNombre.setBounds(30, 50, 180, 30);
        add(jtNombre);
        
        jtCiudad =  new JTextField();
        jtCiudad.setBounds(280, 50, 180, 30);
        add(jtCiudad);
        
        
       jtArea1 = new JTextArea();
       jtArea1.setLineWrap(true);
       jtArea1.setWrapStyleWord(true);
       JScrollPane js = new JScrollPane(jtArea1);        
       js.setBounds(30, 100, 180, 240);
       add(js);
       
       jtArea2 = new JTextArea();
       jtArea2.setLineWrap(true);
       jtArea2.setWrapStyleWord(true);
       JScrollPane js1 = new JScrollPane(jtArea2);        
       js1.setBounds(280, 100, 180, 240);
       add(js1);
       
       
       jbConsultar =  new JButton("Consultar");
       jbConsultar.setBounds(120, 380, 100, 30);
       add(jbConsultar);
       
       
       jbVolver =  new JButton("Volver");
       jbVolver.setBounds(270, 380, 100, 30);
       add(jbVolver);
       
    }
    
    /*
    public static void main(String[] args) {
        Listado_3 obj = new Listado_3();
        
    }
    */
}
