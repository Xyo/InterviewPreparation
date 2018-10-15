import sun.security.action.GetBooleanAction;

public class CustomHashMap {

    private Entry<K, V>[] table = new Entry[16];

    public V get(Object key) {
        int hashkey = hash(key);
        Entry result = table[hashkey];
       
        // no value for key
        if(result == null) return result;

        // check first for collision
        if(result.next == null){
            return result.value;
        } else {
            return resolveCollision(result, key).value;
        }
    }

    public boolean put(K key, E value) {
        Entry newEntry = new Entry(key, value, null);
        Entry existingKeyFound = get(key);
        if(existingKeyFound != null){
            existingKeyFound.next = newEntry;
        } else {
            int hashkey = hash(key);
            this.table[hashkey] = newEntry;
        }
    }

    private int hash(E key) {
        Object dummyObj = new Object(key);
        int hashcode = dummyObj.hashCode();
        return hashkey % this.table.size();
    }

    private Entry resolveCollision(Entry firstEntry, E key) {
        Entry e = firstEntry;
        do {
            if(e.key == key) return e;
            e = e.next;
        } while(e.next != null);
        return null;
    }

    // simple linked list, with key and value attributes to resolve collisions
    class Entry<K, V> {
        Entry(K key, V value, Entry next){
            this.key = key;
            this.value = value;
            this.next = next;
        }
        private final K key;
        V value;
        Entry<K, V> next;
    }
}

