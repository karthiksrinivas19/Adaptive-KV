import java.util.HashMap;

public class AdaptiveKV {
    
    public static void main(String[] args) {
        

        HashMap<String, String> nodeA = new HashMap<>();
        HashMap<String, String> nodeB = new HashMap<>();

        nodeA.put("key1", "value11");

        nodeB.put("key1", "value11");
        System.out.println("Before Replication and change:");
        System.out.println("Node A: " + nodeA.get("key1"));
        System.out.println("Node B: " + nodeB.get("key1"));

        System.out.println("After  change:");
        nodeA.put("key1", "value12");
        System.out.println("Node A: " + nodeA.get("key1"));

        System.out.println("Node B: " + nodeB.get("key1"));

        System.out.println("After Replication and change:");
        nodeB.put("key1", nodeA.get("key1"));
        System.out.println("Node A: " + nodeA.get("key1"));
        System.out.println("Node B: " + nodeB.get("key1"));

    }
}
