
import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Spider
 * 
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
        testclass t1 = new testclass(1,2,"yeet");
        testclass t2 = new testclass(3,4,"object");
        testclass[] arr = new testclass[2];
        arr[0] = t1;
        arr[1] = t2;
        Gson gson = new Gson();
        System.out.println("Hello world !");
        FileWriter f = new FileWriter("db.json");
        gson.toJson(arr,f);
        f.close();
        FileReader r = new FileReader("db.json");
        testclass[] arr2 = gson.fromJson(r,testclass[].class);
        System.out.println(arr2[0].name);
        System.out.println(arr2[1].name);
        System.out.println("Done");
        r.close();
    }
}
