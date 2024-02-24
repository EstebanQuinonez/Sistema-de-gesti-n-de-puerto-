
package Clases;

import com.mycompany.sistemadegestiondepuerto.InterfazAdministradorSistema;
import com.mycompany.sistemadegestiondepuerto.InterfazOperadorAlmacenamiento;
import com.mycompany.sistemadegestiondepuerto.InterfazOperadorAtraque;
import com.mycompany.sistemadegestiondepuerto.InterfazOperadorEmbarque;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class CLogin {
    
    public void validaUsuario(JTextField usuario, JPasswordField contraseña){
        
        try{
           ResultSet rs = null;
           PreparedStatement ps = null;
           
           Clases.CConexion objetoConexion = new Clases.CConexion();
           
           String consulta = "select*from usuario where usuario.idUsuario = (?) and usuario.Contraseña = (?);";
           ps = objetoConexion.estableceConexion().prepareStatement(consulta);
           
           String contra = String.valueOf(contraseña.getPassword());
           
           ps.setString(1, usuario.getText());
           ps.setString(2, contra);
           
           rs = ps.executeQuery();
           
           if(rs.next()){
               String tipoUsuario = rs.getString("TipoDeUsuario");
               JOptionPane.showMessageDialog(null, "USUARIO CONFIRMADO");
               
               switch(tipoUsuario){
                   case "OperadorAtraque":
                       InterfazOperadorAtraque interfazAtraque = new InterfazOperadorAtraque();
                       interfazAtraque.setLocationRelativeTo(null);
                       interfazAtraque.setSize(1000,600);
                       interfazAtraque.setVisible(true);
                       break;
                   case "OperadorEmbarque":
                       InterfazOperadorEmbarque interfazEmbarque = new InterfazOperadorEmbarque();
                       interfazEmbarque.setLocationRelativeTo(null);
                       interfazEmbarque.setSize(1000,600);
                       interfazEmbarque.setVisible(true);
                       break;
                   case "OperadorAlmacenamiento":
                       InterfazOperadorAlmacenamiento interfazAlmacenamiento = new InterfazOperadorAlmacenamiento();
                       interfazAlmacenamiento.setLocationRelativeTo(null);
                       interfazAlmacenamiento.setSize(1000,600);
                       interfazAlmacenamiento.setVisible(true);
                       break;
                   case "AdministradorSistema":
                       InterfazAdministradorSistema interfazAdmin = new InterfazAdministradorSistema();
                       interfazAdmin.setLocationRelativeTo(null);
                       interfazAdmin.setSize(1000,600);
                       interfazAdmin.setVisible(true);
                       break;
               }
               
           }else{
               JOptionPane.showMessageDialog(null, "USUARIO INEXISTENTE");
           }
            
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: "+e.toString());
        }
        
    }
    
}
