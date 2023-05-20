
package Vista;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class Listados  extends JFrame{
    public JComboBox<String> jcList;
    public JLabel jlTitulo;
    public JButton jbConsultar;
            
            
    public Listados(){
        setTitle("Listados");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        crearGUI();
        //setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setVisible(true);
    }
    public void crearGUI(){
        
        jlTitulo =  new JLabel("Listados");
        jlTitulo.setBounds(50, 60, 300, 60); 
        //jlTitulo.setOpaque(true);// esto sirve para poner el fondo blanco del texto 
        jlTitulo.setForeground(Color.BLACK);
        jlTitulo.setFont(new Font("Arial", Font.BOLD|Font.BOLD,20)); 
        jlTitulo.setHorizontalAlignment(JLabel.CENTER);  
     
        add(jlTitulo);
        
        
        jcList =  new JComboBox<>();
        jcList.addItem("Listado 1");
        jcList.addItem("Listado 2"); 
        jcList.addItem("Listado 3");
        jcList.addItem("Listado 4"); 
        jcList.setBounds(30, 110, 330, 30);  
        setResizable(false);
        
        add(jcList);
        
       jbConsultar =  new JButton("Consultar");
       jbConsultar.setBounds(150, 170, 100, 30);
       add(jbConsultar);
        
    }
    
    /*
    public static void main(String[] args) {
        Listados obj = new Listados();
    }
*/
    
}
