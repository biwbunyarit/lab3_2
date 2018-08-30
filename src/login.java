import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login {
    private JTextField textUserLogin;
    private JPasswordField pwdUserPassword;
    private JButton btnSubmit;
    private JButton btnClear;
    private JPanel mainPanal;

    public login() {
        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,textUserLogin.getText()
                        + " " + new String(pwdUserPassword.getPassword()));
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textUserLogin.setText("");
                pwdUserPassword.setText("");
            }
        });
    }

    public JPanel getMainPanal(){
        return mainPanal;
    }
}
