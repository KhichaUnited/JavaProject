import java.sql.Blob;

public class Voiture {
    private String matricule, marque, couleur;
    public boolean isTaken = false ;

    // ********************constructor****************** */
    public Voiture(String matricule, String marque, String couleur) {
        this.matricule = matricule;
        this.marque = marque;
        this.couleur = couleur;
    }

    // ********************getters****************** */
    String getMatricule() {
        return matricule;
    }

    String getMarque() {
        return marque;
    }

    String getCouleur() {
        return couleur;
    }
    
    boolean getTaken() {
        return isTaken;
    }

    // ********************setters****************** */
    void setTaken(boolean isTaken) {
        this.isTaken = isTaken ;
    }

}