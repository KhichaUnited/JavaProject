public class User {
        private int id;
        private String type;
    
    //********************constructor****************** */
        public user(int id, String type){
            this.id= id;
            this.type= type;
        }
    
    //********************getters********************** */
        int getId(){
            return id;
        }
        String getType(){
            return type;
        }
    
    //********************setters********************** */
        void setId(int id) {
            this.id= id;
          }
        void setType(String type) {
            this.type= type;
        }
    //********************affichage********************* */
        public String toString(){
            return ("ID: "+num+" Type: "+titre);
        }
}