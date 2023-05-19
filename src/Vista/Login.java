
package Vista;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;


public class Login extends JFrame {
  JLabel jlTitulo,jlImg;
  JTextField jtIdentificacion;
  JPasswordField jpContraseña;
  JButton jbEntrar, jbRegistrase;
  
    public Login(){
         super("Ingresar");
        setSize(400, 500);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);
        getContentPane().setBackground(new Color(10, 77, 104));
        //setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        crearGUI();
        
    
        setVisible(true);
    }
    
    public void crearGUI(){
        
        
        jlImg = new JLabel();
        jlImg.setIcon(new ImageIcon("Login.png"));
        jlImg.setBounds(160, 100, 70, 70); 
        add(jlImg);
        
        
        
        jlTitulo = new JLabel("<html>Login<br></center>");
        jlTitulo.setBounds(50, 10, 300, 60); // este metodo sirve hubbicar en la pantalla 
        jlTitulo.setForeground(Color.WHITE);// estesirve para cambiar el color de la letra
        jlTitulo.setFont(new Font("Arial", Font.BOLD|Font.BOLD,20)); // sirve para cambiar el tipo de letra
        jlTitulo.setHorizontalAlignment(JLabel.CENTER);
        add(jlTitulo);
        
       Border border = BorderFactory.createLineBorder(Color.white, 2);
       
       jtIdentificacion = new JTextField("Identificacion");
       jtIdentificacion.setBounds(90, 200, 200, 30);
       jtIdentificacion.setText("Identificacion");
       jtIdentificacion.setBorder(border);
       jtIdentificacion.addFocusListener(new FocusListener() {
            
            @Override
            public void focusGained(FocusEvent e) {
                if(jtIdentificacion.getText().equals("Identificacion")){
                    jtIdentificacion.setText("");
                }
            }

          
            @Override
            public void focusLost(FocusEvent e) {
                if(jtIdentificacion.getText().isEmpty()){
                    jtIdentificacion.setText("Identificacion");
                }
            }
       });
       jtIdentificacion.setFocusTraversalKeysEnabled(false);
       add(jtIdentificacion);
       
       
       jpContraseña = new JPasswordField("Contraseña");
       jpContraseña.setText("Contraseña");
       jpContraseña.setBorder(border);
       jpContraseña.setBounds( 90, 250, 200, 30);
       jpContraseña.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if(jpContraseña.getText().equals("Contraseña")){
                    jpContraseña.setText("");
                }
            }
            @Override
            public void focusLost(FocusEvent e) {
                if(jpContraseña.getText().isEmpty()){
                    jpContraseña.setText("Contraseña");
                }
            }
        });
        jpContraseña.setFocusTraversalKeysEnabled(false);
        add(jpContraseña);
       
        jbEntrar = new JButton("ENTRAR");
        jbEntrar.setBounds(80, 300, 100, 30);
        jbEntrar.setToolTipText("Entrar");
        jbEntrar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        add(jbEntrar);

        jbRegistrase = new JButton("REGISTRAR");
        jbRegistrase.setBounds(200, 300, 100, 30);
        jbRegistrase.setToolTipText("Registrarse");
        jbRegistrase.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        add(jbRegistrase);
       
       /*
       jtIdentificacion = new JTextField("Identificacion");
       jtIdentificacion.setBounds(90, 250, 200, 30);
       jtIdentificacion.setText("Identificacion");
       jtIdentificacion.setBorder(border);
       jtIdentificacion.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if(jtIdentificacion.getText().equals("Identificacion")){
                    jtIdentificacion.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if(jtIdentificacion.getText().isEmpty()){
                    jtIdentificacion.setText("Identificacion");
                    
                }
            }
       });
       jtIdentificacion.setFocusTraversalKeysEnabled(false);
       add(jtIdentificacion);
       */
       
       
       
       
        
    }
    
    public static void main(String[] args) {
        Login obj = new Login();
    }
    
}
