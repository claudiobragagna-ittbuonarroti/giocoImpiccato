
import javax.print.DocFlavor;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class FINESTRA3 extends JFrame {
    private JPanel pnlPannello3;
    private JTextField erroriTXT;
    private JTextField viteRimasteTXT;
    private JLabel showParola;
    private JButton inserisciLetteraBUTTON;
    private JButton inserisciParolaBUTTON;
    private JButton consiglioBUTTON;
    private JTextField consiglioTEXT;
    private JTextField inputTEXT;


    public FINESTRA3() {
        setContentPane(pnlPannello3);
        setTitle("Main");
        setSize(900, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        consiglioBUTTON.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                consiglioTEXT.setText("occhio dove guardi giovanotto ;)");
            }
        });
        inserisciLetteraBUTTON.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {;
                inputTEXT.getText();
                //viteRimasteTXT.setText(errori);
                //viteRimasteTXT.setText(viterimanenti);
            }
        });
        inserisciParolaBUTTON.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputTEXT.getText();
                //viteRimasteTXT.setText(errori);

            }
        });
    }
}
