
package Vista;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class Listado_1 extends JFrame{
    
    public JLabel jlTitulo;
    public JTextArea jtCampo;
    public JButton jbVolver;
    
    public Listado_1(){
        setTitle("Listado General");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        crearGUI();
        //setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setVisible(true);
    }
    
    
    public void crearGUI(){
        jlTitulo =  new JLabel("Listado General");
        jlTitulo.setBounds(50, 10, 300, 60); 
        //jlTitulo.setOpaque(true);// esto sirve para poner el fondo blanco del texto 
        jlTitulo.setForeground(Color.BLACK);
        jlTitulo.setFont(new Font("Arial", Font.BOLD|Font.BOLD,20)); 
        jlTitulo.setHorizontalAlignment(JLabel.CENTER);  
     
        add(jlTitulo);
        
       jtCampo = new JTextArea();
       jtCampo.setLineWrap(true);
       jtCampo.setWrapStyleWord(true);
       JScrollPane js = new JScrollPane(jtCampo);        
       js.setBounds(30, 60, 330, 240);
       add(js);
       
       
       jbVolver =  new JButton("Volver");
       jbVolver.setBounds(150, 310, 100, 30);
       add(jbVolver);
       
        
    }
    /*
    public static void main(String[] args) {
        Listado_1 obj = new Listado_1();
    }
    */
    
}
