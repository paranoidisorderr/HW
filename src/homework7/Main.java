package homework7;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Main {
    static void main(String[] args) {

        ArrayList<Object> mixedList = new ArrayList<>() ;

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        System.out.println(list2);

        ArrayList<String> name = new ArrayList<>();
        name.add(0, "Nigger");
        name.add(1, "Dasda");
        name.remove(1);

        System.out.println(name);

        mixedList.addAll(name);
        mixedList.addAll(list2);
        System.out.println(mixedList);


        String val = (String) mixedList.get(0);
        System.out.println(val);

        Integer val1 = (Integer) mixedList.get(2);
        System.out.println(val1);
    }
}
