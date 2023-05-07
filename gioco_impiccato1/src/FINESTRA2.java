
import com.sun.org.apache.bcel.internal.generic.NEW;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class FINESTRA2 extends JFrame {
    private JPanel pnlPannello;
    private JTextField textNickname;
    private JButton exitButton;
    private JButton inserisciButton;


    public FINESTRA2() {
        setContentPane(pnlPannello);
        setTitle("Main");
        setSize(900, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);



       /* inserisciButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { //quando schiaccia il bottone
                output.setText("");  //cancello quello che c'è nell'output
                String nome;
                float voto;
                nome = textField1.getText(); //assegno il valore inserito in TextField1 a nome
                String a=textField2.getText();
                voto = Float.parseFloat(a); //trasformo la stringa inserita in TextField2 in Float
                try {
                    if (!g1.pieno()){
                        g1.inserisciStudente(nome,voto);
                    }
                    else {
                        output.setText("L'array è pieno");
                    }
                } catch (Exception ex) {
                    output.setText(ex.getMessage());
                }
                textField1.setText(""); //resetta il testo
                textField2.setText(""); //resetta il testo
            }

        */


        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        inserisciButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FINESTRA3 F3 = new FINESTRA3();
                textNickname.setText("");

            }
        });
    }
}
