public class HashTable {
    protected String[] table;
 
    public HashTable(int size) {
        table = new String[size];
    }
 
    protected int indexOf(String s) {
        int i = Math.abs(s.hashCode()) % table.length;
        while (table[i] != null) {
            if (s.equals(table[i]))
                return i;
            i++;
            if (i == table.length)
                i = 0;
        }
        return i;
    }
 
    public void add(String s) {
        table[indexOf(s)] = s;
    }
 
    public boolean contains(String s) {
        return table[indexOf(s)] != null;
    }
}

/*
A hash table is efficient for saving a set (of strings in this case).

HASHMAP
A map is used for saving key-value pairs, that are searchable by the key. It is a very useful data structure.

It will be best to explain what it is good for by showing how we can use it:

[ GitPitch @ github/yoavrodeh/class3 ]


*/