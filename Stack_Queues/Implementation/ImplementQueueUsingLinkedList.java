class Node {
    int val;
    Node next;

    public Node(int x) {
        this.val = x;
        this.next = null;
    }
}

class LinkedListQueue {
    private Node start;
    private Node end;
    private int size;

    public LinkedListQueue() {
        start = end = null;
        size = 0;
    }

    public void push(int x) {
       Node newNode = new Node(x);
       
       if(start == null) start = end = newNode;
       else { end.next = newNode;
       end = newNode;
       }
       size++;
    }

    public int pop() {
      if(start == null) {
        return -1;
      }

    int val = start.val;
    start = start.next;
    size--;

    if(start == null) end = null;

    return val;
    }

    public int peek() {
        if(start == null) return -1;
        return start.val;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
