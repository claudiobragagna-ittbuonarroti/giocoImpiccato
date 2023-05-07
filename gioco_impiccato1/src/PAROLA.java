
import java.util.ArrayList;
import java.util.List;

public class PAROLA{
    int lunghezza;
    ArrayList<Character> parolaTry = new ArrayList<Character>();
    ArrayList<Character> parola = new ArrayList<Character>();

    PAROLA(int lunghezza, String parolaDaIndovinare) {
        this.lunghezza = lunghezza;
        for(int i=0; i<lunghezza; i++){
            parolaTry.set(i, '_');
        }
    }



    public void checkElement(char lettera) throws Exception{
        //controllo che la lettera sia nella parola
        for(int i=0; i<lunghezza; i++){
            if (lettera == parolaTry.get(i)){
                //lettera trovata
                parola.set(i, lettera);
            }
            else{
                throw new Exception("\nla lettera inserita non si trova nella parola");
            }
        }
    }

    public void checkParola(String provaParola) throws Exception {
        //controllo che la parola sia corretta
        for (int i=0; i<lunghezza; i++){
            if(provaParola.equals(new String(parola.toString()))){
                i++;
            }
            else{
                System.out.println("\nnon ghe sem, la parola è sbagliata");
            }
        }
    }
}
