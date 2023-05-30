package review_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Iterator_23 {
    public static void main(String[] args) {
        String[] str = {"Halid", "Nukhet", "Nimet", "Salih", "Furkan", "Merve", "Zeynep", "Yakup"};

        List<String> names = new ArrayList<>(Arrays.asList(str));

        // Lets erase names if length > 5



//        names.removeIf(p -> p.length()>5 );//p -> is a for loop
//
//        return names;
//    }


    // Can we do it without the iterator?

    // Can I use remove() method?
    Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
        String name = iterator.next();
        if (name.length() > 5) {
            iterator.remove();
        }}
        System.out.println(names);
    }


}
