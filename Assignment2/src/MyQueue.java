
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class MyQueue {
    LinkedList<Object> head;
    public MyQueue(){
        head = new LinkedList();
    }
    public boolean isEmpty(){
        return head.isEmpty();
    }
    public void enqueue(Object obj){
        head.addLast(obj);
    }
    public Object dequeue(){
        if(isEmpty()) return null;
        return head.removeFirst();
    }
    public void clear(){
        head = null;
    }
    public Object front(){
        if(isEmpty()) return null;
        return head.getFirst();
    }
}

