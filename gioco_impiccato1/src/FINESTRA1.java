
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class FINESTRA1 extends JFrame {
    private JPanel pnlPannello0;
    JTextField numeroInseritoText;
    private JButton INSERISCIButton;
    private JLabel QuantiGiocatoriString;


    public FINESTRA1() {
        setContentPane(pnlPannello0);
        setTitle("Main");
        setSize(900, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        numeroInseritoText.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        INSERISCIButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numeroInseritoText.getText();
                FINESTRA2 F2 = new FINESTRA2();
            }
        });

    }
}
