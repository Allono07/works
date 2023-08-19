package HashSetProblem;

import java.util.HashMap;
import java.util.Iterator;

public class Main1 {
    public static void main(String[] args){
        HashMap<String, String> studentDetails = new HashMap<>();
        studentDetails.put("Name","Alle");
        studentDetails.put("RegNo","1940302");
        studentDetails.put("Class","MScCSA");
        Iterator it = studentDetails.values().iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
//        for(String key:studentDetails.keySet()){
//            System.out.println(studentDetails.get(key));
//        }
        for(String values: studentDetails.values()){
            System.out.println(values);
        }
    }

}
