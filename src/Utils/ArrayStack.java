package Utils;
import Models.Mahasiswa;
import java.util.EmptyStackException;

public class ArrayStack {

    private Mahasiswa[] stack;
    private int top;

    public ArrayStack (int capacity){
        stack = new Mahasiswa[capacity];
    }
    public void push (Mahasiswa employee){
        if(top == stack.length){
            Mahasiswa[] newArray = new Mahasiswa[2 * stack.length];
            System.arraycopy(stack, 0, newArray, 0, stack.length);
            stack = newArray;
        }
        stack[top++] = employee;
    }
    public Mahasiswa pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        Mahasiswa employee = stack[--top];
        stack[top] = null;
        return employee;
    }
    public Mahasiswa peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return stack[top-1];
    }
    public boolean isEmpty(){
        return top == 0;
    }
    public int size(){
        return top;
    }
    public void printStack(){
        for(int i = top-1; i>= 0; i--){
            System.out.println(stack[i]);
        }
    }
}