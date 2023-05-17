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
    private JButton FINISCIGIOCOButton;
    private JLabel NICKNAMETEXT;
    private JLabel erroreTXT;
    private JLabel avvertenzaTXT;
    private JLabel punteggioTXT;
    private JButton GENERAPAROLAButton;
    private String stringa = "";
    private String nickname;
    private int  punteggio = 0;
    private int corrette = 0;

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
        erroriTXT.setText(String.valueOf((U1.getErrori())));


        inserisciLetteraBUTTON.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    int o = 0;
                    char variabileChar = inputTEXT.getText().charAt(0);
                    for(int i=0; i< P1.getLunghezza();i++){
                        if(variabileChar==P1.getChar(i)){
                            P1.parolaTry.set(i,variabileChar);
                            showParola.setText(P1.parolaTry.toString());
                            o++;
                        }
                        inputTEXT.setText("");
                    }


                if(o==0){
                    erroreTXT.setText("errore la lettera non è contenuta");
                    U1.aumentoErrori();
                    viteRimasteTXT.setText(String.valueOf((U1.getVite())));
                    erroriTXT.setText(String.valueOf((U1.getErrori())));
                }
            }
        });
        inserisciParolaBUTTON.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    if((P1.checkParola(inputTEXT.getText()))){
                        showParola.setText(inputTEXT.getText());
                        punteggio++;
                        punteggioTXT.setText("PUNTEGGIO: " + punteggio);
                        P1.parolaTry.clear();
                    }
                    else{

                    }

                }catch (Exception o){
                    erroreTXT.setText("errore hai sbagliato");
                    U1.aumentoErrori();
                }
                viteRimasteTXT.setText(String.valueOf((U1.getVite())));
                erroriTXT.setText(String.valueOf((U1.getErrori())));
                inputTEXT.setText("");


            }
        });

        FINISCIGIOCOButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FINESTRA4 F4 = new FINESTRA4(nickname, punteggio);
                dispose();
            }
        });

        consiglioBUTTON.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                consiglioTEXT.setText(Character.toString(P1.carattere));
                avvertenzaTXT.setText("hai utilizzato l'unico consiglio");
                U1.diminuisciVite();
                viteRimasteTXT.setText(String.valueOf((U1.getVite())));
                for (int i = 0; i < P1.getLunghezza(); i++) {
                    if (P1.carattere == P1.getChar(i)) {
                        P1.parolaTry.set(i, P1.carattere);
                        showParola.setText(P1.parolaTry.toString());
                        corrette++;
                        if (corrette == P1.getLunghezza()){
                            punteggio++;
                            punteggioTXT.setText("PUNTEGGIO: "+ punteggio);
                        }
                    }

                }
            }
        });
        GENERAPAROLAButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                P1.parolaTry.clear();
                P1.generaParolaRandom();
                showParola.setText(P1.parolaTry.toString());
                avvertenzaTXT.setText("");
                consiglioTEXT.setText("");
            }
        });
    }
}
