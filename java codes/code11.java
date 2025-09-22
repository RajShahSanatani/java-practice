//##collections code

import java.util.*;
import java.util.List;


public class code11{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(10);
        list.add(2);
        list.add(3);
        list.add(100);
        list.add(30);
        Iterator i=list.iterator();
        while (i.hasNext()){
            System.out.print(i.next()+" ");
        } 
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);


    }
}