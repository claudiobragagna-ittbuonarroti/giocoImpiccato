
import com.sun.org.apache.bcel.internal.generic.NEW;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class FINESTRA2 extends JFrame {
    private JPanel pnlPannello;
    private JTextField textNickname;
    private JButton exitButton;
    private JButton inserisciButton;
    public String nickName = "";


   public String getNickName() {
        return textNickname.getText();
    }
    UTENTE u1 = new UTENTE(getNickName());



    public FINESTRA2() {
        FINESTRA1 F1 = new FINESTRA1();
        PAROLA parola = new PAROLA();
        setContentPane(pnlPannello);
        setTitle("Main");
        setSize(900, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);





        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        inserisciButton.addActionListener(new ActionListener() {
            int i = 0;
            @Override
            public void actionPerformed(ActionEvent e) {

                nickName = textNickname.getText();

                FINESTRA3 F3 = new FINESTRA3(nickName);

            }
        });


    }
}
