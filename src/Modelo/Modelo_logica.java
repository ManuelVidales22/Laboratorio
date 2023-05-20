package Modelo;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JOptionPane;
import java.io.IOException;



public class Modelo_logica {

    private String tipo, Id, nombre, apellido, genero, fecha, ciudad, direccion, correo, password, 
    ob,codPlan, NombrePlan, jornada, fechaIngreso;
    private String IdBuscado, datos = " ";
    private String user, pass;
    
    

    

    public void guardar(String tipo, String Id, String nombre, String apellido, String genero, String fecha, String ciudad, String direccion, String correo, String ob,
    String password, String codPlan, String NombrePlan, String jornada, String fechaIngreso){
        FileWriter fw = null;
        boolean error = false;
        
        
        try {
            fw = new FileWriter("Usuarios.csv", true);
        } catch (Exception e) {
            error = true;
            JOptionPane.showMessageDialog(
                    null, 
                    "Error al crear el archivo\n" + e, 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
        }
        if (!error) {
            //obtener los datos digitos del formulario
            this.tipo = tipo;
            this.Id = Id;
            this.nombre = nombre;
            this.apellido = apellido;
            this.genero = genero;
            this.fecha = fecha;
            this.ciudad = ciudad;
            this.direccion = direccion;
            this.correo = correo;

            this.ob = ob;
            this.password = password;
            this.codPlan = codPlan;
            this.NombrePlan = NombrePlan;
            this.jornada = jornada;
            this.fechaIngreso = fechaIngreso;
                        
            if (buscar(Id)) {
                JOptionPane.showMessageDialog(
                    null, 
                    "El numero de identificacion " + Id + " ya existe en el archivo", 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
            }else{            
                try {
                    fw.write(tipo + ";" + Id + ";" + nombre + ";" + apellido + ";" + genero + ";" + fecha + ";" + ciudad + ";" + direccion + ";" + correo + ";" + ob +";"+
                    password + ";" + codPlan + ";" + NombrePlan + ";" + jornada + ";" + fechaIngreso+"\r\n");
                    JOptionPane.showMessageDialog(null, 
                            "Se guardo con exito el registro");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(
                        null, 
                        "Error al guardar en el archivo\n" + e, 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE);
                }
                try {
                    fw.close();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(
                        null, 
                        "Error al cerrar el archivo\n" + e, 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE);
                }
            }// fin del else
        } // fin if (!error)
    }


    public boolean buscar(String id_buscar){
        FileReader fr = null;
        boolean error = false, existe = false;
        try {
            fr = new FileReader("Usuarios.csv");
        } catch (Exception e) {
            error = true;
            JOptionPane.showMessageDialog(
                    null, 
                    "Error al abrir el archivo\n" + e, 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
        }
        if (!error) {
            String registro = "";
            BufferedReader br = new BufferedReader(fr);
            String tokens[];
            try {
                while ((registro = br.readLine()) != null) {                    
                    //System.out.println(registro);
                    tokens = registro.split(";");
                    if(tokens[0].equals(id_buscar)){
                        existe = true;
                        break;
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(
                    null, 
                    "Error al leer el archivo\n" + e, 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
            }
            try {
                fr.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(
                    null, 
                    "Error al cerrar el archivo\n" + e, 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
            }
        }// fin if (!error)
        return existe;
    }
 /// metodo consultar por id
 public String consul_x_id(String IdBuscado){
    FileReader fr = null;
    boolean error = false, existe = false;
    try {
        fr = new FileReader("Usuarios.csv");
    } catch (Exception e) {
        error = true;
        JOptionPane.showMessageDialog(
                null, 
                "Error al abrir el archivo\n" + e, 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
    }
    if (!error) {
        String registro = "";
        BufferedReader br = new BufferedReader(fr);
        String tokens[];
        // obtener el codigo a buscar del formulario
        this.IdBuscado = IdBuscado;
        
        try {
            while ((registro = br.readLine()) != null) {                    
                //System.out.println(registro);
                tokens = registro.split(";");
                
                if (tokens[1].equals(IdBuscado)) { //aqui modificar
                    existe = true;
                    for (int i = 0; i < tokens.length; i++) {
                        datos += tokens[i]+";";
                        
                    }
                    break;
                }
                break;
            }
            if (!existe) {
                JOptionPane.showMessageDialog(
                    null, 
                    "El estudiante con codigo " + IdBuscado + " no existe.", 
                    "Advertencia", 
                    JOptionPane.WARNING_MESSAGE);
                    
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                null, 
                "Error al leer el archivo\n" + e, 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
        }
        try {
            fr.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                null, 
                "Error al cerrar el archivo\n" + e, 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
        }

        
    }// fin if (!error)
    //System.out.println(datos);
    return datos;
}

public Boolean logeo(String user, String pass){
    FileReader fr = null;
    boolean error = false, existe = false;
    try {
        fr = new FileReader("Usuarios.csv");
    } catch (Exception e) {
        error = true;
        JOptionPane.showMessageDialog(
                null, 
                "Error al abrir el archivo\n" + e, 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
    }
    if (!error) {
        String registro = "";
        BufferedReader br = new BufferedReader(fr);
        String tokens[];
        // obtener el codigo a buscar del formulario
        this.user = user;
        this.pass = pass;
        
        try {
            while ((registro = br.readLine()) != null) {                    
                //System.out.println(registro);
                tokens = registro.split(";");
                
                    if (tokens[1].equals(user) && tokens[10].equals(pass)) { //aqui modificar
                        existe = true;
                        JOptionPane.showMessageDialog(null, "El usuario existe");
                        break;
                    }
                
            }
            if (!existe) {
                JOptionPane.showMessageDialog(
                    null, 
                    "El estudiante con codigo " + IdBuscado + " no existe.", 
                    "Advertencia", 
                    JOptionPane.WARNING_MESSAGE);
                    
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                null, 
                "Error al leer el archivo\n" + e, 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
        }
        try {
            fr.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                null, 
                "Error al cerrar el archivo\n" + e, 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
        }

        
    }// fin if (!error)
    //System.out.println(datos);
    return existe;
}
}

