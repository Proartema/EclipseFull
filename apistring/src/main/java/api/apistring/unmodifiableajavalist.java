package api.apistring;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class unmodifiableajavalist {

   public static void main(String[] args) {
       // TODO Auto-generated method stub

       List<String> stringList = Arrays.asList("a", "b", "c");
       stringList = Collections.unmodifiableList(stringList);

       Set<String> stringSet = new HashSet<>(Arrays.asList("a", "b", "c"));
       stringSet = Collections.unmodifiableSet(stringSet);

       Map<String, Integer> stringMap = new HashMap<String, Integer>();
       stringMap.put("a", 1);
       stringMap.put("b", 2);
       stringMap.put("c", 3);
       stringMap = Collections.unmodifiableMap(stringMap);

       

   }

}