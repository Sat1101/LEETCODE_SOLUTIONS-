class MinStack {
   Stack<Integer> st;
   Stack<Integer> minSt; 
    public MinStack() {
        st = new Stack<>();
        minSt= new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        if (minSt.size()==0 || val<minSt.peek()) {
            minSt.push(val);
        }
        else minSt.push(minSt.peek());
    }
    
    public void pop() {
        st.pop();
        minSt.pop();
        
    }
    
    public int top() {
      return st.peek();
    }
    
    public int getMin() {
         return minSt.peek();
    }
}


// class MinStack {
//    Stack<int[]> s;

//     public MinStack() {
//         s = new Stack<>();
        
//     }
    
//     public void push(int val) {
//          if (s.isEmpty()) {
//             s.push(new int[]{val, val});
//         } else {
//             int minVal = Math.min(val, s.peek()[1]);
//             s.push(new int[]{val, minVal});
//         } 
        
//     }
    
//     public void pop() {
//         s.pop();
        
//     }
    
//     public int top() {
//       return s.peek()[0];
//     }
    
//     public int getMin() {
//          return s.peek()[1];
//     }
// }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */