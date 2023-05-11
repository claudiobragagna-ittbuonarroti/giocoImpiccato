
import java.util.ArrayList;
import java.util.Random;

public class PAROLA{
    int lunghezza;

    private String[] PAROLE = {"daje", "milan", "gym"};
    ArrayList<Character> parolaTry = new ArrayList<Character>();
    ArrayList<Character> parola = new ArrayList<Character>();

    PAROLA() {
        Random random = new Random();
        String parola = PAROLE[random.nextInt(PAROLE.length)];
        System.out.println(parola);
        for(int i=0; i<parola.length(); i++){
            parolaTry.add('_');
        }
    }



    public ArrayList<Character> checkElement(String car) throws Exception{
        //controllo che la lettera sia nella parola
        if(car.length()!=1){
            throw new Exception();
        }
        char lettera = car.toCharArray()[0];
        for(int i=0; i<lunghezza; i++){
            if (lettera == parolaTry.get(i)){
                //lettera trovata
                parola.set(i, lettera);
            }
            else{

            }
        }
        return parola;
    }

    public String checkParola(String provaParola) throws Exception {
        String out = "";
        //controllo che la parola sia corretta

        for (int i=0; i<parola.size(); i++){
            if(provaParola.equals(new String(parola.toString()))){
                i++;
                out = "daje ao";

            }
            else{
                out= ("non ghe sem, la parola è sbagliata");
            }
        }
        return new String(parola.toString());
    }
}
