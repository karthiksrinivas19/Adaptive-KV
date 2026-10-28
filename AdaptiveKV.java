
public class AdaptiveKV {

    public static void main(String[] args) {
        KVstore nodeA = new KVstore();
        KVstore nodeB = new KVstore();


        nodeA.put("key1", "value11");
        nodeB.put("key1", "value11");

        System.out.println("Before update:");
        printValues(nodeA, nodeB);


        nodeA.put("key1", "value12");

        System.out.println("\nAfter updating Node A:");
        printValues(nodeA, nodeB);


        nodeB.put("key1", nodeA.get("key1"));

        System.out.println("\nAfter replication:");
        printValues(nodeA, nodeB);
    }

    private static void printValues(KVstore nodeA, KVstore nodeB) {
        System.out.println("Node A: " + nodeA.get("key1"));
        System.out.println("Node B: " + nodeB.get("key1"));
    }
}
