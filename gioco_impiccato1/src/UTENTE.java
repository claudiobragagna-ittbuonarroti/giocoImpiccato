
public class UTENTE {
    String nickname;
    private int punteggio;
    private int vite;
    private int errori;
    UTENTE(String nickname){

        this.nickname = nickname;
        this.punteggio = 0;
        this.vite = 4;
    }

    public void aumentoPunteggio(){
        punteggio++;
    }
    public void aumentoErrori(){
        errori++;
        vite -= 1;
    }

    public void diminuisciVite(){
        vite --;
    }

    public int getVite() {
        return vite;
    }

    public int getErrori() {
        return errori;
    }

    public int getPunteggio() {
        return punteggio;
    }

    public void setUtente(String nickname){
        this.nickname = nickname;
    }

    public String GetNickname  (){
        return nickname;
    }
}
