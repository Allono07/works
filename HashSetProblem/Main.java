package HashSetProblem;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String args[]){
        HashSet<String> strings = new HashSet<>();
        strings.add("Alen");
        strings.add("Cristiano");
        strings.add("Ronaldo");
        strings.add("Allen");
        strings.add("Allen");
        Iterator it =strings.iterator();
        while(it.hasNext()){
            String value = (String)it.next();
            System.out.println(value);
        }

    }
}
