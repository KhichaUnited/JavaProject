import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;


public class voitureInterface  {

    public List<Voiture> getList(){
        // return list of voitures 
        Gson gson = new Gson();
        FileReader r = new FileReader("voitures.json");
        Voiture[] arr = gson.fromJson(r,Voiture[].class);
        List<Voiture> l = Arrays.asList(l);
        r.close();
        return l ; 
    }

    public void addVoiture(Voiture newvoiture){
        List<Voiture> arr = getList();
        arr.add(newvoiture);
        Gson gson = new Gson();
        FileWriter f = new FileWriter("voitures.json");
        gson.toJson(arr,f);
        f.close();
    }

    public void removeVoiture(String matricule){
        List<Voiture> arr = getList();
        for (int i = 0; i < arr.size(); i++) {
            if( (arr.get(i).getMatricule() == matricule) && (arr.get(i).getTaken() == false) ){
                arr.remove(i);
            }
            else if( (arr.get(i).getMatricule() == matricule) && (arr.get(i).getTaken() == true) ){
                System.out.println("Error!");
            }
        }
        FileWriter f = new FileWriter("voitures.json");
        gson.toJson(arr,f);
        f.close();
    }
}