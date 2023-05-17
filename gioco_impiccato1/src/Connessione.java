
import javax.swing.plaf.nimbus.State;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Connessione {
    Connection connessione;

    public Connessione() {
        this.connessione = null;
    }

    public void connetti() {
        try {
            String jdbcURL = "jdbc:mysql://localhost:3306/giocoimpiccato";
            String username = "root";
            String password = "";
            connessione = DriverManager.getConnection(jdbcURL, username, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void disconnetti() {
        try {
            connessione.close();
        } catch (SQLException ex) {
            Logger.getLogger(Connessione.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void inserisciGiocatore(String nickName, int punteggio, int vite, int errori){
        try {
            Statement stat = connessione.createStatement();
            String query = "INSERT INTO `giocatori`(`Nickname`, `Punteggio`, `Errori`, `Vite`) VALUES ('" + nickName + "','"+ punteggio +"','"+ errori +"','"+ vite +"')";
            stat.execute(query);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

}