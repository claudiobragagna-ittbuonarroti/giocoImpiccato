
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Interfacciabella extends JFrame {
    private JPanel pnlPannello;
    private JTextField textField1;
    private JButton iniziaButton;
    private JButton exitButton;
    private JTextField textField2;
    private JLabel output;
    private JButton MEDIAButton;
    private JButton votoMaggioreButton;
    private JButton modificaStudentebutton;
    private JButton leggiStudenteButton;
    private JTextField TxtIndice;
    private JButton btmEliminaStudente;
    private JButton btmLeggiVoto;
    private JButton resettabuttom;
    private JButton GIOCAButton;
    private JPanel panel1;


    public Interfacciabella() {
        setContentPane(panel1);
        setTitle("Main");
        setSize(900, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        GIOCAButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FINESTRA1 F1=  new FINESTRA1();
            }
        });
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);

            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
