// hashmap:stores data in key value pair
// Syntax: HashMap<keyDatatype, valueDatatype> mapName = new Hasmap<>();
// Methods: insert -> mapName.put(key, value)
//           get -> mapName.get(key)
//          remove -> mapName.remove(key)
//          update -> put method
//          All Delete -> mapName.clear()
//          length -> mapName.size()
// Hashset -> collection of unique elements
//         -> whenever we want to check operations...it stores hash code....very fast accessing
// SYyntax: HashSet<datatype> setName= new HashSet<>();
// Methods: check element -> setName.contains(element) //true or false
//           insert -> setName.add(value)
//           All Delete -> setName.clear()
//          length -> setName.size()

import java.util.HashSet;

public class HashSetPractice {
    public static void main(String[] args) {
        HashSet<Integer> set= new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        set.add(3);
        System.out.println(set);
        System.out.println(set.contains(4));
        System.out.println("length of the set" +set.size());
        set.clear();
        System.out.println(set);
    }
}
