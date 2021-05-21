public class Admin extends User {
    
    // ********************constructor****************** */
    public Admin(int id, String nom, String prenom, String dateNaissance, String numeroTel, String login, String password) {
        super(id, nom, prenom, dateNaissance, numeroTel, login, password);
    }

    // ********************getters****************** */

    // ********************setters****************** */
    
    // ********************affichage****************** */
    public String toString() {
        return (super.toString());
    }
}