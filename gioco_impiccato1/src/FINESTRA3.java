
import com.sun.org.apache.bcel.internal.generic.NEW;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.concurrent.ForkJoinPool;


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
    private JButton FINISCIGIOCOButton;
    private JLabel NICKNAMETEXT;
    private JLabel erroreTXT;
    private String stringa = "";
    private String nickname;

    private String parola;

    public String getStringa() {
        return stringa;
    }

    public void setStringa(String stringa) {
        this.stringa = stringa;
    }

    public FINESTRA3(String nickname) {
        PAROLA P1 = new PAROLA();
        FINESTRA2 F2 = new FINESTRA2();
        UTENTE U1 = new UTENTE(F2.getNickName());
        setContentPane(pnlPannello3);
        setTitle("Main");
        setSize(900, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        this.nickname = nickname;

        NICKNAMETEXT.setText("NICKNAME:  "+ nickname);
        showParola.setText(P1.parolaTry.toString());
        viteRimasteTXT.setText(String.valueOf((U1.getVite())));

        consiglioBUTTON.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                consiglioTEXT.setText("occhio dove guardi giovanotto ;)");
            }
        });
        inserisciLetteraBUTTON.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{


                    P1.checkElement((inputTEXT.getText()));
                    showParola.setText(P1.parolaTry.toString());
                    viteRimasteTXT.setText(String.valueOf((U1.getVite())));
                } catch (Exception z){
                    erroreTXT.setText("devi inserire un carattere");
                }



            }
        });
        inserisciParolaBUTTON.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputTEXT.getText();

                try{
                    inputTEXT.setText(P1.checkParola(inputTEXT.getText()));
                    showParola.setText(P1.parolaTry.toString());
                    viteRimasteTXT.setText(String.valueOf((U1.getVite())));
                }catch (Exception o){
                    System.out.println(o);
                }

                //viteRimasteTXT.setText(errori);

            }
        });
        FINISCIGIOCOButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FINESTRA4 F4 = new FINESTRA4(nickname, U1.getPunteggio());
            }
        });

    }
}
