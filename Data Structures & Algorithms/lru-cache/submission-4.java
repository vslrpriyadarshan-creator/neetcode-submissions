class LRUCache {
    private int cap;
    private HashMap<Integer, Node> cache;
    private  Node head;
    private Node tail;
    public LRUCache(int capacity) {
        this.cap = capacity;
        cache = new HashMap<>();
        head = new Node(0,0);
        tail = new Node(0,0);
        head.next = tail;
        tail.prev = head;
    }

    private void remove(Node node){
        Node prev = node.prev;
        Node next = node.next;
       if(prev!=null) prev.next = next;
        if(next!=null)next.prev = prev;
    }
    private void insert(Node node){
           head.next.prev = node;
           node.next = head.next;
           node.prev = head;
           head.next = node;
    }
    public int get(int key) {
        if(cache.containsKey(key)){
           Node node = cache.get(key);
           remove(node);
           insert(node);
           return node.val;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            remove(cache.get(key));
        }
        Node newNode = new Node(key, value);
        cache.put(key, newNode);
        insert(newNode);
        if (cache.size() > cap) {
            cache.remove(tail.prev.key);
            remove(tail.prev);
        }
    }
}


public class Node {
    int key;
    int val;
    Node prev;
    Node next;

    public Node(int key, int val) {
        this.key = key;
        this.val = val;
        this.prev = null;
        this.next = null;
    }
}
