package com.company;

public class UTENTE {
    String nickname;

    UTENTE(String nickname){
        this.nickname = nickname;
    }

    public void setUtente(String nickname){
        this.nickname = nickname;
    }

    public String GetUtente(){
        return nickname;
    }
}
