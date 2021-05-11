public class Admin extends User {
        private String login;
        private String password;

    //********************constructor****************** */
        public admin(int id, String type, String login, String password){
            super(id, type);
            this.login= login;
            this.password= password; 
        }

    //********************getters****************** */
        String getLogin(){
            return login;
        }
        String getPassword(){
            return password;
        }

    //********************setters****************** */
        void setLogin(String login){
            this.login= login;
        }
        void setPassword(String password){
            this.password= password;
        }

    //********************affichage****************** */
        public String toString(){
            return (super.toString());
        }
}