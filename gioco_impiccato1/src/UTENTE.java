
public class UTENTE {
    String nickname;
    private int punteggio;
    private  int vite;
    private int errori;
    UTENTE(String nickname){

        this.nickname = nickname;
        this.punteggio = 0;
    }

    public void aumentoPunteggio(){
        punteggio++;
    }
    public void aumentoErrori(){
        errori++;
        vite -= errori;
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
