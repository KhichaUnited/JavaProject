public class Voiture {
    private String matricule, marque, couleur;

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

    // ********************setters****************** */
    
}