import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String,String>  naming = new HashMap<>();
        ArrayList<HashMap<String,String>> list = new ArrayList<>();
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                naming.put("Name"+i,"Allen");
            }

        }
    }
}