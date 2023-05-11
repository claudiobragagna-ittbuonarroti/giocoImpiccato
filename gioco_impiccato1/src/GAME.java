
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.stream.Collectors;

public class GAME {

    int lunghezza;
    int indovinaParola;
    private List<PAROLA> parole;
    /*public GAME(String path) throws Exception {     //METTICE ER path di parole
        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);
        for(String line : br.lines().collect(Collectors.toSet()))       //scorre tutte le linee del file
        {
            // qua ci mettiamo le parole nel set, addParola(new Parola(line))

            parole.add(new PAROLA(4 , line));
        }
    }*/

    /*public char readElement(int index) {
        return indovinaParola[index];
    }


    public int countElements(int lettere_trovate) {
        //mi riporta quante lettere mancano
        return lunghezza-lettere_trovate;
    }*/




}