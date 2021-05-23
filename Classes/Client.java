import java.util.ArrayList;
import java.util.List;

public class Client extends User {
    List<Voiture> tab;

    // ********************constructor****************** */
    public Client(int id, String nom, String prenom, String dateNaissance, String numeroTel, String login, String password) {
        super(id, nom, prenom, dateNaissance, numeroTel, login, password);
        tab = new ArrayList<>();
    }

    // ********************getters****************** */

    // ********************setters****************** */

    // ********************affichage****************** */
    public String toString() {
        return (super.toString());
    }

    // ********************adding to tab****************** */
    void ajouterVoiture(Voiture newvoiture) {
        tab.add(newvoiture);
    }

    // ********************affichage des voitures****************** */
    void afficherListeVoitures() {
        for (int i = 0; i < tab.size(); i++) {
            System.out.println(tab.get(i) + "/  ");
        }
    }
    boolean isRenting(){
        if (tab.size()==0) 
        return false;
        else
        return true;
    }
}