import java.util.Stack;
import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack_Assigment {
    public static void main(String[] args) {
        // Create a stack of integers
        stack<Integer>   S1= new stack<>();

        // Push some elements
        S1.push_waxkusoodar(100);
        S1.push_waxkusoodar(200);
        S1.push_waxkusoodar(300);

        // Display the stack
        S1.display();

        // Peek at the top element
        System.out.println("Top element (peek): " + S1.peek_waxsooaqri());

        // Pop an element
        System.out.println("Popped element: " + S1.pop_waxkasaar());

        // Display again after popping
        S1.display();

        // Push another element
        S1.push_waxkusoodar(40);
        S1.push_waxkusoodar(50);

        // Display final stack
        S1.display();

        // Show size
        System.out.println("Current stack size: " + S1.size());

        // Check if empty
        System.out.println("Is the stack empty? " + S1.isEmpty());
    }
}

class stack<T> {
    private static final int CONSTANT = 3;
    private int Kor;
    private T[] ArryVariable;

    // No-arg constructor
    stack() {
        this(CONSTANT);
    }

    stack(int Value_inizialize) {
        Kor = 0;
        ArryVariable= (T[]) (new Object[Value_inizialize]);
    }

    // size
    public int size() {
        return Kor;
    }

    // push method
    public void push_waxkusoodar(T element_value) {
        if (size() == ArryVariable.length)
            Expand();
        ArryVariable[Kor] = element_value;
        Kor++;
    }

    // pop method
    public T pop_waxkasaar() {
        if (isEmpty())
            throw new EmptyStackException();
        else {
            T Result = ArryVariable[--Kor];
            ArryVariable[Kor] = null;
            return Result;
        }
    }

    // peek method
    public T peek_waxsooaqri() {
        if (isEmpty())
            throw new EmptyStackException();
        else
            return ArryVariable[Kor - 1];
    }

    // isEmpty method
    public boolean isEmpty() {
        return Kor == 0;
    }

    // expand method balaari wayay
    public void Expand() {
        ArryVariable = Arrays.copyOf(ArryVariable, ArryVariable.length * 2);
    }

    // display method
    public void display() {
        if (isEmpty())
            throw new EmptyStackException();
        else {
            System.out.println("The element of the Stack is :");
            for (int x = 0; x <Kor; x++)
                System.out.print(ArryVariable[x] + " ");
            System.out.println();
        }
    }

}
