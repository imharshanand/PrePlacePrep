package Hashing;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapDemo
{
    public static void main(String args[])
    {
        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('a',1);
        hm.put('b',2);
        hm.put('c',3);
        hm.put('c',7);
        hm.put('d',4);
        System.out.println(hm.containsKey('a'));
        System.out.println(hm.containsValue(3));

        System.out.println(hm.entrySet());
        System.out.println(hm.values());
        System.out.println(hm.keySet());

        System.out.println(hm.get('c'));

    }
}
/**
void clear(): Used to remove all mappings from a map.
boolean containsKey(Object key): Used to return True if for a specified key, mapping is present in the map.
boolean containsValue(Object value): Used to return true if one or more key is mapped to a specified value.
Object clone(): It is used to return a shallow copy of the mentioned hash map.
boolean isEmpty(): Used to check whether the map is empty or not. Returns true if the map is empty.
Set entrySet(): It is used to return a set view of the hash map.
Object get(Object key): It is used to retrieve or fetch the value mapped by a particular key.
Set keySet(): It is used to return a set view of the keys.
int size(): It is used to return the size of a map.
Object put(Object key, Object value): It is used to insert a particular mapping of key-value pair into a map.
putAll(Map M): It is used to copy all of the elements from one map into another.
Object remove(Object key): It is used to remove the values for any particular key in the Map.
Collection values(): It is used to return a Collection view of the values in the HashMap.
compute(K key, BiFunction<K, V> remappingFunction): This method Attempts to compute a mapping for the specified key and its current mapped value (or null if there is no current mapping).
computeIfAbsent(K key, Function<K> mappingFunction): This method If the specified key is not already associated with a value (or is mapped to null), attempts to compute its value using the given mapping function and enters it into this map unless null.
computeIfPresent(K key, BiFunction<K, V> remappingFunction): This method If the value for the specified key is present and non-null, attempts to compute a new mapping given the key and its current mapped value.
forEach(BiConsumer<K, V> action): This method Performs the given action for each entry in this map until all entries have been processed or the action throws an exception.
getOrDefault(Object key, V defaultValue): This method returns the value to which the specified key is mapped, or defaultValue if this map contains no mapping for the key.
merge(K key, V value, BiFunction<K, V> remappingFunction): This method If the specified key is not already associated with a value or is associated with null, associates it with the given non-null value.
putIfAbsent(K key, V value): This method If the specified key is not already associated with a value (or is mapped to null) associates it with the given value and returns null, else returns the current value.
replace(K key, V value): This method replaces the entry for the specified key only if it is currently mapped to some value.
replace(K key, V oldValue, V newValue): This method replaces the entry for the specified key only if currently mapped to the specified value.
replaceAll(BiFunction<K, V> function): This method replaces each entry’s value with the result of invoking the given function on that entry until all entries have been processed or the function throws an exception.
 */