import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;

import javax.lang.model.util.ElementScanner6;


public class ClientInterface  {

    public List<Client> getList(){
        // return list of clients 
        Gson gson = new Gson();
        FileReader r = new FileReader("clients.json");
        Client[] arr = gson.fromJson(r,Client[].class);
        List<Client> list = Arrays.asList(list);
        r.close();
        return list ; 
    }
    public Client[] addClient(Client newclient){
        List<Client> arr = getList();
        arr.add(newclient);
        Gson gson = new Gson();
        FileWriter f = new FileWriter("clients.json");
        gson.toJson(arr,f);
        f.close();
        }
    }
    public void removeClient(String login){
        List<Client> arr = getList();
        for (int i = 0; i < arr.size(); i++) {
            if((arr.get(i).login == login)&&(Client.isRenting==false))
            {
                arr.remove(i);
            }
            else
            System.out.println("Error!");

        }
        FileWriter f = new FileWriter("clients.json");
        gson.toJson(arr,f);
        f.close();
    }
}