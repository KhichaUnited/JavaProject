
import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Spider
 */
class testclass {
    int a,b ;
    String name ;
    public testclass(int a , int b , String name){
        this.a = a ;
        this.b = b ;
        this.name = name ;
    }
}
public class gsontesting_spid3r {
    public static void main(String[] args) throws IOException{
        testclass t = new testclass(1,2,"yeet");
        Gson gson = new Gson();
        System.out.println("Hello world !");
        FileWriter f = new FileWriter("db.json");
        gson.toJson(t,f);
        f.close();
        System.out.println("Done");
    }
}
