
package Vista;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class MenuPrincipal extends JFrame{
    
    public JButton jbNuevo, jbConsID, jbListado, jbEstadis, jbAcercaDE;
    JLabel jlTutilo;
    
    public MenuPrincipal(){
        super("Menu principal");// creacion del JFrame
		//configuracion del JFrame
		setSize(400, 500); //px en ancho y alto
		//setLocation(100, 30);
		setLocationRelativeTo(null);
		//setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null); // asignar un diseño libre
		crearGUI();
				
		setVisible(true);
        
    }
    
    public void crearGUI(){
        
        jlTutilo =  new JLabel("Menu principal");
        jlTutilo.setBounds(50, 10, 300, 60); 
        //jlTitulo.setOpaque(true);// esto sirve para poner el fondo blanco del texto 
        jlTutilo.setForeground(Color.BLACK);
        jlTutilo.setFont(new Font("Arial", Font.BOLD|Font.BOLD,20)); 
        jlTutilo.setHorizontalAlignment(JLabel.CENTER);  
     
        add(jlTutilo);
        
        
        jbNuevo =  new JButton("Nuevo");
        jbNuevo.setBounds(100, 70 , 200, 30);
        add(jbNuevo);
        
        jbConsID =  new JButton("Consultar ID");
        jbConsID.setBounds(100, 120 , 200, 30);
        add(jbConsID);
        
        
        jbListado =  new JButton("Listados");
        jbListado.setBounds(100, 170 , 200, 30);
        add(jbListado);
        
        jbEstadis =  new JButton("Estadisticas");
        jbEstadis.setBounds(100, 220 , 200, 30);
        add(jbEstadis);
        
        jbAcercaDE =  new JButton("Acerca de...");
        jbAcercaDE.setBounds(100, 270 , 200, 30);
        add(jbAcercaDE);
        
        
    }
    
    public static void main(String[] args) {
        MenuPrincipal obj = new MenuPrincipal();
    }
}
