
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class FINESTRA4 extends JFrame {
    private JPanel pnlPannello4;
    private JLabel nomeTEXXT;
    private JLabel punteggioTEXT;
    private JTextField textField1;
    private JButton INSERISCIButton;
    private JLabel QuantiGiocatoriString;


    public FINESTRA4(String nickName, int punteggio) {
        setContentPane(pnlPannello4);
        setTitle("Main");
        setSize(900, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        nomeTEXXT.setText(nickName);
        punteggioTEXT.setText("punteggio: "+String.valueOf(punteggio));

    }
}
