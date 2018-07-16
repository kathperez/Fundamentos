package Logic;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Kath
 */
public class Valid {

    public boolean isValid(JTextField txtUser,JTextField txtPassword) {
        String valid = txtUser.getText();
        boolean status;

        if (valid.contains("@gmail.com")) {
            status = true;
            JOptionPane.showMessageDialog(txtUser, "Correo Valido");
            
        } else {
            status= false;
            JOptionPane.showMessageDialog(txtUser, "¡Correo Invalido! Solo correos Gmail");
        }
        return status;
    }

}
