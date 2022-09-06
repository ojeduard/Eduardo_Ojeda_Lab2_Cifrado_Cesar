import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Cipher_DesCipher extends JFrame{
    private JTextField txtWord;
    private JTextField txtPositions;
    private JButton cipherBtn;
    private JComboBox cipherOptions;
    private JPanel panelMain;

    public Cipher_DesCipher() {
        cipherBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CesarCipher cipher = new CesarCipher();
                cipher.saveText(txtWord.getText());
                cipher.encryptingText(Integer.parseInt(txtPositions.getText()));
                JOptionPane.showMessageDialog(cipherBtn, cipher.displayCipher());
            }
        });
    }

    public static void main(String[] args) {
        Cipher_DesCipher cesarCipher = new Cipher_DesCipher();
        cesarCipher.setContentPane(cesarCipher.panelMain);
        cesarCipher.setTitle("Cesar Cipher");
        cesarCipher.setBounds(400, 200, 400, 200); // Tamano de venta pero hasta con ejes
        //h.setSize(500, 400); // El tamano que le quiero dar a la ventana pero solo altura y anchura
        cesarCipher.setVisible(true); // Para que sea visible la ventana
        cesarCipher.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
