class LRUCache {

    int capacity = 0;
    Map<Integer,Node> cacheStore = new HashMap <>();
    Node head = new Node(null,null);
    Node tail = new Node (null, null);
    
    
    public LRUCache(int capacity) {
        this.capacity = capacity;
        createHeadAndTail(head,tail);
    }
    
    
    public int get(int key) {

         if(cacheStore.containsKey(key)){

            Node currentNode = cacheStore.get(key);

           setAsMostRecentlyUsed(currentNode);
           
           return currentNode.value;
         }
         else{

            return -1;
         }
        
    }
    
    public void put(int key, int value) {

        if(cacheStore.size() == 0){
            
            Node newNode = createNewNode(key,value);
            setAsMostRecentlyUsed(newNode);
            cacheStore.put(key,newNode);

        }
        else if(cacheStore.containsKey(key)){
            Node existingNode = cacheStore.get(key);
            existingNode.value = value;
            setAsMostRecentlyUsed(existingNode);
            cacheStore.put(key,existingNode);
        }
        else if(!cacheStore.containsKey(key) && cacheStore.size() < capacity){
            Node newNode = createNewNode(key,value);
            setAsMostRecentlyUsed(newNode);
            cacheStore.put(key,newNode);
        }
        else if(!cacheStore.containsKey(key) && cacheStore.size() >= capacity){
            removeLeastRecentlyUsed();
            Node newNode = createNewNode(key,value); 
            setAsMostRecentlyUsed(newNode);
            cacheStore.put(key, newNode);
        }
    }

    private void removeLeastRecentlyUsed(){

        removeFromCache(head.next.key); 

        head.next.next.previous = head;
        head.next = head.next.next;
        
    }


    private void setAsMostRecentlyUsed(Node mruNode){
        if (mruNode == tail.previous) {
        return;}
        if(cacheStore.containsKey(mruNode.key)){

            mruNode.previous.next = mruNode.next;
            mruNode.next.previous = mruNode.previous;
        }
         
        mruNode.next = tail;
        mruNode.previous = tail.previous;

        tail.previous.next = mruNode;
        tail.previous = mruNode;

    }

    private void removeFromCache(int key){
        cacheStore.remove(key);
    }

    private Node createNewNode(int key, int value){

        return new Node (key,value);
    }

    private void createHeadAndTail(Node head, Node tail){

        head.next = tail;
        head.previous = null;

        tail.previous = head;
        tail.next = null;
    }
}

class Node {

    int value;
    int key;
    Node previous;
    Node next;

    public Node (int key, int value){
        this.key = key;
        this.value =value;
    }

    public Node(Node next, Node previous){
        this.next = next;
        this.previous = previous;
    }

}
