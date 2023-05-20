/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
 
 

public class Listado_2 extends JFrame{
    
    public JTextArea jtArea1, jtArea2;
    public JButton jbVolver, jbConsultar;
    public JComboBox<String> jcCombo1, jcGenero;
    public JLabel jlTitu, jlTitulo;
    
    public Listado_2(){
        setTitle("Listado codigo del plan  y  genero.");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        crearGUI();
        //setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setVisible(true);
    }
    
    public void crearGUI(){
        
        
        jlTitulo =  new JLabel("Codigo del plan");
        jlTitulo.setBounds(50, 10, 130, 60); 
        //jlTitulo.setOpaque(true);// esto sirve para poner el fondo blanco del texto 
        jlTitulo.setForeground(Color.BLACK);
        jlTitulo.setFont(new Font("Arial", Font.BOLD|Font.BOLD,16)); 
        jlTitulo.setHorizontalAlignment(JLabel.CENTER);  
     
        add(jlTitulo);
        
        jlTitu =  new JLabel("Genero");
        jlTitu.setBounds(280, 10, 130, 60); 
        //jlTitulo.setOpaque(true);// esto sirve para poner el fondo blanco del texto 
        jlTitu.setForeground(Color.BLACK);
        jlTitu.setFont(new Font("Arial", Font.BOLD|Font.BOLD,16)); 
        jlTitu.setHorizontalAlignment(JLabel.CENTER);  
     
        add(jlTitu);
        
        
        jcCombo1 = new JComboBox<>();
        jcCombo1.addItem("2724"); // Tecnologia desarrollo de soft
        jcCombo1.addItem("2725"); // Tec en electronica inductrial
        jcCombo1.addItem("3841"); // Contaduria 
        jcCombo1.setBounds(30, 60, 180, 30); 
        setResizable(false);
        add(jcCombo1);
        
        jcGenero = new JComboBox<>();
        jcGenero.addItem("M"); 
        jcGenero.addItem("F");
        jcGenero.addItem("Otro");
        jcGenero.setBounds(260, 60, 180, 30);  
        setResizable(false);
        
        add(jcGenero);
        
       jtArea1 = new JTextArea();
       jtArea1.setLineWrap(true);
       jtArea1.setWrapStyleWord(true);
       JScrollPane js = new JScrollPane(jtArea1);        
       js.setBounds(30, 120, 180, 240);
       add(js);
       
       jtArea2 = new JTextArea();
       jtArea2.setLineWrap(true);
       jtArea2.setWrapStyleWord(true);
       JScrollPane js1 = new JScrollPane(jtArea2);        
       js1.setBounds(260, 120, 180, 240);
       add(js1);
        
       jbConsultar =  new JButton("Consultar");
       jbConsultar.setBounds(120, 400, 100, 30);
       add(jbConsultar);
       
       
       jbVolver =  new JButton("Volver");
       jbVolver.setBounds(250, 400, 100, 30);
       add(jbVolver);
        
    }
    /*
    public static void main(String[] args) {
        Listado_2 obj = new Listado_2();
    }
    */
}
