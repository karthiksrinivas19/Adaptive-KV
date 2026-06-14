public class home {
    public static void main(String[] args) {
        KVstore kvstore = new KVstore();
        kvstore.put("name","harichandran");
        System.out.println(kvstore.get("name"));
    }
}
