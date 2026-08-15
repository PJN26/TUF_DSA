class Node {
    int val;
    Node next;

    public Node(int x) {
        this.val = x;
        this.next = null;
    }
}

class LinkedListStack {
    private Node top;
    public LinkedListStack() {
        top = null;
    }

    public void push(int x) {
       Node newNode = new Node(x);
       newNode.next = top;
       top = newNode;
    }

    public int pop() {
      if(isEmpty()) return -1;
      int val = top.val;
      top = top.next;
      return val;
    }

    public int top() {
        if(isEmpty()) return -1;
        return top.val;
    }

    public boolean isEmpty() {
        return top == null;
    }
}
