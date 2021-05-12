import java.util.ArrayList;
import java.util.List;

public class Client extends User {
    Listt<Voiture> tab;
    private String login;
    private String password;

    // ********************constructor****************** */
    public Client(int id, String type, String login, String password) {
        super(id, type);
        this.login = login;
        this.password = password;
        tab = new ArrayList<>();
    }

    // ********************getters****************** */
    String getLogin() {
        return login;
    }

    String getPassword() {
        return password;
    }

    // ********************setters****************** */
    void setLogin(String login) {
        this.login = login;
    }

    void setPassword(String password) {
        this.password = password;
    }

    // ********************affichage****************** */
    public String toString() {
        return (super.toString());
    }

    // ********************adding to tab****************** */
    void ajouterVoiture(Voiture newvoiture) {
        tab.add(newvoiture);
    }

    // ********************affichage des voitures****************** */
    void touteLesVoitures() {
        for (int i = 0; i < tab.size(); i++) {
            System.out.println(tab.get(i) + "/  ");
        }
    }
}