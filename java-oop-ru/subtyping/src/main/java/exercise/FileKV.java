//package exercise;
//
//import java.util.Map;
//import java.util.HashMap;
//
//// BEGIN
//public class FileKV implements KeyValueStorage {
//    private String path;
//    private Map<String, String> dictonary = new HashMap<>();
//
//    public FileKV(String path, Map<String, String> dictionary) {
//        this.path = path;
//        this.dictonary = new HashMap<>(dictonary);
//    }
//
//    @Override
//    public void set(String key, String value) {
//        dictonary.put(key, value);
//        Utils.writeFile(path, Utils.serialize(dictonary));
//    }
//
//    @Override
//    public void unset(String key) {
//        dictonary.remove(key);
//        Utils.writeFile(path, Utils.serialize(dictonary));
//    }
//
//    @Override
//    public String get(String key, String defaultValue) {
//        return Utils.deserialize(Utils.readFile(path)).getOrDefault(key, defaultValue);
//    }
//
//    @Override
//    public Map<String, String> toMap() {
//        return Utils.deserialize(Utils.readFile(path));
//    }
//}
//// END
