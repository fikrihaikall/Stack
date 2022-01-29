package Utils;

import Models.Mahasiswa;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedStack {
    private LinkedList<Mahasiswa> stack;

    public LinkedStack(){
        stack = new LinkedList<Mahasiswa>();
    }

    public void push (Mahasiswa employee){
        stack.push(employee);
    }

    public Mahasiswa pop(){
        return stack.pop();
    }

    public Mahasiswa peek(){
        return stack.peek();
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public int size(){
        return stack.size();
    }

    public void printStack(){
        ListIterator<Mahasiswa> iterator = stack.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}