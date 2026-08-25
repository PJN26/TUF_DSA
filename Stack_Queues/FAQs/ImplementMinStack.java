// https://leetcode.com/problems/min-stack/description/

class MinStack {

    private Stack<Long> s;
    private long min;

    public MinStack() {
        s = new Stack<>();
        min = Integer.MAX_VALUE;
    }

    public void push(int val) {
        if(s.isEmpty()) {
            min = val;
            s.push((long)val);
        } else {
            if(val > min) s.push((long)val);
            else {
                s.push(2L * val - min);
                min = val;
            }
        }
    }

    public void pop() {
        if(s.isEmpty()) return;

        long val = s.pop();

        if(val < min) {
            min = 2 * min - val;
        }
    }

    public int top() {
        if(s.isEmpty()) return -1;

        long val = s.peek();

        if(min < val) return (int)val;
        else return (int)min;
    }

    public int getMin() {
        return (int)min;
    }
}