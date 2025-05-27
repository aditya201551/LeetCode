class LRUCache {

    class Node{
        Node prev,next;
        int key, value;

        Node(int key, int value){
            this.key=key;
            this.value=value;

            prev=next=null;
        }
    }

    Node head,tail;
    int cap;
    Map<Integer,Node> map;

    public LRUCache(int cap) {
        this.cap=cap;

        head=new Node(-1,-1);
        tail=new Node(-1,-1);

        head.next=tail;
        tail.prev=head;
        map=new HashMap<>();
    }

    private void addNode(Node node){
        Node tmp=head.next;

        node.next=tmp;
        node.prev=head;

        head.next=node;
        tmp.prev=node;
    }

    private void delNode(Node node){
        node.next.prev=node.prev;
        node.prev.next=node.next;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            Node node=map.get(key);
            delNode(node);
            addNode(node);
            map.put(key,head.next);

            return node.value;
        }

        return -1;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node node=map.get(key);
            delNode(node);
            map.remove(key);
        }

        if(map.size()==cap){
            Node node=map.remove(tail.prev.key);
            delNode(tail.prev);
        }

        addNode(new Node(key, value));
        map.put(key, head.next);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */