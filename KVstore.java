import java.util.HashMap;

class KVstore{
    HashMap<String, String> hashmap = new HashMap<>();


    public void put(String key, String value){
        hashmap.put(key, value);
    }

    public String get(String key){
        return hashmap.get(key);
    }
    public void delete(String key){
        hashmap.remove(key);
    }

}
