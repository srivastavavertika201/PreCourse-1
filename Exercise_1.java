class Stack { 
    static final int MAX = 1000; 
    int top =-1; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        if(top==-1){
            return true;
        }
        else
            return false;
    } 

    Stack() 
    { 
        //Initialize your constructor 
        Stack<Integer> s = new Stack<Integer>();
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if(top>=MAX){
            System.out.println("Stack Overflow!!");
        }
        //Write your code here
        top = top+1;
        a[top] = x;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(isEmpty){
            System.out.println("Stack underflow");
        }
        //Write your code here
        else{
            top=top-1;
        }
    } 
  
    int peek() 
    { 
        //Write your code here
        if(!isEmpty)
           return a[top];
    } 
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
