
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
    Connessione C1 = new Connessione();


    public FINESTRA4(String nickName, int punteggio) {
        FINESTRA3 F3 = new FINESTRA3(nickName);
        FINESTRA2 F2 = new FINESTRA2();
        UTENTE u1 = new UTENTE(nickName);
        setContentPane(pnlPannello4);
        setTitle("Main");
        setSize(900, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        nomeTEXXT.setText(nickName);
        punteggioTEXT.setText("punteggio: "+String.valueOf(punteggio));

        C1.connetti();
        C1.inserisciGiocatore(nickName, punteggio, u1.getVite(), u1.getPunteggio() );
        C1.disconnetti();
    }
}
