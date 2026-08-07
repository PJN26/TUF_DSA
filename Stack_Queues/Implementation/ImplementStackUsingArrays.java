/*
Implement Stack using Arrays
Hints
Company
Implement a Last-In-First-Out (LIFO) stack using an array. The implemented stack should support the following operations: push, pop, peek, and isEmpty.



You will be provided two arrays operations which contains what operation need to perform and nums which contains the values corresponding to the operations.



Implement the ArrayStack class:



void push(int x): Pushes element x onto the stack.

int pop(): Removes and returns the top element of the stack.

int top(): Returns the top element of the stack without removing it.

boolean isEmpty(): Returns true if the stack is empty, false otherwise.







Please note that this section might seem a bit difficult without prior knowledge on what stacks is, we will soon try to add basics concepts for your ease! If you know the concepts already please go ahead to give a shot to the problem. Cheers!


Example 1

Input: operations = ["ArrayStack", "push", "push", "top", "pop", "isEmpty"]

nums = [[], [5], [10], [], [], []]

Output: [null, null, null, 10, 10, false]

Explanation:

ArrayStack stack = new ArrayStack();

stack.push(5);

stack.push(10);

stack.top(); // returns 10

stack.pop(); // returns 10

stack.isEmpty(); // returns false

Example 2

Input: operations = ["ArrayStack","isEmpty", "push", "pop", "isEmpty"]

nums = [[], [], [1], [], []]

Output: [null, true, null, 1, true]

Explanation: 

ArrayStack stack = new ArrayStack();

stack.push(1);

stack.pop(); // returns 1

stack.isEmpty(); // returns true

Example 3

Input: operations = ["ArrayStack", "isEmpty"]

nums = [[], []]

Output:

[null, true]
Constraints

1 <= numbers of calls made <= 100
1 <= x <= 100
*/

class ArrayStack {

    private int[] s;
    private int capacity;
    private int top;

    public ArrayStack(int size) {
        capacity = size;
        s = new int[capacity];
        top = -1;
    }

    public ArrayStack() {
        this(101);
    }

    public void push(int x) {
       if(top >= capacity - 1) return;
       s[++top] = x;
    }

    public int pop() {
      if(isEmpty()) return -1;
      return s[top--];
    }

    public int top() {
        if(isEmpty()) return -1;
        return s[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
