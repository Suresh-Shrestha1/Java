// 10) Write a program in java to demonstrate stack data structure.

// import java.util.Scanner;

class MyStack{
    int MAX;
    int[] stack;
    int top;
    // Constructor to initialize the stack
    MyStack(){
        MAX = 5;
        stack = new int[MAX];
        top = -1;
    }
    // Methods to push element into the stack.
    void push(int value){
        if(top == MAX - 1){
            System.out.println("Stack Overflow! Cannot push more than " + MAX + " elements");
        }
        else{
            top = top + 1;
            stack[top] = value;
            System.out.println("Pushed " + value + " into stack");
        }
    }
    // Method to pop an element from the stack
    void pop(){
        if(top == -1){
            System.out.println("Stack Underflow! Cannot pop more");
        }
        else{
            int value = stack[top];
            top = top - 1;
            System.out.println("Popped " + value + " from stack");
        }
    }
    // Method to peek the top element from the stack
    void peek(){
        if(top == -1){
            System.out.println("Stack Empty! Cannot peek more");
        }
        else{
            System.out.println("The top element of the stack is " + stack[top]);
        }
    }
    // Method to display the elements of the stack
    void display(){
        if(top == -1){
            System.out.println("Stack Empty! Cannot display");
        }
        else{
            System.out.print("Stack element: ");
            for(int i = 0; i <= top; i++) {
                System.out.print(stack[i]+" ");
            }
            System.out.println("");
        }
    }
}
    public class stackDataStruture{
        public static void main(String args[]) {
            MyStack stack = new MyStack();
            stack.push(5);
            stack.push(15);
            stack.push(25);
            stack.push(35);
            stack.push(45);
            stack.push(55);
            stack.display();
            stack.pop();
            stack.pop();
            System.out.println("After popping:");
            stack.display();
            stack.peek();
            // Scanner scanner = new Scanner(System.in);
            // System.out.println("Stack operation: 1. Push 2. Pop 3. Peek 4. Display 5. Exit");
            // while(true) {
            //     System.out.println("Enter your choice:");
            //     int choice = scanner.nextInt();
            //     switch(choice) {
            //         case 1:
            //         System.out.println("Enter the element to push:");
            //         int value = scanner.nextInt();
            //         stack.push(value);
            //         break;
            //         case 2:
            //         stack.pop();
            //         break;
            //         case 3:
            //         stack.peek();
            //         break;
            //         case 4:
            //         stack.display();
            //         break;
            //         case 5:
            //         System.exit(0);
            //         break;
            //         default:
            //         System.out.println("Invalid choice! Please enter a valid choice");
            //         break;
            //     }
            // }
        }
    }
