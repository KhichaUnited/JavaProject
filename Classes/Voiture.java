public class Voiture {
        private int id;
        private String mat;

    //********************constructor****************** */
        public voiture(int id, String mat){
            this.id= id;
            this.type= type;
        }

    //********************getters****************** */
        int getId(){
            return id;
        }
        String getMat(){
            return mat;
        }

    //********************setters****************** */
        void setId(int id) {
            this.id= id;
        }
        void setMat(String mat) {
            this.mat= mat;
        }
}