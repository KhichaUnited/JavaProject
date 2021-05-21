abstract public class User {
    protected int id;
    protected String nom, prenom, dateNaissance, numeroTel, login, password;

    // ********************constructor****************** */
    public User(int id, String nom, String prenom, String dateNaissance, String numeroTel, String login, String password) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.numeroTel = numeroTel;
        this.login = login;
        this.password = password;
    }

    // ********************getters********************** */
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public String getNumeroTel() {
        return numeroTel;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    // ********************setters********************** */


    // ********************affichage********************* */
    public String toString() {
        return (id + " " + nom + " " + prenom + " " + dateNaissance + " " + numeroTel + " " + login + " " + password);
    }
}