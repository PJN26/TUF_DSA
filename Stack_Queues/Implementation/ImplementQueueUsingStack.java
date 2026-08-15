//https://leetcode.com/problems/implement-queue-using-stacks/description/

class StackQueue {
    Stack<Integer> s1;
    Stack<Integer> s2;
    public StackQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void push(int x) {
       s1.push(x);
    }

    public int pop() {
      if(s1.isEmpty() && s2.isEmpty()) return -1;

      if(!s2.isEmpty()) return s2.pop();
      else {
        while(!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        return s2.pop();
      }
    }

    public int peek() {
        if(s1.isEmpty() && s2.isEmpty()) return -1;

      if(!s2.isEmpty()) return s2.peek();
      else {
        while(!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        return s2.peek();
      }
    }

    public boolean isEmpty() {
        return s1.isEmpty() && s2.isEmpty();
    }
}
