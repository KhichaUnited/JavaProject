import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;


public class adminInterface  {

    public List<Admin> getList(){
        // return list of admins 
        Gson gson = new Gson();
        FileReader r = new FileReader("admins.json");
        Admin[] arr = gson.fromJson(r,Admin[].class);
        List<Admin> l = Arrays.asList(l);
        r.close();
        return l ; 
    }
    public Admin[] addAdmin(Admin newadmin){
        List<Admin> arr = getList();
        arr.add(newadmin);
        Gson gson = new Gson();
        FileWriter f = new FileWriter("admins.json");
        gson.toJson(arr,f);
        f.close();
        }
    }
    public void removeAdmin(String login){
        List<Admin> arr = getList();
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i).login == login)
            {
                arr.remove(i);
            }
        }
        FileWriter f = new FileWriter("admins.json");
        gson.toJson(arr,f);
        f.close();
    }
}