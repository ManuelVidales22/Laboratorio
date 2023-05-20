import java.awt.Menu;
import Vista.MenuPrincipal;
import Vista.AcercaDe;
import Vista.Login;
import Controlador.MenuPrincipal_Control;
import Controlador.Login_Controlador;
public class Main {
    public static void main(String[] args) throws Exception {
        
        
        
        Login lg = new Login();
        Login_Controlador menu = new Login_Controlador(lg);
        
    }
    
}
