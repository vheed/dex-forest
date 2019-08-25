import java.util.*;
import static java.util.Map.Entry;


public class CommonUtils  {

    //Prints all Key - Value pairs of a HashMap
    public static <T, E> void printHashMap(Map<T, E> map) {
        for (Map.Entry<T, E> entry : map.entrySet()) {
            System.out.print(entry.getKey().toString() + " --> " + entry.getValue().toString()  +"   ");
        }
        System.out.println();
    }

    //Sort the HashMap by its values in Descending order
    public static Map<String, Integer> sortByComparator(Map<String, Integer> unsortMap) {
        HashMap<String, Integer> testMap = new HashMap<String, Integer>();
        testMap.put("kaju", 5);
        testMap.put("pista", 4);
        List<Map.Entry<String, Integer>> list = new LinkedList<Entry<String, Integer>>(unsortMap.entrySet());

        // Sorting the list based on values
        Collections.sort(list, new Comparator<Entry<String, Integer>>()
        {
            public int compare(Entry<String, Integer> o1,
                               Entry<String, Integer> o2)
            {
                    //return o1.getValue().compareTo(o2.getValue());
                    return o2.getValue().compareTo(o1.getValue());
            }
        });

        // Maintaining insertion order with the help of LinkedList
        Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> entry : list)
        {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
        //return testMap;
    }
}
