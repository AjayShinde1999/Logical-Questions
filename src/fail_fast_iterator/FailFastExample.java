package fail_fast_iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFastExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        Iterator<Integer> itr = list.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
            list.add(40);
        }
    }
}
