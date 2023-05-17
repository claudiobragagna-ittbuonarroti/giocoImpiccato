
import java.util.ArrayList;
import java.util.Random;

public class PAROLA{
    private int lunghezza;
    private String[] PAROLE = {"daje", "milan", "gym", "aabba"};
    public ArrayList<Character> parolaTry = new ArrayList<Character>();
    private char[] parola;
    public char carattere;

    public PAROLA() {
        Random random = new Random();
        parola = PAROLE[random.nextInt(PAROLE.length)].toCharArray();
        for(int i=0; i<parola.length; i++){
            parolaTry.add('_');
        }
        this.lunghezza = parola.length;
        carattere = parola[random.nextInt(PAROLE.length)];
    }

    public char[] generaParolaRandom(){
        Random random = new Random();
        parola = PAROLE[random.nextInt(PAROLE.length)].toCharArray();
        for(int i=0; i<parola.length; i++){
            parolaTry.add('_');
        }
        this.lunghezza = parola.length;
        carattere = parola[random.nextInt(PAROLE.length-1)];
        return parola;
    }

    public int getLunghezza() {
        return lunghezza;
    }

    public ArrayList<Character> checkElement(String car) throws Exception{
        //controllo che la lettera sia nella parola
        char lettera = car.toCharArray()[0];
        for(int i=0; i<parola.length-1; i++){
            if (lettera == parolaTry.get(i)){
                //lettera trovata
                parolaTry.set(i, lettera);
            }
            else{

            }
        }
        return parolaTry;
    }

    public char getChar(int n){
        return parola[n];
    }


    public boolean checkParola(String provaParola) throws Exception {
        boolean out = false;
        //controllo che la parola sia corretta

        for (int i=0; i<parola.length; i++){
            if(provaParola.toCharArray()[i] == (parola[i])){
                out = true;
            }
            else{
                out = false;
            }
        }
        return out;
    }
}
